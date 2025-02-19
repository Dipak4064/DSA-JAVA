package Map;
import java.util.HashMap;
import java.util.Set;
public class majorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // if (map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     map.put(arr[i], 1);
            // }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // Set<Integer> keys = map.keySet();
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
                return;
            }
        }
    }
}
