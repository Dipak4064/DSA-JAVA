public class waterTrapping {
	public static void watertrap(int height[]) {
		int n = height.length;
		int[] helper = new int[n];
		int[] helper2 = new int[n];
		helper2[n - 1] = height[n - 1];
		helper[0] = height[0];

		// presenting the helper array
		for (int i = 1; i < n; i++) {
			helper[i] = Math.max(height[i], helper[i - 1]);
		}
		for (int i = n - 2; i >= 0; i--) {
			helper2[i] = Math.max(height[i], helper2[i + 1]);
		}

		// pring the array

		for (int i = 0; i < n; i++) {
			System.out.print(helper[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(helper2[i] + ",");
		}

		int containwater = 0;
		// find the minimum
		for (int i = 0; i < n; i++) {
			int waterLevel = Math.min(helper[i], helper2[i]);
			containwater = containwater + (waterLevel - height[i]);
		}
		System.out.println();
		System.out.println("Trap water " + containwater);
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int[] height1 = { 4, 2, 0, 3, 2, 5 };
		watertrap(height);
		watertrap(height1);
	}
}
