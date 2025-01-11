package inverted_pyramid;
public class inverted_roted_pyramid {
	public static void pyramid(int n) {

		// one way
		// for (int i = n; i >= 1; i--) {
		// for (int j = 1; j <= i; j++) {
		// System.out.print(" ");
		// }
		// for (int k = 1; k <= n - (i - 1); k++) {
		// System.out.print(k);
		// }
		// System.out.println();
		// }

		// }
		// Another way
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j >= 5 && i + j <= 10) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static void invertedHalfPattern(int n) {
		// one way
		// for (int i = n; i >= 1; i--) {
		// for (int j = 1; j <= i; j++) {
		// System.out.print(j);
		// }
		// System.out.println();
		// }

		// Another way
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void floydTrangle(int n) {
		// one way
		// int counter = 1;
		// for (int i = 1; i <= n; i++) {

		// for (int j = 1; j <= i; j++) {
		// System.out.print(counter + "\t");
		// counter++;
		// }
		// System.out.println();
		// }

		// Another Way
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(((i * (i - 1) / 2) + j) + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// pyramid(4);
		// invertedHalfPattern(5);
		floydTrangle(4);
	}
}
