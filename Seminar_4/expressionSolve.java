package Seminar_4;

import java.util.Stack;

public class expressionSolve {
    public static void main(String[] args) {
        String expression = "((((1+2)+3)*4)/(5+((6*7)/10)))";
        expressionSolver(expression);
    }

    private static void expressionSolver(String expression) {
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (Character.isDigit(expression.charAt(i))) {
                String number = "" + expression.charAt(i);
                for (int j = i + 1; j < expression.length(); j++) {
                    if (Character.isDigit(expression.charAt(j))) {
                        number += expression.charAt(j);
                        i = j;
                    } else {
                        break;
                    }
                }
                operands.push(Double.parseDouble(number)); // parse String to Dounle

            } else if (expression.charAt(i) == '*' || expression.charAt(i) == '/'
                    || expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                operators.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                char op = operators.pop();
                if (op == '*') {
                    operands.push(operands.pop() * operands.pop());
                } else if (op == '/') {
                    operands.push(1 / operands.pop() * operands.pop());
                } else if (op == '+') {
                    operands.push(operands.pop() + operands.pop());
                } else if (op == '-') {
                    operands.push(-operands.pop() + operands.pop());
                }
            }
            // print stack for check ups
            // System.out.println(operands);
            // System.out.println(operators);
        }
        Double answer = operands.pop();
        if (operands.empty() && operators.empty()) {
            System.out.println("\n" + expression + " = " + answer + "\n");
        } else {
            System.out.println("\nThere is a problem in the expression, check it!\n");
        }
    }
}