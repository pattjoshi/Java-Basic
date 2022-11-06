public class Transopse {

    // Write a program to FindTransposeofa Matrix
    // What is Transpose?
    // Transpose of a matrix is the process ofswapping therows to columns. For a 2x3
    // matrix

    // Print matrix

    public static void main(String[] args) {
        int row = 2, col = 3;
        int[][] matrix = { { 2, 3, 7 }, { 5, 6, 7 } };

        // Print orginal matrix
        PrintMatrix(matrix);

        // transpose matrix
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println();
        // Print transposed matrix
        PrintMatrix(transpose);

    }

    public static void PrintMatrix(int matrix[][]) {
        System.out.println("The matrix are");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
