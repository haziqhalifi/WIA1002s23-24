
package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        System.out.println("Enter five numbers.");
        Scanner key = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            num.add(key.nextInt());
        }
        sum(num);
        
    }
    
    public static void sum(ArrayList<Integer> num){
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += num.get(i);
        }
        System.out.println("Sum of all numbers: "+sum);
    }
}
