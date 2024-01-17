package tainted.CoinCon.utils;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MathUtils {

    // Evaluates an inline expression
    public static long evaluate(String text) {
        text = text.replace(",", "");
        Expression expression = new ExpressionBuilder(text).build();
        return (long) expression.evaluate();
    }

}
