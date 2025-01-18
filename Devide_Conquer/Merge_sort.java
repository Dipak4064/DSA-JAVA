package Devide_Conquer;

public class Merge_sort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //kamm
        int mid = si + (ei - si) / 2; // Find the middle point and we can also the (si+ei)/2.
        mergSort(arr, si, mid);//Find the left side of the array.
        mergSort(arr, mid + 1, ei);//Find the right side of the array.
        merge(arr, si, mid, ei);//Merge the left and right side of the array.
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;//iterator for left side
        int j = mid + 1;//iterator for right side
        int k = 0;//iterator for temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = 
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            temp[k];
        }
        print(arr);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergSort(arr, 0, arr.length - 1);
    }
}
