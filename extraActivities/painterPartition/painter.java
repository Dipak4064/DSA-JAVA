package extraActivities.painterPartition;

public class painter {
    public static boolean isValid(int[] arr,int n, int m, int maxpaint){
        int place=1,time=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxpaint){
                return false;
            }
            if(time+arr[i]<=maxpaint){
                time+=arr[i];
            }else{
                place++;
                time=arr[i];
            }
        }
        return place>m?false:true;
    }
    public static int painting(int[] arr, int n, int m) {
        if (m > n) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int start = 0;
        int end = sum;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {40, 30, 10, 20};
        int n = arr.length, m = 2;

        System.out.println(painting(arr, n, m));
    }
}
