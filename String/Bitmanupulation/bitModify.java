package String.Bitmanupulation;

public class bitModify {
    //get ith bit find the integer at ith point
    public static int getIthbit(int n, int m) {
        int bitmask = 1 << m;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    //set ith bit
    public static int setIthbit(int n, int m) {
        int bitmask = 1 << m;
        return n | bitmask;
    }

    //Clear ith bit
    public static int clearIthbit(int n, int m) {
        int bitmask = ~(1 << m);
        return n & bitmask;
    }

    //Update ith bit
    public static int updateIthbit(int n, int m, int newBit) {
//        if(newBit == 0){
//            return clearIthbit(n,m);
//        }else{
//            return setIthbit(n,m);
//        }
        n = clearIthbit(n, m);
        int bitMask = newBit << m;
        return n | bitMask;
    }

    public static int clearLastIthbit(int n, int m) {
//        int bitmask = (~-1) << m;
        int bitmask = (~0)<<m;
        return n & bitmask;
    }

    public static void main(String[] args) {
//        System.out.println(5<<3);
//        System.out.println(~5);
//        System.out.println(getIthbit(4,2));
//        System.out.println(setIthbit(10, 2));
//        System.out.println(clearIthbit(10, 2));
//        System.out.println(updateIthbit(10, 0, 1));
//        System.out.println(updateIthbit(10, 2, 0));
        System.out.println(clearLastIthbit(15, 2));

    }

}
