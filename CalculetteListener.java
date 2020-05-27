// Generated from Calculette.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculetteParser}.
 */
public interface CalculetteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculetteParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculetteParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(CalculetteParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(CalculetteParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculetteParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculetteParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CalculetteParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CalculetteParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalculetteParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalculetteParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CalculetteParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CalculetteParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#tantque}.
	 * @param ctx the parse tree
	 */
	void enterTantque(CalculetteParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#tantque}.
	 * @param ctx the parse tree
	 */
	void exitTantque(CalculetteParser.TantqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(CalculetteParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(CalculetteParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#pour}.
	 * @param ctx the parse tree
	 */
	void enterPour(CalculetteParser.PourContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#pour}.
	 * @param ctx the parse tree
	 */
	void exitPour(CalculetteParser.PourContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(CalculetteParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(CalculetteParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalculetteParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalculetteParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#logique}.
	 * @param ctx the parse tree
	 */
	void enterLogique(CalculetteParser.LogiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#logique}.
	 * @param ctx the parse tree
	 */
	void exitLogique(CalculetteParser.LogiqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(CalculetteParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(CalculetteParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#fonction}.
	 * @param ctx the parse tree
	 */
	void enterFonction(CalculetteParser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#fonction}.
	 * @param ctx the parse tree
	 */
	void exitFonction(CalculetteParser.FonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CalculetteParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CalculetteParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CalculetteParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CalculetteParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#entreesortie}.
	 * @param ctx the parse tree
	 */
	void enterEntreesortie(CalculetteParser.EntreesortieContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#entreesortie}.
	 * @param ctx the parse tree
	 */
	void exitEntreesortie(CalculetteParser.EntreesortieContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(CalculetteParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(CalculetteParser.FinInstructionContext ctx);
}