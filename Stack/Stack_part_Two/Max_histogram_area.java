package Stack.Stack_part_Two;

import java.util.Stack;

public class Max_histogram_area {
    public static void maxArea(int arr[]) {
        int maxA = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        // Next samller Right : Tc = O(n)
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);

        }
        // Next samller Left : Tc = O(n)
        stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);

        }
        // Current Area: Width = j - i - 1: nsr[i] - nsl[i] -1 : Tc = O(n)
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxA = Math.max(currArea, maxA);
        }
        System.out.println("Max Area of histogram: " + maxA);
    }

    // Time Complexity: =O(n)+O(n)+O(n) = O(n)

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maxArea(arr);
    }
}
