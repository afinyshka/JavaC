package Seminar_4;

import java.util.Stack;
/*
+Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь 
*/

public class checkBrackets {

    public static void main(String[] args) {
        String exp = "{a+]}{(d*3)}";
        bracketsChecker(exp);
    }

    private static void bracketsChecker(String expression) {
        Stack<Character> inBrackets = new Stack<>();
        String exceptionText = "\nThere is a mismatch in brackets. Check the expression\n";

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{' || expression.charAt(i) == '<') {
                inBrackets.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                if (inBrackets.size() > 0 && inBrackets.peek() == '(') {
                    inBrackets.pop();
                } else {
                    System.out.println(exceptionText);
                    break;
                }
            } else if (expression.charAt(i) == '>') {
                if (inBrackets.size() > 0 && inBrackets.peek() == '<') {
                    inBrackets.pop();
                } else {
                    System.out.println(exceptionText);
                    break;
                }
            } else if (expression.charAt(i) == '}') {
                if (inBrackets.size() > 0 && inBrackets.peek() == '{') {
                    inBrackets.pop();
                } else {
                    System.out.println(exceptionText);
                    break;
                }
            } else if (expression.charAt(i) == ']') {
                if (inBrackets.size() > 0 && inBrackets.peek() == '[') {
                    inBrackets.pop();
                } else {
                    System.out.println(exceptionText);
                    break;
                }
            }
            if (i == expression.length() - 1 && inBrackets.size() == 0) {
                System.out.println("\nThe expresiion " + expression + " is correct\n");
            } else if (i == expression.length() - 1 && inBrackets.size() > 0) {
                System.out.println(exceptionText); 
            }
        }
    }
}
