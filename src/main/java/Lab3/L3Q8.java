package Lab3;

import java.util.ArrayList;
import java.util.Random;

public class L3Q8 {

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        //System.out.println(m.length); //5
        shuffle(m);
    }

    public static void shuffle(int[][] m) {
        Random rand = new Random();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < m.length; i++) {
            int order = rand.nextInt(5);
            while (num.contains(order)) {
                order = rand.nextInt(5);
            }
            num.add(order);
            System.out.print("(" + m[order][0] + ", " + m[order][1] + (i==4?") ":") , "));
        }

    }
}
