package extraActivities.Book_Allocation;

public class bookAllocation {
    public static boolean isValid(int[] pages,int n,int m,int maxPages) {
        int stu=1,page=0;
        for(int i=0;i<n;i++){
            if(pages[i]>maxPages){
                return false;
            }
            if(page+pages[i]<=maxPages){
                page+=pages[i];
            }else{
                stu++;
                page=pages[i];
            }
        }
        return m<stu?false:true;
    }
    public static int findmaxAllocation(int[] Pages,int n,int m) {
        if(m>n){
            return -1;
        }
        int sum=0;
        for(int i=0; i<n;i++){
            sum += Pages[i];
        }
        int start=0;
        int end = sum;
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if( isValid(Pages,n,m,mid) ){
                ans = mid;
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] pages={ 12,34,67,90 };
        int n = 4;
        int m = 2;
        System.out.println(findmaxAllocation(pages,n,m));
    }
}
