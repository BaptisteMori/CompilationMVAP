
sh run.sh $1
java -cp .:/usr/local/java/antlr-4.4-complete.jar:MVaP.jar MVaPAssembler code.mvap
java -jar MVaP.jar -d code.mvap.cbap
