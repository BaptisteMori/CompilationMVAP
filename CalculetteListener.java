// Generated from Calculette.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculetteParser}.
 */
public interface CalculetteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull CalculetteParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull CalculetteParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(@NotNull CalculetteParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(@NotNull CalculetteParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull CalculetteParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull CalculetteParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#pour}.
	 * @param ctx the parse tree
	 */
	void enterPour(@NotNull CalculetteParser.PourContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#pour}.
	 * @param ctx the parse tree
	 */
	void exitPour(@NotNull CalculetteParser.PourContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull CalculetteParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull CalculetteParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(@NotNull CalculetteParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(@NotNull CalculetteParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(@NotNull CalculetteParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(@NotNull CalculetteParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull CalculetteParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull CalculetteParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(@NotNull CalculetteParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(@NotNull CalculetteParser.FinInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull CalculetteParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull CalculetteParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#tantque}.
	 * @param ctx the parse tree
	 */
	void enterTantque(@NotNull CalculetteParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#tantque}.
	 * @param ctx the parse tree
	 */
	void exitTantque(@NotNull CalculetteParser.TantqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(@NotNull CalculetteParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(@NotNull CalculetteParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull CalculetteParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull CalculetteParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(@NotNull CalculetteParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(@NotNull CalculetteParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#entreesortie}.
	 * @param ctx the parse tree
	 */
	void enterEntreesortie(@NotNull CalculetteParser.EntreesortieContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#entreesortie}.
	 * @param ctx the parse tree
	 */
	void exitEntreesortie(@NotNull CalculetteParser.EntreesortieContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#fonction}.
	 * @param ctx the parse tree
	 */
	void enterFonction(@NotNull CalculetteParser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#fonction}.
	 * @param ctx the parse tree
	 */
	void exitFonction(@NotNull CalculetteParser.FonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CalculetteParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CalculetteParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#logique}.
	 * @param ctx the parse tree
	 */
	void enterLogique(@NotNull CalculetteParser.LogiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#logique}.
	 * @param ctx the parse tree
	 */
	void exitLogique(@NotNull CalculetteParser.LogiqueContext ctx);
}