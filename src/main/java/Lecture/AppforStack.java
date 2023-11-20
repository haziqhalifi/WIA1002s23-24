package Lecture;


// Stack
//BUTTOM UP
//FILO & LIFO
//1. need container to work, i.e. an array with specific size
//2. need pointer to traverse the array
//3. need some methods to operate the stack


class Stack{
    
    //declare some local variables for class stack
    int maxSize;    //max size of array
    int top;        //this is your pointer
    String arr[];   //creating an array type of String so we can push String data
    
    public Stack(){
        maxSize = 5;    //size of our array
        top = 0;        //pointer initialize to index 0
        arr = new String[maxSize];  //String class from object class
    }
    
    public boolean isEmpty(){
        if(top == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull(){
        if(top == maxSize){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void push(String data){
        if (!isFull()){     //if(top < maxSize) same meaning
            arr[top] = data;    //pushing data to arr[top]
            top++;
        }
        else{
            System.out.println("The stack is already full!!!");
        }
    }
    
    public String pop(){
        if(!isEmpty()){
            String temp = peek();
            arr[top-1] = null;
            top--;
            return temp;
        }
        else{
            System.out.println("The stack is already empty!!!");
            return null;
        }
    }
    
    public String peek(){
        if(!isEmpty()){
            return arr[top-1];           
        }
        else{
            System.out.println("The stack is already empty!!!");
            return null;
        }
    }
    
    public void display(){
        for (int i = 0; i < top; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    
}
public class AppforStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push("tomato");
        stack1.push("cucumber");
        stack1.push("banana");
        stack1.push("grape");
        stack1.push("watermelon");
        stack1.push("durian");
        stack1.display();
        
        System.out.println("\nPeek");
        System.out.println(stack1.peek());     
        
        System.out.println("\nPop");
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }
}
