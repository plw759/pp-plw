// Generated from Simple.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SimpleParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SimpleParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SimpleParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SimpleParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpleParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpleParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#id_string}.
	 * @param ctx the parse tree
	 */
	void enterId_string(SimpleParser.Id_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#id_string}.
	 * @param ctx the parse tree
	 */
	void exitId_string(SimpleParser.Id_stringContext ctx);
}