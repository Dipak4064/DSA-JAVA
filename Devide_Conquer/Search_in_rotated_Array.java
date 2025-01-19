package Devide_Conquer;

public class Search_in_rotated_Array {

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        //kaam
        int mid = si + (ei - si) / 2;//(si+ei)/2
        //case found
        if (arr[mid] == tar) {
            return mid;
        }
        //mid on L1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[ei]) {
                //case a: left
                return search(arr, tar, si, mid - 1);
            } else {
                //case b: right
                return search(arr, tar, mid + 1, ei);
            }
        } //mid on L2
        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                //case c: right
                return search(arr, tar, mid + 1, ei);
            } else {
                //case d: left
                return search(arr, tar, si, mid + 1);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
