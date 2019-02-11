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
  | finInstruction {$code="";}
  ;

assignation returns [ String code, String id ]
  : IDENTIFIANT '=' expr {$id = $IDENTIFIANT.text; $code=$expr.code + "STOREG " + tableSymboles.getAdresseType($id).adresse+"\n";}
  ;

entree returns [ String code ]
  : "readln(" + expr + ")" { $code ="READ\n"; }
  ;

sortie returns [ String code ]
  : "println(" + expr + ")" { $code ="WRITE\n"; }
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
