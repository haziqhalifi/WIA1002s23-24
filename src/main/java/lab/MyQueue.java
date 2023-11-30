/* Question 1 & 2
 * week7
 * Author: Haziq Halifi;
 */
package lab;

import java.util.Scanner;

public class MyQueue<T> {

    int head;
    int tail;
    int maxSize;
    int balance;
    T[] arr;

    MyQueue() {
        this.head = 0;
        this.tail = 0;
        this.maxSize = 15;
        this.balance = 1000;
        arr = (T[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        return tail == 0;
    }

    public boolean isFull() {
        return tail == maxSize;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return arr[head];

        }
    }

    public void enqueue(T value) {
        if (isFull()) {
            System.out.println("The queue is full.");
        } else {
            arr[tail] = value;
            tail++;
            //System.out.println("Enqueue: " + value);
            //System.out.print(value + " --> ");
        }
    }

    //Q1
//    public void dequeue() {
//        if (isEmpty()) {
//            System.out.println("The queue is empty.");
//        } else {
//            System.out.println("Dequeue: " + arr[head]);
//            for (int i = 0; i < tail; i++) {
//                arr[i] = arr[i + 1];
//            }
//            tail--;
//        }
//    }
    //Q4
    public T dequeue() {
        if (isEmpty()) {
            //System.out.println("The queue is empty.");
        } else {
            T element = arr[head];
            for (int i = 0; i < tail; i++) {
                arr[i] = arr[i + 1];
            }
            tail--;
            return element;
        }
        return null;
    }

    public void display() {
        System.out.println("Displaying all elements in queue...");
        int i = 0;
        for (T s : arr) {
            System.out.println("Element " + i + ": " + s);
            i++;
        }
    }

    public int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Not enough money!");
        } else {
            balance -= amount;
        }
        return balance;
    }

    public int deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount to deposit!");
        } else {
            balance += amount;
        }
        return balance;
    }

    public static void main(String[] args) {
        // Question 1
//        MyQueue q = new MyQueue();
//        System.out.println("Is it empty? " + q.isEmpty());
//        System.out.println("Is it full? " + q.isFull());
//        q.enqueue("Hari");
//        q.enqueue("ini");
//        q.enqueue("Rabu");
//        q.enqueue(80);
//        q.enqueue(true);
//        q.display();
//        q.dequeue();
//        q.display();
//        System.out.println("Peek an element from queue: " + q.peek());
//        System.out.println("Is it empty? " + q.isEmpty());

        // Question 2
        //int amount;
        MyQueue q2 = new MyQueue();
        Scanner key = new Scanner(System.in);
        System.out.println("Enter transactions : ");
        String input = key.nextLine();
        String[] trans = input.split(" \\| ");
        for (int i = 0; i < trans.length; i++) {
            if (trans[i].contains("W")) {
                q2.enqueue(trans[i]);
                String[] v = trans[i].split("W ");
                int amount = Integer.parseInt(v[1]);
                q2.withdraw(amount);
            } else if (trans[i].contains("D")) {
                q2.enqueue(trans[i]);
                String[] v = trans[i].split("D ");
                int amount = Integer.parseInt(v[1]);
                q2.deposit(amount);
            }
        }
        System.out.println("Final balance: " + q2.balance);

    }

}
