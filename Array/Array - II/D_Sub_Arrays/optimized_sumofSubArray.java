public class optimized_sumofSubArray {
	// Time & space complexcity O(n^3)
	public static void bruteforce1(int num[]) {
		int max_sum = Integer.MIN_VALUE;
		int n = num.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += num[k];
				}
				// System.out.print(sum + ",");
				if (max_sum < sum) {
					max_sum = sum;
				}
			}
			// System.out.println();
		}
		System.out.println("brute force && max_sum O(n^3) =" + max_sum + "\n\n");
	}

	// Time & space complexcity O(n^2)
	public static void bruteforce2(int num[]) {
		int max_sum = Integer.MIN_VALUE;
		int n = num.length;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += num[j];
				// System.out.print(sum + ",");
				if (max_sum < sum) {
					max_sum = sum;
				}
			}
			// System.out.println();
		}
		System.out.println("brute force && max_sum O(n^2) =" + max_sum + "\n\n");
	}

	// Time & space complexcity O(n^2) PREFIX
	public static void prefix(int num[]) {
		int max_sum = Integer.MIN_VALUE;
		int n = num.length;
		int[] prefix = new int[n];
		prefix[0] = num[0];
		int cursum = 0;

		// prefix
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				// calculating prefix
				prefix[i] = prefix[i - 1] + num[i];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				cursum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
				if (max_sum < cursum) {
					max_sum = cursum;
				}
			}
		}
		System.out.println("brute force && max_sum O(n^3) = max(" + max_sum + ")\n\n");
	}

	// Time & space complexcity O(n) KADANE'S
	public static void kadanes(int num[]) {
		int n = num.length;
		int ms = Integer.MIN_VALUE;
		int cs = 0;
		for (int i = 0; i < n; i++) {
			cs += num[i];
			if (cs < 0) {
				cs = 0;
			}
			ms = Math.max(cs, ms);
		}
		System.out.println("brute force && max_sum O(n) = max(" + ms + ")\n\n");

	}

	// kadanes for negative value
	public static void kadanes1(int num1[]) {
		int n = num1.length;
		int maxsum = num1[0];
		int curr = num1[0];
		for (int i = 1; i < n; i++) {
			curr = Math.max(num1[i], curr + num1[i]);
			maxsum = Math.max(maxsum, curr);
		}
		System.out.println("brute force && max_sum O(n) = max(" + maxsum + ")\n\n");

	}

	public static void main(String[] args) {
		int[] num = { 2, 4, 6, 8, 10 };
		int[] num1 = { -10,-2, -3, -8, -7, -9, -5 };
		// bruteforce1(num);
		// bruteforce2(num);
		// prefix(num);
		// kadanes(num);
		kadanes1(num1);
	}
}
