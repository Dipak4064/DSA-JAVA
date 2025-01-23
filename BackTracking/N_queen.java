public class N_queen{
    public static void NQueen(char board[][],int row){
        //base case
        if(row==board.length){
        printBoard(board);
        return;
        }
        //column loop
    for(int j=0;j<board.length;j++){
    board[row][j] = 'Q';
    NQueen(board,row+1);
    board[row][j] = 'x';
    }
    }
    public static void printBoard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
public static void main(String[] args) {
    int n = 2;
    char[][] board = new char[n][n];
    //initialize the board with 0
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            board[i][j] = 'X';
        }
    }
    NQueen(board, 0);
}
}