package Exercise.RECURSION;

public class Exercise {

    //Question No 1.
    //For a giveni nteger array of size N.You have to find all the occurrences(indices) of a given element(Key)and print them. Use a recursive function to solve this problem
    public static void countingOccurences(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println("the is index " + (i + 1));
        }
        countingOccurences(arr, i + 1, key);
    }

    //Question 2 :You are given a number (eg -  2019), convert it into a String of english like “two zero one nine”.  Use a recursive function to solve this problem. NOTE-The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
    public static void convertNumberToString(int n) {
        String numbeString[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (n == 0) {
            return;
        }

        int lastdigit = n % 10;
        convertNumberToString(n / 10);
        System.out.print(numbeString[lastdigit] + " ");
    }

    //Question 3 :Write a program to findLength of aStringusing Recursion
    public static int findLengthOfString(String str, int idx) {
        if (idx == str.length()) {
            return 0;
        }
        return 1 + findLengthOfString(str, idx + 1);
    }

    //Question4:We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character
    public static int countSubstrings(String str, int si, int ei) {
        if (si > ei) {
            return 0;
        }
        int removingFirst = countSubstrings(str, si + 1, ei);
        int removingLast = countSubstrings(str, si, ei - 1);
        int removeDuplicate = countSubstrings(str, si + 1, ei - 1);
        int ans = removingFirst + removingLast - removeDuplicate;
        if (str.charAt(si) == str.charAt(ei)) {
            ans++;
        }
        return ans;
    }
     

    //power of honoi    
    public static void toh(int n, int A, int B, int C) {
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        toh(n - 1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        toh(n - 1, B, A, C);
    }

    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // countingOccurences(arr, 0, 3);
        // convertNumberToString(20190);
        // System.out.println(findLengthOfString("hello", 0));
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstrings(str, 0, n));
        // toh(3, 10, 20, 30);

    }
}
