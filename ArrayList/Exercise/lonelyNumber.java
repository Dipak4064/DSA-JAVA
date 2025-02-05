package ArrayList.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonelyNumber {
    public static List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(nums[i]) == false) {
                mp.put(nums[i], 1);
            } else {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(nums[i] - 1) == false && mp.containsKey(nums[i] + 1) == false && mp.get(nums[i]) == 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 6, 5, 8 };
        System.out.println(findLonely(nums));
    }
}