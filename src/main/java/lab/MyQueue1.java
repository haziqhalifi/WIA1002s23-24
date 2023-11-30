/* Question 1 & 2
 * week7
 * Author: Haziq Halifi;
 */
package lab;

import java.util.Scanner;

public class MyQueue1<T> {

    int head;
    int tail;
    int maxSize;
    int balance;
    T[] arr;

    MyQueue1() {
        this.head = 0;
        this.tail = 0;
        this.maxSize = 10;
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
            for (int i = 0; i < tail -1; i++) {
                arr[i] = arr[i + 1];
            }
            tail--;
            return element;
        }
        return null;
    }

    public void display() {
        int i = 0;
        for (T s : arr) {
            System.out.println( s);
            i++;
        }
    }





   

}
