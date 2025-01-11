package extraActivities.Book_Allocation;

public class book {
    public static boolean isValid(int[] book, int n, int m, int maxpage){
        int stu=1,page=0;
        for(int i=0;i<n;i++){
            if(book[i]>maxpage){
                return false;
            }
            if(page+book[i]<=maxpage){
               page+=book[i];
            }else{
                stu++;
                page=book[i];
            }
        }
        return stu>m?false:true;
    }
    public static int bookallocating(int[] book, int n, int m) {
        if(m>n){
            return -1;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=book[i];
        }
        int start=0;
        int end=sum;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(book,n,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] book = {1, 2, 3, 4, 5};
        int n = book.length;
        int m = 2;
        System.out.println(bookallocating(book, n, m));
    }
}
