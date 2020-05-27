#!bin/sh

export CLASSPATH=".:../antlr-4.7.2-complete.jar:$CLASSPATH"
java org.antlr.v4.Tool Calculette.g4
javac *.java
java org.antlr.v4.runtime.misc.TestRig Calculette "start" < $1 > code.mvap
