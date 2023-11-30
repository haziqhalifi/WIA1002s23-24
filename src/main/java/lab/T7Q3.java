/*
 * week7
 * Author: Haziq Halifi;
 */
package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class T7Q3 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\OneDrive - Universiti Malaya\\Documents\\! Universiti Malaya\\SE SEM 3\\WIA1002 - Data Structure\\Tutorial & Lab\\Week 7 & 8\\lab7q3.txt");

        MyQueue p = new MyQueue();
        MyQueue p03 = new MyQueue();
        MyQueue p02 = new MyQueue();
        MyQueue p04 = new MyQueue();
        MyQueue p09 = new MyQueue();

        //Product Code in Queue
        Scanner scanner = new Scanner(file);
        System.out.print("Product Code in Queue: ");
        ArrayList<String> check = new ArrayList<>();
        while (scanner.hasNext()) {
            String next = scanner.next();
            if (next.contains("P0")) {
                if (!check.contains(next)) {
                    p.enqueue(next);
                    check.add(next);
                }
            }
        }

        //P03
        Scanner scanner1 = new Scanner(file);
        System.out.println("\nProduct: P03");
        while (scanner1.hasNext()) {
            if (scanner1.next().contains("P03")) {
                p03.enqueue(scanner1.next());
            }
        }

        //P02
        Scanner scanner2 = new Scanner(file);
        System.out.println("\nProduct: P02");
        while (scanner2.hasNext()) {
            if (scanner2.next().contains("P02")) {
                p02.enqueue(scanner2.next());
            }
        }

        //P04
        Scanner scanner3 = new Scanner(file);
        System.out.println("\nProduct: P04");
        while (scanner3.hasNext()) {
            if (scanner3.next().contains("P04")) {
                p04.enqueue(scanner3.next());
            }

        }

        //P09
        Scanner scanner4 = new Scanner(file);
        System.out.println("\nProduct: P09");
        while (scanner4.hasNext()) {
            if (scanner4.next().contains("P09")) {
                p09.enqueue(scanner4.next());
            }
        }
    }

}
