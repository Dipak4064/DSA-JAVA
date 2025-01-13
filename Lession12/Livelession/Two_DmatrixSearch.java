package Lession12.Livelession;

public class Two_DmatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7,9},
            {10, 11, 16, 20, 21},
            {23, 30, 34, 60, 70},
            {70, 80, 90, 100, 110}
        };
        int target = 15;
        System.out.println(searchMatrix(matrix, target));
    }
    //Finding the Elemen in matrix by using the leaner Search
    //we are finding the length of row and column by knowing about the jacked array which is written in rough book
    //matrix.length only pointing to length of row
    //matrix[0].length only pointing to length of column of indx zero row. we are zero index because all the matrix has the zero index
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(matrix[r][c]==target){
                    return true;
                }
            }
        }
        return false;
    }
    
}
