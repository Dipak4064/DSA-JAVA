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
        // System.out.println(searchMatrix(matrix, target));
    }

    //1st Approach
    //Finding the Elemen in matrix by using the LEANER SEARCH
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

    //making the jacked array matrix
    //0
    //0 0
    //0 0 0
    //0 0 0 0
    public static boolean jackedArrayMatrix(int[][] matrix,int target){
        int[][] grid = new int [4][];
        for(int i=0;i<4;i++){
            grid[i]=new int[i+1];
            for(int j=0;j<i;j++){
                System.out.print(grid[i][j]+"");
            }
            System.out.println();
        }
        return false;
    }

    //making the jacked array matrix
    public static void jackedArraymatrix(int[][] matrix,int target){
        int[][] grid = new int [4][];
        grid[0]=new int[4];
        grid[1]=new int[6];
        grid[2]=new int[8];
        grid[3]=new int[10];
        for(int r=0;r<4;r++){
            for(int c=0;c<grid[r].length;c++){
                System.out.print(grid[r][c]+" ");
            }
            System.out.println();
        }
    }
    //2nd Approach
    //Finding the Elemen in matrix by using the BINERY SEARCH
    public static boolean binerySearchinMatrix(int[][] matrix,int target){
        for(int r=0;r<matrix.length;r++){
            int left=0,right=matrix[0].length-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(matrix[r][mid]==target){
                    return true;
                }
                if(matrix[r][mid]<target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return false;
    }
}
