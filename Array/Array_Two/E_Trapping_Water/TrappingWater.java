package E_Trapping_Water;

import java.util.*;

public class TrappingWater {
	public static int traprainWater(int height[]) {

		// calculate left max boundary
		int n = height.length;
		int[] leftMax = new int[n];
		leftMax[0] = height[0];
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				leftMax[i] = Math.max(height[i], leftMax[i - 1]);
			}
			System.out.print(leftMax[i] + ",");
		}
		System.out.println();

		// calculate right max boundary
		int[] rightMax = new int[n];
		rightMax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(height[i], rightMax[i + 1]);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(rightMax[i] + ",");
		}
		System.out.println();

		// loop
		int trapWater = 0;
		for (int i = 0; i < n; i++) {
			int waterlevel = Math.min(leftMax[i], rightMax[i]);
			trapWater = trapWater + (waterlevel - height[i]);
		}
		// waterlevel = min(leftmaxboundary,rightmaxboundary)
		// trap water=waterlevel-height[i]
		return trapWater;
	}

	public static void main(String[] args) {
		int[] height = { 4, 2, 0, 6, 3, 2, 5 };
		System.out.println(traprainWater(height));
	}
}
