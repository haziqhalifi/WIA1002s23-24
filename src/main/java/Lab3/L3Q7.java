package Lab3;

import java.util.Scanner;

public class L3Q7 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a 3x3 Markov Matrix:");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = key.nextDouble();
            }
        }
        System.out.println("Is this a Markov Matrix? " + isMarkovMatrix(matrix));

    }

    public static boolean isMarkovMatrix(double[][] m) {
        double sum;
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                if (m[j][i] < 0) {
                    return false;
                }
                sum += m[j][i];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

}
