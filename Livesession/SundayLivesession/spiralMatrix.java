package Livesession.SundayLivesession;

public class spiralMatrix {
    //spiral matrix searching
    public static void printSpiralMatrix(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int sr=0,sc=0,er=n-1,ec=m-1;
        int row,col;
        while(sr<=er&&sc<=ec){
            //print the starting column from sr to er
            col=sc;
            for(row=sr;row<=er && sc<=ec;row++){
                System.out.print(matrix[row][col]+",");
            }
            sc++;
            //print the ending row 
            row=er;
            for(col=sc;col<=ec&& sr<=er;col++){
                System.out.print(matrix[row][col]+",");
            }
            er--;
            //print the ending column
            col=ec;
            for(row=er;row>=sr&& sc<=ec;row--){
                System.out.print(matrix[row][col]+",");
            }
            ec--;
            //printf the starting row
            row=sr;
            for(col=ec;col>=sc&& sr<=er;col--){
                System.out.print(matrix[row][col]+",");
            }
            sr++;
            System.out.println();

        }
    }
    public static void transposeMatrix(int[][] matrix){
        int row = matrix.length;
        int col=matrix[0].length;
        /*
        //By using the another matrix there also has without using the another matrix
        int[][] copyMatrix = new int[col][row];
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                copyMatrix[c][r]=matrix[r][c];
            }
        }
        for(int r=0;r<col;r++){
            for(int c=0;c<row;c++){
                System.out.print(copyMatrix[r][c]+" ");
            }
            System.out.println();
        }
    */

    //using the temp veriable making the matrix Transpose
    int curr_c=0,curr_r=0;
    while(curr_r<row){
        int i=curr_r;
        for(int j=i;j<row;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
        curr_r++;
        curr_c++;
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(matrix[i][j]+",");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
         int[][] matrix ={
            {1,6,11,14,21},
            {2,7,12,15,25},
            {3,8,13,16,22},
            {4,9,17,19,24},
            {5,10,20,18,23}
         };
        //  printSpiralMatrix(matrix);
         transposeMatrix(matrix);
    }
}
