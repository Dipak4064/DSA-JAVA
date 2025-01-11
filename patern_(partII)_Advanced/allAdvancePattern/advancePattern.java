public class advancePattern {
	public static void hollow(int n) {
		System.out.println("Hollow_Rectangle!");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void inverted_halfPyramid(int n) {
		System.out.println("Inverted half PYRAMID!");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void inverted_halfPyramidWithNumber(int n) {
		System.out.println("invertedHalf Pyramid with NUMBER!");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void Floyd_Trangle(int n) {
		System.out.println("Foyd's Trangle");
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + "\t");
				count++;
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void Zero_One_Trangle(int n) {
		System.out.println("Zero One Trangle!");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void Butterfly(int n) {
		System.out.println("ButterFly!");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 2 * (n - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 2 * (n - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void solidRhomBus(int n) {
		System.out.println("Solid RhomBus!");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void solid_Hollow_RhomBus(int n) {
		System.out.println("Hollow_RhomBus!");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void Diamond(int n) {
		System.out.println("Diamond Image!");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 2 * i - 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void MissingNumberPyramid(int n) {
		System.out.println("pallindromic Number Pyramid!");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void pallindromicPyramid(int n) {
		System.out.println("pallindrome Pyramid!");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		hollow(5);
		inverted_halfPyramid(5);
		inverted_halfPyramidWithNumber(5);
		Floyd_Trangle(5);
		Zero_One_Trangle(5);
		Butterfly(7);
		solidRhomBus(5);
		solid_Hollow_RhomBus(5);
		Diamond(4);
		MissingNumberPyramid(5);
		pallindromicPyramid(5);
	}
}
