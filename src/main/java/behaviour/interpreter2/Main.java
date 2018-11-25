package behaviour.interpreter2;

import behaviour.interpreter2.expressions.MinusExpression;
import behaviour.interpreter2.expressions.MultiplyExpression;
import behaviour.interpreter2.expressions.NumberExpression;
import behaviour.interpreter2.expressions.PlusExpression;

public class Main {
    public static void main(String[] args) {
        String nOperator = "+";
        String numbers = "1+12";
        if (isOperator(nOperator)) {

            Expression leftExpression = new NumberExpression(Character.getNumericValue(numbers.charAt(0)));
            Expression rightExpression = new NumberExpression( Character.getNumericValue(numbers.charAt(numbers.length()-1)));

            Expression operator = getOperatorInstance(nOperator, leftExpression, rightExpression);
            int result = operator.interpret();
            System.out.println(result);
        }
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static Expression getOperatorInstance(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new MinusExpression(left, right);
            case "*":
                return new MultiplyExpression(left, right);
            default:
                return new MultiplyExpression(left, right);
        }
    }
}
