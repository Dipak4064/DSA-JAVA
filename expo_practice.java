
public class expo_practice {

    public static int fibboNacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int p = fibboNacci(n - 1);
        int l = fibboNacci(n - 2);
        int ans = p + l;
        return ans;
    }

    public static void main(String[] args) {
        int x = 2, n = 6;
        // System.out.println(OptimizedPower(n));
        int M = fibboNacci(n);
        // System.out.println(fibboNacci(n));
        System.out.println(M);
    }
}
