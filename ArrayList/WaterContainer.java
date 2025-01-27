package ArrayList;

import java.util.ArrayList;

public class WaterContainer {
    /*
     * //time complexity is O(n^2)
     * //this brute force approach is not optimized
     * public static int Water(ArrayList<Integer> arr) {
     * int maxWater = 0;
     * for (int i = 0; i < arr.size(); i++) {
     * for (int j = i + 1; j < arr.size(); j++) {
     * int width = j - i;
     * int height = Math.min(arr.get(i), arr.get(j));
     * int water = width * height;
     * maxWater = Math.max(water, maxWater);
     * }
     * }
     * 
     * return maxWater;
     * }
     */
    // time complexity is O(n)
    // this optimized approach is using two pointer approach
    public static int Water(ArrayList<Integer> height) {
        int maxWater = 0;
        int Left = 0;
        int Right = height.size() - 1;
        while (Left < Right) {
            // calculate the area
            int minHeight = Math.min(height.get(Left), height.get(Right));
            int width = Right - Left;
            int water = width * minHeight;
            maxWater = Math.max(water, maxWater);
            // move the pointer
            if (height.get(Left) < height.get(Right)) {
                Left++;
            } else {
                Right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(Water(height));
    }
}
