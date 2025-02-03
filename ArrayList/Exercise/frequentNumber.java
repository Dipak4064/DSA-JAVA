package ArrayList.Exercise;

import java.util.HashMap;

public class frequentNumber {
    class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == key) {
                if (mp.containsKey(nums[i + 1]) == false) {
                    mp.put(nums[i + 1], 1);
                } else {
                    mp.put(nums[i + 1], mp.get(nums[i + 1]) + 1);
                }
                if (mp.get(nums[i + 1]) > count) {
                    count = mp.get(nums[i + 1]);
                    ans = nums[i + 1];
                }
            }
        }
        return ans;
    }
}

}
