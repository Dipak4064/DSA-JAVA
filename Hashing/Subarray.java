import java.util.HashMap;

public class Subarray {
    public static void main(String[] args) {// O(n)
        // Q:->Largest subbarray with 0 sum
        int arr[] = { 15, -2, 2, -8, 1, 7, 10 };
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum,dix)
        int sum = 0;
        int len = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("largest subarray with sum as 0 => "+len);
    }
}
