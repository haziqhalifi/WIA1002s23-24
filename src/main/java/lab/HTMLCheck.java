package lab;
/*
 * week5
 * Author: Haziq Halifi;
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HTMLCheck {

    static ArrayList<String> str = new ArrayList<>();

    public static void main(String[] args) {
        try {
            File obj = new File("C:\\Users\\user\\OneDrive - Universiti Malaya\\Documents\\! Universiti Malaya\\SE SEM 3\\WIA1002 - Data Structure\\Tutorial & Lab\\week 5\\sample.txt");
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains("<") && line.contains(">")) {
                    push(line);
                    display();
                }
                if (line.contains("</") && line.contains(">")) {
                    String close = getClosingTag(line);
                    System.out.println("Found an ending tag: " + close);
                    if (peek().equalsIgnoreCase(close)) {
                        pop();
                        display();
                    } else {
                        System.out.println("Error");
                    }
                }
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found babe!");
        }
    }

    public static void push(String a) {
        str.add(a);
        System.out.println("Pushing into stack: " + a);
    }

    public static void pop() {
        System.out.println("The ending tag is correct.");
        str.remove(str.size() - 1);
    }

    public static String peek() {
        return str.get(str.size() - 1);
    }

    public static void display() {
        System.out.print("Current stack: [");
        for (String s : str) {
            System.out.print(s + ", ");
        }
        System.out.println("]");
    }

    public static String getClosingTag(String line) {
        int startIdx = line.indexOf("</") + 2;
        int endIdx = line.indexOf(">", startIdx);
        return line.substring(startIdx, endIdx);
    }
}
