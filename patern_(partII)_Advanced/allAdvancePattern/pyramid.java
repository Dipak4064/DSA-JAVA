package allAdvancePattern;
public class pyramid {
	public static void printPyramid(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			// int end = 2 * i - 1;
			// int number = 0;
			// while (end > 0) {
			// if (end >= i) {
			// number++;
			// System.out.print(number);
			// } else {
			// number--;
			// System.out.print(number);
			// }
			// end--;
			// }
			int number = 1;
			boolean increase = true;
			while (number > 0) {
				System.out.print(number);
				if (number == i) {
					increase = false;
				}
				if (increase == true) {
					number++;
				} else {
					number--;
				}
			}

			System.out.println();
		}
	}

	public static void hollowGram(int n) {
		int end = 2 * n - 1;
		int spaces = 1;
		for (int row = 1; row <= end; row++) {
			if (row < n) {
				for (int i = 0; i < n - row; i++) {
					System.out.print(" ");
				}
			} else {
				for (int i = 0; i < row - n; i++) {
					System.out.print(" ");
				}
			}

			if (row == 1 || row == end) {
				System.out.print("*");
			} else {
				System.out.print("*");
				for (int j = 0; j < spaces; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				if (row < n) {
					spaces += 2;
				} else {
					spaces -= 2;
				}
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		int n = 6;
		printPyramid(n);
		hollowGram(5);
	}
}
