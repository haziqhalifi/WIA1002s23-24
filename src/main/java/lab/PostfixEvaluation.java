/*
 * week5
 * Author: Haziq Halifi;
 */

package lab;

public class PostfixEvaluation {

    
    public static void main(String[] args) {
        
        System.out.println("1 2 + 3 + 10 - = " +evaluatePostfix("1 2 j 3 + 10 -"));
    }
    
    public static int evaluatePostfix(String expression){
        MyStack stack2 = new MyStack();
        String[] word = expression.split(" ");
        int result = 0;
        String operator = "";
        int j =0;
        for (int i = 0; i < word.length; i++) {
            if(word[i].contains("+") || word[i].contains("-") ||word[i].contains("*")||word[i].contains("/")){
                 operator = word[i];
                 result = performCalculation(stack2.pop(), stack2.pop(),operator);
                    stack2.push(result);
            } else{               
                stack2.push((Integer.parseInt(word[i])));
            }
        }
        
        return result;
    }
    
    public static int performCalculation(int num1, int num2, String operator){
        switch(operator){
            case "+": return num1+num2;
            case "-": return num1-num2;
            case "*": return num1*num2;
            case "/": return num1/num2;
            default : throw new IllegalArgumentException("It is not valid operator");
        }
    }

}