public class expo_practice {
    public static boolean sudokuSolver(int[][] board, int row, int col) {
        // base case
        if (row == 9 && col == 0) {
            return true;
        }
        // Determine the next cell to process
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        // Skip cells that are already filled
        if (board[row][col] != 0) {
            return sudokuSolver(board, nextRow, nextCol);
        }
        // Try placing digits 1-9 in the current cell
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (sudokuSolver(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int digit) {
        // check the row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit || board[i][col] == digit) {
                return false;
            }
        }
        // check the 3*3 subgrid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int table[][] = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 0, 0, 1, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        if (sudokuSolver(table, 0, 0)) {
            System.out.println("Sudoku Solved Successfully");
            printSudoku(table);
        } else {
            System.out.println("Sudoku Can't be Solved");
        }
    }
}
