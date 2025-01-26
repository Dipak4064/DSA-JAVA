import java.util.ArrayList;

public class opitimizedGridway {
    public static void gridway(String arr, String ans, ArrayList<String> uniquePaths) {
        // base case
        if (arr.length() == 0) {
            if (!uniquePaths.contains(ans)) {
                uniquePaths.add(ans);
                System.out.println(ans);
            }
            return;
        }
        for (int i = 0; i < arr.length(); i++) {
            char curr = arr.charAt(i);
            String newStr = arr.substring(0, i) + arr.substring(i + 1, arr.length());
            gridway(newStr, ans + curr, uniquePaths);
        }
    }

    public static void main(String[] args) {
        String arr = "DDRR";
        ArrayList<String> uniquePaths = new ArrayList<>();
        gridway(arr, "", uniquePaths);
    }
}