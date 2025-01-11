package extraActivities.aggrisiveCow;

import java.util.Arrays;

public class Cowplacing {
    public static boolean isPossible(int[] arr, int n, int c, int minAllowedDist) {
        int cow = 1, lastStallPo = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] - lastStallPo >= minAllowedDist) {
                cow++;
                lastStallPo = arr[i];
            }
            if(cow==c){
                return true;
            }
        }
        return false;
    }

    public static int getDistance(int[] arr, int n, int c) {
        Arrays.sort(arr);
        int st = 1, end = arr[n - 1] - arr[0];
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isPossible(arr, n, c, mid)) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 9};
        int n = arr.length, c = 3;
        System.out.println(getDistance(arr, n, c));
    }
}
