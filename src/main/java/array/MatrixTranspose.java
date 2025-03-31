package array;

public class MatrixTranspose {
    public static void main(String[] args) {
        // Static matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int rows = matrix.length;         // Number of rows in original matrix
        int cols = matrix[0].length;      // Number of columns in original matrix
        int[][] transpose = new int[cols][rows]; // Transposed matrix

        // Transpose logic: Swap rows and columns
        for (int i = 0; i < rows; i++) {                    //transpose's rows
            for (int j = 0; j < cols; j++) {                //transpose's cols
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
