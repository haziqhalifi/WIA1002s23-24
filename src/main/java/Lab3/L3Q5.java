package Lab3;

import java.util.Scanner;

public class L3Q5 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a 4X4 integer array: ");
        int[][] intArr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                intArr[i][j] = key.nextInt();
            }
        }

        System.out.println("Location: ("+locateSmallest(intArr)[0]+", "+locateSmallest(intArr)[1]+")");

    }

    public static int[] locateSmallest(int[][] a) {
        int min = a[0][0];
        int[] location = new int[2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(a[i][j] < min){
                    min = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}
