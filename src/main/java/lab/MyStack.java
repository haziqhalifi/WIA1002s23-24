package lab;

/**
 *
 * @author Haziq Halifi
 */
public class MyStack {

    int maxSize;
    int[] num;
    int arrow;

    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        stack1.push(99);
        stack1.push(88);
        System.out.println(stack1);
        System.out.println("The peek of the stack is " + stack1.peek());
        System.out.println(stack1.pop());
        System.out.println("The peek of the stack is " + stack1.peek());
        stack1.push(77);
        stack1.push(66);
        stack1.pushMany("55,44,33,22,11,00");
        stack1.push(100);
        stack1.push(111);
        System.out.println(stack1);
        System.out.println("Is the stack empty? : " + stack1.isEmpty());
        System.out.println(stack1.popAll());
        System.out.println("Is the stack empty? : " + stack1.isEmpty());
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
    }

    public MyStack() {
        arrow = 0;
        maxSize = 10;
        num = new int[maxSize];
    }

    public boolean isEmpty() {
        if (arrow == 0) {
            return true;
        }
        return false;
    }

    public int peek() {
        if (arrow == 0) {
            System.out.println("The Stack is already Empty!!!");
            return -1;
        } else {
            return num[arrow - 1];
        }

    }

    public void push(int n) {
        if (arrow >= maxSize) {
            System.out.println("The Stack is already Full!!!");
        } else {
            num[arrow] = n;
            arrow++;
            System.out.println(n + " pushed into the stack.");
        }
    }

    public void pushMany(String n) {
        if (arrow >= maxSize) {
            System.out.println("The Stack is already Full!!!");
        } else {
            int[] numArray = new int[10];
            String[] strArray = n.split(",");
            for (int i = 0; i < strArray.length; i++) {
                numArray[i] = Integer.parseInt(strArray[i]);
                num[arrow] = numArray[i];
                System.out.println(numArray[i] + " pushed into the stack.");
                arrow++;
            }
            System.out.println("All the numbers pushed into the stack.");
        }
    }

    public int pop() {
        if (arrow > 0) {
            int temp = num[arrow - 1];
            num[arrow - 1] = -1;
            arrow--;
            return temp;
        } else {
            System.out.println("The Stack is already Empty!!!");
            return -1;
        }
    }

    public String popAll() {
        if (arrow == 0) {
            return "The Stack is already Empty!!!";

        } else {
            String text = "The list of elements in the stack :";
            for (int i = 0; i < arrow; i++) {
                text += "\n" + num[i];
            }
            for (int i = 0; i < arrow; i++) {
                num[i] = -1;
            }
            arrow = 0;
            return text;
        }
    }

    public String toString() {
        String text = "The elements of stack:";
        for (int i = 0; i < arrow; i++) {
            text += "\n" + num[i];
        }
        return text;
    }
}
