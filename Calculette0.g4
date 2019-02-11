grammar Calculette;

@parser::members {

    private Double evalexpr (Double x, String op, Double y) {
        if ( op.equals("*") ){
            return x*y;
        }else if (op.equals("/")) {
            return x/y;
        } else if ( op.equals("+") ){
            return x+y;
        } else if ( op.equals("-")) {
            return x-y;
        } else {
           System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
           throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
        }
    }

}


start
    : expr EOF { System.out.println($expr.res);}
    ;

expr returns [Double res]
    : ENTIER {$res=Double.parseDouble($ENTIER.text);}
    | '-' e=expr {$res=-1*$e.res;}
    | a=expr op=('*'|'/') b=expr {$res=evalexpr($a.res,$op.text,$b.res);}
    | a=expr op=('+'|'-') b=expr {$res=evalexpr($a.res,$op.text,$b.res);}
    | '(' e=expr ')' {$res=$e.res;}
    ;

ADDSUB
    : '+' {getText();}
    | '-' {getText();}
    ;

DIVMUL
    : '*' {getText();}
    | '/' {getText();}
    ;

// lexer
NEWLINE : '\r'? '\n'  -> skip;

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;

UNMATCH : . -> skip ;
