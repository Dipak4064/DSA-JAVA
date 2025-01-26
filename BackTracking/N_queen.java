public class N_queen {
    public static void findPermutation(char board[][], int row) {
        // Base case
        System.out.println("row: " + row);
        if (row == board.length) {
            printboard(board);
            return;
        }
        // Recursive case
        for (int j = 0; j < board.length; j++) {
            System.out.println(row + " " + j);
            board[row][j] = 'Q';
            findPermutation(board, row + 1);
            System.out.println(row + " " + j + "-->i am Empty");
            board[row][j] = 'x';
        }

    }

    public static void printboard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        // initialize the board with 'x'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        findPermutation(board, 0);
    }
}
