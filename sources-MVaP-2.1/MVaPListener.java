// Generated from sources-MVaP-2.1/MVaP.g4 by ANTLR 4.4

    import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MVaPParser}.
 */
public interface MVaPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MVaPParser#commande2}.
	 * @param ctx the parse tree
	 */
	void enterCommande2(@NotNull MVaPParser.Commande2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#commande2}.
	 * @param ctx the parse tree
	 */
	void exitCommande2(@NotNull MVaPParser.Commande2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MVaPParser#instr1}.
	 * @param ctx the parse tree
	 */
	void enterInstr1(@NotNull MVaPParser.Instr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#instr1}.
	 * @param ctx the parse tree
	 */
	void exitInstr1(@NotNull MVaPParser.Instr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MVaPParser#instr2}.
	 * @param ctx the parse tree
	 */
	void enterInstr2(@NotNull MVaPParser.Instr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#instr2}.
	 * @param ctx the parse tree
	 */
	void exitInstr2(@NotNull MVaPParser.Instr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MVaPParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(@NotNull MVaPParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(@NotNull MVaPParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MVaPParser#commandeSaut}.
	 * @param ctx the parse tree
	 */
	void enterCommandeSaut(@NotNull MVaPParser.CommandeSautContext ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#commandeSaut}.
	 * @param ctx the parse tree
	 */
	void exitCommandeSaut(@NotNull MVaPParser.CommandeSautContext ctx);
	/**
	 * Enter a parse tree produced by {@link MVaPParser#saut}.
	 * @param ctx the parse tree
	 */
	void enterSaut(@NotNull MVaPParser.SautContext ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#saut}.
	 * @param ctx the parse tree
	 */
	void exitSaut(@NotNull MVaPParser.SautContext ctx);
	/**
	 * Enter a parse tree produced by {@link MVaPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MVaPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MVaPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MVaPParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull MVaPParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull MVaPParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MVaPParser#commande1}.
	 * @param ctx the parse tree
	 */
	void enterCommande1(@NotNull MVaPParser.Commande1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#commande1}.
	 * @param ctx the parse tree
	 */
	void exitCommande1(@NotNull MVaPParser.Commande1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MVaPParser#instr2f}.
	 * @param ctx the parse tree
	 */
	void enterInstr2f(@NotNull MVaPParser.Instr2fContext ctx);
	/**
	 * Exit a parse tree produced by {@link MVaPParser#instr2f}.
	 * @param ctx the parse tree
	 */
	void exitInstr2f(@NotNull MVaPParser.Instr2fContext ctx);
}