public class Gridway {
    public static int gridway(int i, int j, int m, int n) {
    int w1 = gridway(i + 1, j, m, n);
    int w2 = gridway(i, j + 1, m, n);
     return 0;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(gridway(0, 0, m, n));
    }
}
