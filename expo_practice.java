import java.util.Scanner;

public class expo_practice {
    public static void NQueen(char[][] board, int row) {
        if (row == board.length) {
            // calling printBoard Method
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            // if isSafe give true in execute
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                NQueen(board, row + 1);
                board[row][j] = 'X';

            }
        }
    }

    // Finding the current place of queen will appropriate or not
    public static boolean isSafe(char[][] board, int row, int col) {
        // upper case
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // left diagonal case
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right diagonal case
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // print the accurate board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Board size");
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        NQueen(board, 0);

    }
}
