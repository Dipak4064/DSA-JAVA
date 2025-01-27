package ArrayList;

import java.util.ArrayList;

public class pairSum {
    // Unoptimized approach
    // Time Complexity O(N^2)
    public static boolean UpairSum(ArrayList<Integer> arr, int target) {
        System.out.println("Brute Force Approach:");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target) {
                    return true;
                }
            }
        }
        return false;

    }

    // Optimized approach && Two pointer approach
    // Time Complexity O(N)
    public static boolean OpairSum(ArrayList<Integer> arr, int target) {
        System.out.println("Two Pointer Approach:");
        int Left = 0;
        int Right = arr.size() - 1;
        while (Left < Right) {
            if (arr.get(Left) + arr.get(Right) > target) {
                Right--;
            } else {
                Left--;
            }
            if (arr.get(Left) + arr.get(Right) == target) {
                System.out.println("index = " + Left + "," + Right);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int target = 5;
        System.out.println(UpairSum(arr, target));
        System.out.println(OpairSum(arr, target));
    }
}
