// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#functionOrData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOrData(FPParser.FunctionOrDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FPParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(FPParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FPParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#argsDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsDefinition(FPParser.ArgsDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#oneArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneArgument(FPParser.OneArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(FPParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FPParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(FPParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FPParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FPParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FPParser.ConditionContext ctx);
}