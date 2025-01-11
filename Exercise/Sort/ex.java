package Exercise.Sort;

public class ex {
	// BUBBLE SORT
	public static void BubblesortingExercise(int[] num) {
		int n = num.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.print(num[i] + ",");
		}
		System.out.println();
	}

	// SELECTION SORT
	public static void SelectionSortingExercise(int[] num) {
		int n = num.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i; j < n; j++) {
				if (num[min] < num[j]) {
					min = j;
				}
			}
			int temp = num[min];
			num[min] = num[i];
			num[i] = temp;
			System.out.print(num[i] + ",");
		}
		System.out.println();
	}

	// INSERTION SORT
	public static void insertionSortingExercise(int[] num) {
		int n = num.length;
		// int index = 0;
		for (int i = 1; i < n; i++) {
			int key = num[i];
			int prev = i - 1;
			while (prev >= 0 && num[prev] > key) {
				num[prev + 1] = num[prev];
				prev--;
				// index++;
			}
			num[prev + 1] = key;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println();
	}

	// COUNTING SORT
	public static void CountingSortingExercise(int[] num) {
		int n = num.length;
		System.out.println(n);
		int large = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			large = Math.max(large, num[i]);
		}
		int[] count = new int[large + 1];
		for (int i = 0; i < n; i++) {
			count[num[i]]++;
		}
		// sorting
		int idx = 0;
		for (int i = 0; i < n - 1; i++) {
			while (count[i] > 0) {
				num[idx] = i;
				idx++;
				count[i]--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] num = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
		BubblesortingExercise(num);
		SelectionSortingExercise(num);
		insertionSortingExercise(num);
		CountingSortingExercise(num);

	}

}
