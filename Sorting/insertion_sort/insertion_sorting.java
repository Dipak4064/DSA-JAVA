package Sorting.insertion_sort;
public class insertion_sorting {
	public static void inserting(int[] num) {
		int n = num.length;
		// 5, 3, 2, 1, 8, 6, 7, 4
		for (int i = 1; i < n; i++) {
			int key = num[i];
			int j = i - 1;
			while (j >= 0 && num[j] > key) {
				num[j + 1] = num[j];
				j--;
			}
			num[j + 1] = key;
		}

	}

	public static void print(int[] num) {
		int n = num.length;
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + ",");
		}

	}

	public static void main(String[] args) {
		int[] num = { 5, 3, 2, 1, 8, 6, 7, 4 };
		inserting(num);
		print(num);
	}
}
