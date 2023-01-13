public class nQueensCount {
    // Count total number of ways in which we can solve n queen Problem
    public static boolean isSafe(char board[][], int row, int col) {
        // vartical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }

        }
        // digo left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // digo right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nqueen(char board[][], int row) {
        // Base case
        if (row == board.length) {
            count++;
            return;
        }
        // colmn loop
        for (int j = 0; j < board.length; j++) {
            // check queen safe
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1); // Function call
                board[row][j] = 'X'; // Backtracking Step
            }

        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("------chess board --------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nqueen(board, 0);
        System.out.println("Total way to solve n-queens is = " + count);
    }
}
