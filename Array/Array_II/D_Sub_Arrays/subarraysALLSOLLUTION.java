public class subarraysALLSOLLUTION {
	public static void totalsubArray(int num[]) {
		int n = num.length;
		int totalArrays = n * (n + 1) / 2;
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(num[k] + ",");
				}
				System.out.println();
			}
		}
		System.out.println("the toal Array is == " + totalArrays + "\n\n");
	}

	public static void totalpairSum(int num[]) {
		int n = num.length;
		int totalpair = n * (n - 1) / 2;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				System.out.print("(" + num[i] + "," + num[j] + ")");
			}
			if (i < num.length - 1) {
				System.out.println();
			}
		}
		System.out.print("Total pair of Array is = " + totalpair + "\n\n\n");
	}

	public static void sumSubArray(int num[]) {
		int max_sum = Integer.MIN_VALUE;
		int maxx_sum = Integer.MIN_VALUE;

		for (int i = 0; i < num.length; i++) {
			// int sumarray = new int[50];
			for (int j = i; j < num.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += num[k];
				}
				System.out.print(sum + ",");
				if (sum > max_sum) {
					max_sum = sum;
				}
				if (sum > maxx_sum) {
					maxx_sum = sum;
				}
				System.out.print("\t");
			}
			System.out.println("the max sum is " + max_sum);
			max_sum = 0;
			System.out.println();
		}
		System.out.println("the maxx_sum in all subarraysum = " + maxx_sum + "\n\n");
	}

	// finding the large value at SubArray
	public static void largestAmong_SubArray(int num[]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(num[k]);
				}
				System.out.print("\t");

				int largest = Integer.MIN_VALUE;
				for (int k = i; k <= j; k++) {
					if (largest < num[k]) {
						largest = num[k];
					}
				}
				System.out.print("the largest is = " + largest);
				System.out.println();
			}
			System.out.println();
		}
	}

	// Brute Force for finding max sum in subarray by creating NEW ARRAY
	public static void findlargeSumInSubarray(int num[]) {
		int subArrayCount = (num.length * (num.length + 1)) / 2; // Total number of subarrays
		int[] sumArray = new int[subArrayCount];
		int index = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += num[k];
				}
				sumArray[index++] = sum; // Store the sum of the current subarray
			}
		}

		// Find the maximum sum in the sumArray
		for (int sum : sumArray) {
			if (sum > maxSum) {
				maxSum = sum;
			}
		}

		System.out.println("The largest sum among all subarrays is: " + maxSum);
		System.out.println();
	}

	// Brute Force for finding max sum in subarray
	public static void now(int num[]) {
		int n = num.length;
		int totalsubArray = n * (n + 1) / 2;
		int index = 0;
		int max_sum = Integer.MIN_VALUE;
		int[] subarray = new int[totalsubArray];

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += num[k];
				}
				subarray[index++] = sum;
			}
		}

		System.out.println("All the sum of Sub Arrays!");
		for (int i = 0; i < subarray.length; i++) {
			System.out.print(subarray[i] + ",");
			if (subarray[i] > max_sum) {
				max_sum = subarray[i];
			}
		}
		System.out.println();
		System.out.println("the largest sum is ----->" + max_sum + "\n");

	}

	public static void main(String[] args) {
		int[] num = { 2, 4, 6, 8, 10 };
		// totalsubArray(num);
		// totalpairSum(num);
		// sumSubArray(num);
		// largestAmong_SubArray(num);
		// findlargeSumInSubarray(num);
		now(num);

	}

}
