import java.util.HashMap;

public class MultiSubarrary {
    public static void main(String[] args) {//tc O(n) sc O(n)
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println("Number of subarrays with sum as " + k + " => " + ans);
    }
}
