#!bin/sh

java org.antlr.v4.Tool Calculette.g4
javac *.java
#/home/etudiants/data/l3/compil/AutoCor.sh Calculette.g4 MainCalculette.java Table*.java AdresseType.java
grun Calculette "start" < $1 > code.mvap
