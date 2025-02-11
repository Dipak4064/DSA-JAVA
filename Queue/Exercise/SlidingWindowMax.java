package Queue.Exercise;

import java.util.Deque;
import java.util.LinkedList;

// Maximum of all subarrays of size k

public class SlidingWindowMax {
    // We have an array arr[] of size N and an integer K. Find the maximum for each
    // and every contiguous subarray of size K.

    // Brute Force Approach : Time Complexity : O(n*k) OR Iterative Approach
    static void SlidingWindowMax(int arr[], int N, int K) {
        for (int i = 0; i <= N - K; i++) {
            int max = arr[i];
            for (int j = i; j < i + K; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }

    // Efficient Approach : Time Complexity : O(n) OR Using Deque
    static void SlidingWindowMaxx(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            //for 
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peekFirst()]);
        for (int i = k; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
            System.out.print(arr[dq.peekFirst()] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int N = arr.length;
        int K = 3;
        SlidingWindowMax(arr, N, K);
        SlidingWindowMaxx(arr, N, K);
    }
}
