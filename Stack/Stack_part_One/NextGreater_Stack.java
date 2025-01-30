package Stack.Stack_part_One;

import java.util.Stack;

public class NextGreater_Stack {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // while
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            // if else
            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[stack.peek()];
            }
            // push
            stack.push(i);
        }
        for (int j = 0; j < nextGreater.length; j++) {
            System.out.print(nextGreater[j] + " ");
        }
        System.out.println();
        // next Greater Right
        // next Greater Left --> for this we need to change the loop from 0 to n

        // next Smaller Right --> for this we need to change only while loop condition from <= to >= arr[stack.peek()] >= arr[i]

        // next Smaller Left --> for this we need to change the loop from 0 to n and while loop condition from <= to >=
    }
}
