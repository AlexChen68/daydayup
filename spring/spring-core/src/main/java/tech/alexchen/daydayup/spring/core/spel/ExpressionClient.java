package tech.alexchen.daydayup.spring.core.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author alexchen
 */
public class ExpressionClient {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("1 + 1");
        System.out.println(exp.getValue());
    }
}
