
sh run.sh $1
java -cp .:../antlr-4.7.2-complete.jar:MVaP.jar MVaPAssembler code.mvap
java -jar MVaP.jar -d code.mvap.cbap
