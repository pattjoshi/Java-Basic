public class DigonalSum {

    // Brote force
    public static int Digonal_brs(int matrix[][]) { // 0(n^2)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Optimal solution
    public static int digonal_sum(int matrix[][]) { // 0(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // SD
            if (i != matrix.length - i - 1)
                sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(digonal_sum(matrix));
    }
}

// Primary Digonal = i = j
// SecondaryDigonal = i + j = n-1
