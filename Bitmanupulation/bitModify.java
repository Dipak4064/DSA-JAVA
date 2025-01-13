package Bitmanupulation;

public class bitModify {
    //Finding the Odd and Even number by using the bit manupulation
    public static void oddEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }


    //get ith bit find the integer at ith point
    //in this code we are using the bitmask to find the ith bit. the bitmask is left shift by m times becasue we want to find the mth bit
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
        //if(newBit == 0){
        //return clearIthbit(n,m);
        //}else{
        //return setIthbit(n,m);
        //}
        //this code is more imported to prepare for interview
        n = clearIthbit(n, m);
        int bitMask = newBit << m;
        return n | bitMask;
    }

    public static int clearLastIthbit(int n, int m) {
        //int bitmask = (~-1) << m;
        int bitmask = (~0)<<m;
        return n & bitmask;
    }

    //clear the bit from ith to jth
    //where i is the starting point and j is the ending point
    //for a we clear the all the bit from ith to jth
    //for b we clear the all the bit from 0 to ith
    // The technique are written in note book
    public static int clearbitsInRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int mask = a | b;
        return n & mask;
    }

    //Finding of given number is power of 2 or not
    //if the number is power of 2 then the number is always have the only one bit set and all the other bit are unset when we and the number with the number -1 output is 0.
    //if the number is not power of 2 then the number and number-1 is not equal to 0
    //so we can use the n & (n-1) == 0
    public static boolean isPowerOf2(int n){
        return (n & (n-1)) == 0;
    }

    //Count set bit in the number.
    //this code is aleardy asked by google and amazon in the interview
    public static int countSetBit(int n){
        int count = 0;
        while(n != 0){
            // n = n & (n-1);
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    //fast exponentiation
    //this code is used to find the power of the number in the log(n) time
    public static int fastExponentiation(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(5<<3);
        System.out.println(~5);
        System.out.println(getIthbit(4,2));
        System.out.println(setIthbit(10, 2));
        System.out.println(clearIthbit(10, 1));
        System.out.println(updateIthbit(10, 0, 1));
        System.out.println(updateIthbit(10, 2, 0));
        System.out.println(clearLastIthbit(15, 2));
        oddEven(3);
        oddEven(4);
        System.out.println(clearbitsInRange(10,2,4));
        System.out.println(isPowerOf2(16));
        System.out.println(countSetBit(15));
    }

}
