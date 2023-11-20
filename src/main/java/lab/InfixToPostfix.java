//NEED REVISION
/*
 * week5
 * Author: Haziq Halifi;
 */

package lab;


import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "((((A-B)+((M^N)*(O+P)))-((Q/(R^S))*T))+Z)";
        System.out.println(toPostfix(str));
    }

    public static String toPostfix(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression";
                else
                    stack.pop();
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    if (stack.peek() == '(')
                        return "Invalid Expression";
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    public static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
