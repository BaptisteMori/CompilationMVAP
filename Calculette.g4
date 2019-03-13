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

      { int entry = nextLabel(); $code += "JUMP " + entry + "\n"; }
      NEWLINE*

      (fonction { $code += $fonction.code; })*
      NEWLINE*

      { $code += "LABEL " + entry + "\n"; }

      (instruction { $code += $instruction.code; })*
      { $code += "HALT\n"; }
  ;

expr returns [String code, String type]
  : ENTIER {$code="PUSHI "+ $ENTIER.getText() + "\n";}
  | IDENTIFIANT { $code="PUSHG "+tableSymboles.getAdresseType($IDENTIFIANT.text).adresse + "\n";}
  | '-' e=expr {$code="PUSHI 0\n" + $e.code + "SUB\n";}
  | a=expr op=('*'|'/') b=expr {$code=evalexpr($a.code,$op.text,$b.code);}
  | a=expr op=('-'|'+') b=expr {$code=evalexpr($a.code,$op.text,$b.code);}
  | '(' e=expr ')' {$code=$e.code;}
  | IDENTIFIANT '(' args ')'                  // appel de fonction
    {$code="PUSHI 0\n"+$args.code+"CALL "+tableSymboles.getFonction($IDENTIFIANT.text).adresse+"\n";
  $type=tableSymboles.getFonction($IDENTIFIANT.text).type;}
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
  | bloc finInstruction {$code=$bloc.code; }
  | RETOUR expr finInstruction {$code=$expr.code + "STOREL " + tableSymboles.getAdresseType("return").adresse + "\n";}
  | finInstruction {$code="";}
  ;

assignation returns [ String code, String id ]
  : IDENTIFIANT '=' expr {$id = $IDENTIFIANT.text; $code=$expr.code + "STOREG " + tableSymboles.getAdresseType($id).adresse+"\n";}
  ;

tantque returns [String code]
  : 'while' '(' logique ')' instruction { int label1 = nextLabel(); int label2= nextLabel(); $code="LABEL " +
   label1 + "\n" + $logique.code + "JUMPF " + label2 + "\n" + $instruction.code + "JUMP " + label1 + "\nLABEL " +
  label2 + "\n"; }
  ;

si returns [String code]
  : 'if' '(' logique ')' then=instruction 'else' sinon=instruction
    {int iflabel = nextLabel(); int endlabel = nextLabel();
    $code=$logique.code + "JUMPF " + iflabel + "\n" + $then.code + "JUMP " + endlabel + "\nLABEL " + iflabel + "\n" + $sinon.code + "LABEL " + endlabel + "\n";  }
  | 'if' '(' logique ')' then=instruction
    {int iflabel = nextLabel();
    $code=$logique.code + "JUMPF " + iflabel + "\n" + $then.code + "\nLABEL " + iflabel + "\n";}
  ;

pour returns [String code]
  :'for' '(' init=assignation ';' logique ';' cont=assignation ')' instruction
  { int forlabel = nextLabel(); int endlabel = nextLabel();
    $code=$init.code + "LABEL " + forlabel + $logique.code + "\nJUMPF " + endlabel+ "\n" + $instruction.code + $cont.code + "JUMP " + forlabel + "\nLABEL " + endlabel + "\n"; }
  ;

dowhile returns [String code]
  : 'repeat' bloc 'until' '(' logique ')'
  { int dolabel = nextLabel();
    $code="LABEL " + dolabel + "\n" + $bloc.code + $logique.code + "\nJUMPF " + dolabel + "\n"; }
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
  | NOT c=condition { $code = $c.code+"PUSHI 1\nNEQ\n";}
  ;

logique returns [ String code]
  : condition AND a=logique {$code = $condition.code + $a.code + "MUL\n"; }
  | condition OR a=logique {$code = $condition.code + $a.code + "\nNEQ\n";}
  | condition {$code=$condition.code;}
  | NOT '(' c=condition ')' {$code=$c.code + "\nPUSHI 1\nNEQ\n";}
  ;

bloc returns [String code]
  @init{ $code = new String();}
  : '{' instruction* '}' {$code+=$instruction.code;}
  ;

fonction returns [ String code ]
  @init{ tableSymboles.newTableLocale();} // instancier la table locale
  @after{ $code+="RETURN\n"; tableSymboles.dropTableLocale();} // détruire la table locale
      : TYPE IDENTIFIANT
          {int label = nextLabel();
          $code="LABEL " + label + "\n";
          tableSymboles.nouvelleFonction($IDENTIFIANT.text, label, $TYPE.text);
          tableSymboles.putVar("return", $TYPE.text);}
          '('  params ? ')' bloc {$code+=$bloc.code;}
      ;

params
    : TYPE IDENTIFIANT
    {tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);}
    ( ',' TYPE IDENTIFIANT
    {tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);}
    )*
    ;

// init nécessaire à cause du ? final et donc args peut être vide (mais $args sera non null)
args returns [ String code, int size]
@init{ $code = new String(); $size = 0; }
    : ( expr
    {
      $code+=$expr.code+"\n";
      $size+=1;
        // code java pour première expression pour arg1
    }
    ( ',' expr
    {
      $code+=$expr.code+"\n";
      $size+=1;
        // code java pour expression suivante pour argi
    }
    )*
      )?
    ;

entreesortie returns [ String code ]
  : 'readln' '(' IDENTIFIANT ')' { $code ="READ\nSTOREG "+tableSymboles.getAdresseType($IDENTIFIANT.text).adresse+"\n"; }
  | 'println' '(' expr ')' { $code =$expr.code+"WRITE\nPOP\n"; }
  ;


finInstruction
  : (';'| NEWLINE)+
  ;

// lexer
TYPE : 'int' | 'float' ;

NEWLINE : '\r'? '\n';

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;

AND : 'and' | '&&' ;

OR : 'or' | '||' ;

NOT : 'not' | '!' ;

RETOUR : 'return';

IDENTIFIANT
:   (('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*);

UNMATCH : . -> skip ;
