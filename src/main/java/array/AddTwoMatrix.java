package array;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int m1[][] = new int[rows][cols];
        int m2[][] = new int[rows][cols];
        System.out.println("Enter 1st matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("1st matrix is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter 2nst matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m2[i][j] = sc.nextInt();
            }

        }
        System.out.println("Addition of 2 matrix is:");
        // int sum[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //   sum[i][j] = m1[i][j] + m2[i][j];
                System.out.print(m1[i][j] + m2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
Enter number of rows: 2
Enter number of columns: 2

Enter 1st matrix elements:
        1 2
        3 4
1st matrix is:
        1 2
        3 4
Enter 2nst matrix elements:
        5 6
        7 8
Addition of 2 matrix is:
        6 8
        10 12
 */