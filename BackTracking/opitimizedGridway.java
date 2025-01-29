public class opitimizedGridway {
    public static void gridway(String arr, String ans) {
        // base case
        if (arr.length() == 0) {
            if (isValidPath(ans)) {
                System.out.println(ans);
            }
            return;
        }
        for (int i = 0; i < arr.length(); i++) {
            char curr = arr.charAt(i);
            String newStr = arr.substring(0, i) + arr.substring(i + 1, arr.length());
            gridway(newStr, ans + curr);
        }
    }

    public static boolean isValidPath(String path) {
        int x = 0, y = 0;
        for (char move : path.toCharArray()) {
            if (move == 'D') {
                x++;
            } else if (move == 'R') {
                y++;
            }
            // Assuming a 2x2 grid, change the condition for different grid sizes
            if (x > 1 || y > 1) {
                return false;
            }
        }
        return x == 1 && y == 1;
    }

    public static void main(String[] args) {
        String arr = "DRDR";
        gridway(arr, "");
    }
}