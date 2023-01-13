
public class nQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // vartical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void nqueens(char board[][], int row) {
        // Base
        if (row == board.length) {
            // printBoard(board);
            count++;
            return;
        }
        // colmn loop
        for (int j = 0; j < board.length; j++) {
            // check queen safe
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueens(board, row + 1); // Function call
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

        nqueens(board, 0);
        System.out.println(count);
    }
}
