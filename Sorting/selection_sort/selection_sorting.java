package Sorting.selection_sort;
public class selection_sorting {
	public static void selectionSort(int[] num) {
		int n = num.length - 1;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i; j <= n; j++) {
				if (num[min] > num[j]) {
					min = j;
				}
			}
			int temp = num[min];
			num[min] = num[i];
			num[i] = temp;
		}
	}

	public static void print(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] num = { 5, 4, 3, 2, 1 };
		selectionSort(num);
		print(num);
	}

}
