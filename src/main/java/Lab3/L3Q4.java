
package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class L3Q4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter ten integers; ");
        for (int i = 0; i < 10; i++) {
            list.add(key.nextInt());
        }
        
        displayNumber(list);
    }
    
    public static void displayNumber(ArrayList<Integer> list){
        ArrayList<Integer> printList = new ArrayList<>();
        for(Integer num : list){
            if(!printList.contains(num)){
                printList.add(num);
            }
        }
        System.out.print("Output: ");
        for(Integer num : printList){            
            System.out.print(num);
            System.out.print(" ");
        }
    }
}
