
public class Recursion_Practice {

    public static void Decreasing(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.out.print(n + ",");
        Decreasing(n - 1);
    }

    public static void Increasing(int n) {
        if (n == 0) {
            System.out.print(n + ",");
            return;
        }
        Increasing(n - 1);
        System.out.print(n + ",");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumNatural(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNatural(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Find out the given array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    //Find the first occurence of the key in the array
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    //Find the last occurence of the key in the array
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccurence(arr, key, i - 1);
    }

    //Find the power of N By using the recursion
    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * Power(x, n - 1);
    }

    //Optimized Power of N
    public static int OptimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = OptimizedPower(x, n / 2);
        int fullpower = halfpower * halfpower;
        if (n % 2 != 0) {
            return x * halfpower * halfpower;
        }
        return fullpower;
    }

    public static void main(String[] args) {
        // Decreasing(5); 
        // Increasing(5);
        // System.out.println("The factorial is "+factorial(5));
        // System.out.println("The sum of natural numbers is " + sumNatural(5));
        // System.out.println("The fibonacci series is " + fibonacci(5));
        //     int arr[] = { 1, 2, 3, 4, 5 };
        //     System.out.println(isSorted(arr, 0));

        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, arr.length-1));
        // System.out.println(Power(2, 5));
        System.out.println(OptimizedPower(2, 5));
    }

}
