package Array.Array_II.G_Rotated_sorted_Arrays;
//Advanced Version of Binary search
//Rotated sorted Array
public class Rotated_sorted {

	// TC = O(logn)
	// // public static int search(int num[], int tar) {
	// 	int end = num.length - 1;
	// 	int start = 0;
	// 	while (start <= end) {
	// 		int mid = start + (end - start) / 2;

	// 		if (tar == num[mid]) {
	// 			return mid;
	// 		}
	// 		if (num[start] <= num[mid]) {// left half sorted
	// 			if (tar <= num[mid] && tar >= num[start]) {
	// 				end = mid - 1;
	// 			} else {
	// 				start = mid + 1;
	// 			}

	// 		} else {// right half sorted
	// 			if (tar >= num[mid] && tar <= num[end]) {
	// 				start = mid + 1;
	// 			} else {
	// 				end = mid - 1;
	// 			}
	// 		}
	// 	}
	// 	return -1;
	// }
	

	// another way to do
	public static int search(int num[], int target) {
		int min = smallElement(num);
		System.out.println(min);
		int right = num.length - 1;
		int left = 0;
		if (num[min] <= target && target <= num[right]) {
			return search(num, min, right, target);// right half sorted;
		} else {
			return search(num, left, min - 1, target);// left half sorted;
		}
		// return -1;

	}

	public static int search(int num[], int min, int right, int target) {
		int l = min;
		int r = right;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (target == num[mid]) {
				return mid;
			}
			if (num[mid] < target && num[r] > target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}

		}
		return -1;
	}

	public static int smallElement(int num[]) {
		int right = num.length - 1;
		int left = 0;
		while (left < right) {

			int mid = left + (right - left) / 2;

			if (num[mid] > num[mid + 1] && num[mid] > num[right]) {
				return mid + 1;
			} else if (num[mid] > num[mid - 1] && num[mid] >= num[right]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			if (num[left] <= num[right]) {
				return 0; // Array is already sorted
			}

		}
		return left;
	}

	public static void main(String[] args) {
		int[] num = { 4, 5, 6, 7, 0, 1, 2 };
		int[] num2 = { 4, 5, 6, 7, 0, 1, 2 };
		int[] num3 = { 1 };
		int tar = 0;
		int tar2 = 3;
		int tar3 = 0;
		System.out.println(search(num, tar));
		// System.out.println(search(num2, tar2));
		// System.out.println(search(num3, tar3));
	}

}
