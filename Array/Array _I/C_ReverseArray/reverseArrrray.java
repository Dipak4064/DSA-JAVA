package C_ReverseArray;

public class reverseArrrray {
	public static void reverse(int num[]) {
		int start = 0;
		int end = num.length - 1;
		while (start < end) {
			int temp = num[end];
			num[end] = num[start];
			num[start] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverse(num);
	}

}
