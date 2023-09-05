// Generated from Simple.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SimpleParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SimpleParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SimpleParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#id_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_string(SimpleParser.Id_stringContext ctx);
}