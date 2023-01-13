public class nqueenPrint1Soln {
    public static boolean isSafe(char board[][], int row, int col) {
        // varticaly
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diog left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= board.length; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diog right up
        for (int i = row - 1, j = col + 1; i >= 0 && j > board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nqueens(char board[][], int row) {
        // Base
        if (row == board.length) {

            count++;
            return true;
        }
        // colmn loop
        for (int j = 0; j < board.length; j++) {
            // check queen safe
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nqueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X'; // Backtracking Step
            }

        }
        return false;
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

        if (nqueens(board, 0)) {
            System.out.println("solution is possible ");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }

    }
}
