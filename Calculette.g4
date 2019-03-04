grammar Calculette;

@parser::members {
    private TablesSymboles tableSymboles = new TablesSymboles();

    private String evalexpr (String x, String op, String y) {
        String res = x+y;
        if ( op.equals("*") ){
            return res+"MUL\n";
        }else if (op.equals("/")) {
            return res+"DIV\n";
        } else if ( op.equals("+") ){
            return res+"ADD\n";
        } else if ( op.equals("-")) {
            return res+"SUB\n";
        } else {
           System.err.println("Opérateur arithmétique inconnu : '" + op + "'");
           throw new IllegalArgumentException("Opérateur arithmétique inconnu : '" + op + "'");
        }
    }

    private int _label = 0;
    /** générateur de nom d'étiquettes */
    private int nextLabel() { return _label++; }
}

start
    : calcul EOF
    ;

calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise $code, pour ensuite l'utiliser comme accumulateur
@after{ System.out.println($code); }
  :   (decl { $code += $decl.code; })*

      { int entry = nextLabel(); $code += "  JUMP " + entry + "\n"; }
      NEWLINE*

      (fonction { $code += $fonction.code; })*
      NEWLINE*

      { $code += "LABEL " + entry + "\n"; }

      (instruction { $code += $instruction.code; })*
      { $code += "HALT\n"; }
  ;

expr returns [String code]
  : ENTIER {$code="PUSHI "+ $ENTIER.getText() + "\n";}
  | IDENTIFIANT { $code="PUSHG "+tableSymboles.getAdresseType($IDENTIFIANT.text).adresse + "\n";}
  | '-' e=expr {$code="PUSHI 0\n" + $e.code + "SUB\n";}
  | a=expr op=('*'|'/') b=expr {$code=evalexpr($a.code,$op.text,$b.code);}
  | a=expr op=('-'|'+') b=expr {$code=evalexpr($a.code,$op.text,$b.code);}
  | '(' e=expr ')' {$code=$e.code;}
  ;

decl returns [ String code ]
  : TYPE IDENTIFIANT '=' expr finInstruction {tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text); $code="PUSHI 0\n" + $expr.code + "STOREG " + tableSymboles.getAdresseType($IDENTIFIANT.text).adresse+"\n"; }
  |  TYPE IDENTIFIANT finInstruction {$code="PUSHI 0\n"; tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);}
  ;

instruction returns [ String code ]
  : a=assignation finInstruction {$code=$a.code;}
  | b=expr finInstruction {$code=$b.code;}
  | tantque {$code=$tantque.code;}
  | si {$code=$si.code;}
  | pour {$code=$pour.code;}
  | dowhile {$code=$dowhile.code;}
  | entreesortie finInstruction {$code=$entreesortie.code;}
  | finInstruction {$code="";}
  ;

assignation returns [ String code, String id ]
  : IDENTIFIANT '=' expr {$id = $IDENTIFIANT.text; $code=$expr.code + "STOREG " + tableSymboles.getAdresseType($id).adresse+"\n";}
  ;

tantque returns [String code]
  : 'while' '(' logique ')' bloc
  {int label1 = nextLabel(); int label2= nextLabel();
  $code="LABEL " + label1 + "\n" + $logique.code + "JUMPF " + label2 + "\n" + $bloc.code + "JUMP " + label1 + "\nLABEL " + label2 + "\n";}
  ;

si returns [String code]
  : 'if' '(' logique ')' then=bloc 'else' sinon=bloc
    {int iflabel = nextLabel(); int endlabel = nextLabel();
    $code=$logique.code + "JUMPF " + iflabel + "\n" + $then.code + "JUMP " + endlabel + "\nLABEL " + iflabel + "\n" + $sinon.code + "LABEL " + endlabel + "\n";}
  | 'if' '(' logique ')' then=bloc
  {int iflabel = nextLabel();
  $code=$logique.code + "JUMPF " + iflabel + "\n" + $then.code + "\nLABEL " + iflabel + "\n";}
  ;

pour returns [String code]
  : 'for' '(' init=assignation ';' logique ';' cont=assignation ')' bloc
  { int forlabel = nextLabel(); int endlabel = nextLabel();
    $code=$init.code + "LABEL " + forlabel + $logique.code + "\nJUMPF " + endlabel + $bloc.code + $cont.code + "JUMP " + forlabel + "\nLABEL " + endlabel + "\n"; }
  ;

dowhile returns [String code]
  : 'repeat' bloc 'until' '(' logique ')'
  { int dolabel = nextLabel();
    $code="LABEL " + dolabel + "\n" + $bloc.code + $logique.code + "\nJUMPF " + dolabel; }
  ;

condition returns [String code]
  : 'true'  { $code = "PUSHI 1\n"; }
  | 'false' { $code = "PUSHI 0\n"; }
  | a=expr '<' b=expr {$code = $a.code + $b.code + "INF\n";}
  | a=expr '<=' b=expr {$code = $a.code + $b.code + "INFEQ\n";}
  | a=expr '>' b=expr {$code = $a.code + $b.code + "SUP\n";}
  | a=expr '>=' b=expr {$code = $a.code + $b.code + "SUPEQ\n";}
  | a=expr '==' b=expr {$code = $a.code + $b.code + "EQUAL\n";}
  | a=expr ('!='|'<>') b=expr {$code = $a.code + $b.code + "NEQ\n";}
  ;

logique returns [ String code]
  : condition AND a=logique {$code = $condition.code + $a.code + "MUL\n"; }
  | condition OR a=logique {$code = $condition.code + $a.code + "\nPUSHI 0\nNEQ\n";}
  | condition {$code=$condition.code;}
  | NOT '(' condition ')' {$code=$condition.code + "\nPUSHI 1\nNEQ\n";}
  ;

bloc returns [String code]
  @init{ $code = new String();}
  : '{' instruction* '}' {$code+=$instruction.code;}
  ;

fonction returns [ String code ]
  @init{ tableSymboles.newTableLocale();} // instancier la table locale
  @after{ tableSymboles.dropTableLocale();} // détruire la table locale
      : TYPE IDENTIFIANT
          {
              // code java gérer la déclaration de "la variable" de retour de la fonction
          }
          '('  params ? ')'
          bloc
          {
              // corps de la fonction
          }
      ;

  params
      : TYPE IDENTIFIANT
          {
              // code java gérant  une variable locale (argi)
          }
          ( ',' TYPE IDENTIFIANT
              {
                  // code java gérant une variable locale (argi)
              }
          )*
      ;

   // init nécessaire à cause du ? final et donc args peut être vide (mais $args sera non null)
  args returns [ String code, int size]
  @init{ $code = new String(); $size = 0; }
      : ( expression
      {
          // code java pour première expression pour arg1
      }
      ( ',' expression
      {
          // code java pour expression suivante pour argi
      }
      )*
        )?
      ;

  expression returns [ String code, String type ]
      :  IDENTIFIANT '(' args ')'                  // appel de fonction
          {

          }
      ;

entreesortie returns [ String code ]
  : 'readln' '(' IDENTIFIANT ')' { $code ="READ\nSTOREG "+tableSymboles.getAdresseType($IDENTIFIANT.text).adresse+"\n"; }
  | 'println' '(' expr ')' { $code =$expr.code+"WRITE\nPOP\n"; }
  ;


finInstruction
  : ';'
  ;

// lexer
TYPE : 'int' | 'float' ;

IDENTIFIANT
    :   (('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*);

NEWLINE : '\r'? '\n'  -> skip;

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;

AND : 'and' | '&&' ;

OR : 'or' | '||' ;

NOT : 'not' | '!' ;

UNMATCH : . -> skip ;
