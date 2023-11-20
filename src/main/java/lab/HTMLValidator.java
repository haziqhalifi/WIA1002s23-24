package lab;
// CANNOT SOLVE : . Assume that the first line <!DOCTYPE html> is always free of error.
/*
 * week5
 * Author: Haziq Halifi;
 */

import java.io.*;
import java.util.*;

public class HTMLValidator {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\OneDrive - Universiti Malaya\\Documents\\! Universiti Malaya\\SE SEM 3\\WIA1002 - Data Structure\\Tutorial & Lab\\week 5\\sample2.txt");
        Scanner scanner = new Scanner(file);
        Stack<String> stack = new Stack<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            while (lineScanner.hasNext()) {
                String token = lineScanner.next();

                if (token.startsWith("<") && !token.startsWith("</")) {
                    String tag = token.substring(1, token.length() - 1);
                    if (!token.equalsIgnoreCase("<!DOCTYPE html>")) {
                        stack.push(tag);
                        System.out.println("Pushing into stack: " + tag);
                        System.out.println("Current Stack: " + stack);
                    }

                } else if (token.startsWith("</")) {
                    String tag = token.substring(2, token.length() - 1);
                    System.out.println("Found an ending tag: " + tag);
                    if (!stack.isEmpty() && stack.peek().equals(tag)) {
                        System.out.println("The ending tag is correct");
                        stack.pop();
                        System.out.println("Current stack: " + stack);
                    } else {
                        System.out.println("Error: " + tag);
                    }
                }
            }
            System.out.println("");
        }

        if (stack.isEmpty()) {
            System.out.println("Is the HTML file correct? true");
        } else {
            System.out.println("Is the HTML file correct? false");
        }
    }
}
