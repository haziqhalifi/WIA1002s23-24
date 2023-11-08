package Lab3;

import java.util.Scanner;

public class L3Q6 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter 4 values of a 2X2 matrix A: ");
        double [][] matrixA = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = key.nextDouble();
            }
        }
        
        System.out.print("Enter 4 values of a 2X2 matrix B: ");
        double [][] matrixB = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixB[i][j] = key.nextDouble();
            }
        }
        
        System.out.println("The addition of the two matrix result in");
        System.out.println(addMatrix(matrixA, matrixB)[0][0]+" "+addMatrix(matrixA, matrixB)[0][1]);
        System.out.println(addMatrix(matrixA, matrixB)[1][0]+" "+addMatrix(matrixA, matrixB)[1][1]);
    }
    
    public static double[][] addMatrix(double[][] a, double[][] b){
        double [][] sum = new double [2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}
