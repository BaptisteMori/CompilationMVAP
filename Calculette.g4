grammar Calculette;

@parser::members {
    private TableSymboles tableSymboles = new TableSymboles();

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

      NEWLINE*

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
  | entreesortie finInstruction {$code=$entreesortie.code;}
  | finInstruction {$code="";}
  ;

assignation returns [ String code, String id ]
  : IDENTIFIANT '=' expr {$id = $IDENTIFIANT.text; $code=$expr.code + "STOREG " + tableSymboles.getAdresseType($id).adresse+"\n";}
  ;

tantque returns [String code]
  : 'while' '(' condition ')' bloc
  {int label1 = nextLabel(); int label2= nextLabel();
  $code="LABEL " + label1 + "\n" + $condition.code + "JUMPF " + label2 + "\n" + $bloc.code + "JUMP " + label1 + "\nLABEL " + label2 + "\n";}
  ;

condition returns [String code]
  : 'true'  { $code = "PUSHI 1\n"; }
  | 'false' { $code = "PUSHI 0\n"; }
  | a=expr '<' b=expr {$code = $a.code + $b.code + "INF\n";}
  | a=expr '<=' b=expr {$code = $a.code + $b.code + "INFEQ\n";}
  | a=expr '>' b=expr {$code = $a.code + $b.code + "SUP\n";}
  | a=expr '>=' b=expr {$code = $a.code + $b.code + "SUPEQ\n";}
  | a=expr '==' b=expr {$code = $a.code + $b.code + "EQUAL\n";}
  | a=expr '!=' b=expr {$code = $a.code + $b.code + "NEQ\n";}
  ;

bloc returns [String code]
  @init{ $code = new String();}
  : '{' instruction* '}' {$code+=$instruction.code;}
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

UNMATCH : . -> skip ;
