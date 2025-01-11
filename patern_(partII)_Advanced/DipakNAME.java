public class DipakNAME {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i < 5; i++) {
			for (j = 1; j < 5; j++) {
				if (i == 1 || i == 4 || j == 2 || j == 4) {
					System.out.print("*");
				}
				if (i == 2 || i == 3) {
					if (i + j == 3 || i + j == 4 || i + j == 5 || i + j == 6) {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();

		// I
		for (i = 1; i < 6; i++) {
			for (j = 1; j < 6; j++) {
				if (i == 1 || i == 5 || j == 3) {
					System.out.print("*");
				}
				if (i == 2 || i == 3 || i == 4) {
					if (i + j == 3 || i + j == 4 || i + j == 5 || i + j == 6) {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();

		// P
		for (i = 1; i < 7; i++) {
			for (j = 1; j < 6; j++) {
				if (i == 1 || j == 1 || i == 4) {
					System.out.print("*");
				}
				if (i == 2 || i == 3) {
					if (i + j == 7 || i + j == 8 || i + j == 4 || i + j == 5 || i + j == 6) {
						System.out.print(" ");
					}

					if (i + j == 7) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		System.out.println();

		// A
		for (i = 0; i < 10; i++) {
			for (j = 0; j <= 10 / 2; j++) {
				// Print '*' at the boundaries and the middle row
				if ((j == 0 || j == 10 / 2) && i != 0 || i == 0 && j != 10 / 2 || i == 10 / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
