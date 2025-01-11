package Sorting.couting_sort;
public class counting_sorting {
	public static void counting(int[] num) {
		int n = num.length; 
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			largest = Math.max(largest, num[i]);
		}
		int count[] = new int[largest + 1];
		for (int i = 0; i < n; i++) {
			count[num[i]]++;
		}
		// sorting
		int j = 0;
		for (int i = 0; i < n; i++) {
			while (count[i] > 0) {
				num[j] = i;
				j++;
				count[i]--;
			}
			System.out.print(num[i] + ",");
		}
	}

	public static void main(String[] args) {
		int[] num = { 1, 4, 1, 3, 2, 4, 3, 7 };
		counting(num);
	}
}
