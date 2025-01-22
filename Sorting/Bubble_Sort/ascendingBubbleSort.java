package Sorting.Bubble_Sort;

public class ascendingBubbleSort {
	public static void Bubble_sorting(int[] num) {
		int n = num.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public static void selection_Sorting(int[] num) {
		int n = num.length - 1;
		for (int i = 0; i <= n; i++) {
			int minpos = i;
			for (int j = i + 1; j <= n; j++) {
				if (num[minpos] > num[j]) {
					minpos = j;
					// System.out.print(minpos + ",");
				}
			}
			int temp = num[i];
			num[i] = num[minpos];
			num[minpos] = temp;
			// System.out.println();
			System.out.print(num[i] + " ");
		}
	}

	public static void insertion_Sorting(int[] num) {
		int n = num.length - 1;
		for (int i = 1; i < n; i++) {
			int curr = i;
			int prev = i - 1;
			while (prev >= 0 && num[prev] > num[curr]) {
				num[prev + 1] = num[prev];
				prev--;
			}
			num[prev + 1] = num[curr];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + ",");
		}
	}

	public static void main(String[] args) {
		int[] num = { 5, 4, 3, 2, 1 };
		Bubble_sorting(num);
		// selection_Sorting(num);
		// insertion_Sorting(num);

	}

}
