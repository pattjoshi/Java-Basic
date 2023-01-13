public class NQueenInNrow {
    // n queen in n row
    public static void nqueens(char board[][], int row) {
        // Base
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // colmn loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nqueens(board, row + 1); // Function call
            board[row][j] = 'X'; // Backtracking Step
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

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nqueens(board, 0);
    }
}

// row