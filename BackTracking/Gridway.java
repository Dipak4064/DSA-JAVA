public class Gridway {


    //grid way to going to the bottom right corner from top left corner
    // time complexit is O(2^(m+n))
    //this solution is not efficient and optimized
    /*
    public static int gridway(int i, int j, int m, int n) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i >= n || j >= m) {
            return 0;
        }
        int w1 = gridway(i + 1, j, m, n);
        int w2 = gridway(i, j + 1, m, n);
        return w1 + w2;
    }
    */

    //optimized solution
    //math trick for linear time
    public static int gridway(int i, int j, int m, int n){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i>=n || j>=m){
            return 0;
        }
        return gridway(i+1, j, m, n) + gridway(i, j+1, m, n);
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(gridway(0, 0, m, n));
    }
}
