import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class FPConverterVisitor extends AbstractParseTreeVisitor<String> implements FPVisitor<String>{


    @Override
    public String visitProgram(FPParser.ProgramContext ctx) {
        return ctx.value.toString();
    }

    @Override
    public String visitFunctionOrData(FPParser.FunctionOrDataContext ctx) {
        return null;
    }

    @Override
    public String visitFunction(FPParser.FunctionContext ctx) {
        return null;
    }

    @Override
    public String visitHead(FPParser.HeadContext ctx) {
        return null;
    }

    @Override
    public String visitBody(FPParser.BodyContext ctx) {
        return null;
    }

    @Override
    public String visitArgsDefinition(FPParser.ArgsDefinitionContext ctx) {
        return null;
    }

    @Override
    public String visitOneArgument(FPParser.OneArgumentContext ctx) {
        return null;
    }

    @Override
    public String visitCallFunction(FPParser.CallFunctionContext ctx) {
        return null;
    }

    @Override
    public String visitType(FPParser.TypeContext ctx) {
        return null;
    }

    @Override
    public String visitData(FPParser.DataContext ctx) {
        return null;
    }

    @Override
    public String visitExpression(FPParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public String visitExpr(FPParser.ExprContext ctx) {
        return null;
    }

    @Override
    public String visitCondition(FPParser.ConditionContext ctx) {
        return null;
    }
}
