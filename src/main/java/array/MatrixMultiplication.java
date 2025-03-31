package array;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
     /*   // Define two matrices with static values
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] m2 = {
                {7, 8, 9},
                {10, 11, 12}
        };

        // Dimensions
        int rowsA = matrixA.length;      // Number of rows in A
        int colsA = matrixA[0].length;   // Number of columns in A (must match rows of B)
        int colsB = matrixB[0].length;   // Number of columns in B
        int[][] resultMatrix = new int[rowsA][colsB];
*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of first matrix: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter columns of first matrix (same as rows of second matrix): ");
        int colsA = sc.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int colsB = sc.nextInt();

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[colsA][colsB];
        int[][] resultMatrix = new int[rowsA][colsB];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < colsA; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Multiplication logic
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Printing the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
Condition for Matrix Multiplication
If Matrix A is of size (m × n)

If Matrix B is of size (n × p)

Then, their product will be a matrix of size (m × p)

Important Rule: The number of columns in the first matrix must be equal to the number of rows in the second matrix.

A=[ 1 2 ]  B=[ 5 6 ]
  [ 3 4 ],   [ 7 8 ]

C=A×B=[ (1×5+2×7)   (1×6+2×8) ] = [19 22]
      [ (3×5+4×7)   (3×6+4×8) ]   [43 50]

 */