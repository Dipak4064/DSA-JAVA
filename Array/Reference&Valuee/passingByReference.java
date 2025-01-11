import java.util.*;

public class passingByReference {
	public static void updatearr(int arr[]) {
		arr[0] = arr[0] + 1;
		arr[1] = arr[1] + 1;
		arr[2] = arr[2] + 1;
	}

	public static void callbyvalue(int num[]) {
		int[] copiedArr = Arrays.copyOf(num, num.length);
		copiedArr[0] = copiedArr[0] + 1;
		copiedArr[1] = copiedArr[1] + 1;
		copiedArr[2] = copiedArr[2] + 1;
		System.out.println("Manupulate Passing by reference!");
		for (int i = 0; i < copiedArr.length; i++) {
			System.out.print(copiedArr[i] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// int arr[] = new int[3];
		int num[] = new int[3];
		Scanner sc = new Scanner(System.in);
		// arr[0] = 50;
		// arr[1] = 50;
		// arr[2] = 50;
		// updatearr(arr);
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr[i]);
		// }
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		sc.close();
		System.out.println("The Orginal Array!");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
		callbyvalue(num);
		System.out.println("After manupulating Array Output!");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

	}
}
