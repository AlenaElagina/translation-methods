// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FPParser}.
 */
public interface FPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#functionOrData}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOrData(FPParser.FunctionOrDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#functionOrData}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOrData(FPParser.FunctionOrDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FPParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FPParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(FPParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(FPParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FPParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FPParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#argsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArgsDefinition(FPParser.ArgsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#argsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArgsDefinition(FPParser.ArgsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#oneArgument}.
	 * @param ctx the parse tree
	 */
	void enterOneArgument(FPParser.OneArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#oneArgument}.
	 * @param ctx the parse tree
	 */
	void exitOneArgument(FPParser.OneArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(FPParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(FPParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FPParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(FPParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(FPParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FPParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FPParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FPParser.ConditionContext ctx);
}