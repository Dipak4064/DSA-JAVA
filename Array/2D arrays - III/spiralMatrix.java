public class spiralMatrix {
	public static void Spiral(int[][] matrix) {
		int startRow = 0;
		int startCol = 0;
		int endRow = matrix.length - 1;
		int endCol = matrix[0].length - 1;
		while (startRow <= endRow && startCol <= endCol) {

			// top
			for (int i = startCol; i <= endCol; i++) {
				System.out.print(matrix[startRow][i] + " ");
			}

			// right
			for (int i = startRow + 1; i <= endRow; i++) {
				System.out.print(matrix[i][endCol] + " ");
			}

			// bottom
			for (int i = endCol - 1; i >= startCol; i--) {
				// if (startRow == endRow) {
				// break;
				// }
				System.out.print(matrix[endRow][i] + " ");
			}

			// left
			for (int i = endRow - 1; i >= startRow + 1; i--) {
				// if (startCol == endCol) {
				// break;
				// }
				System.out.print(matrix[i][startCol] + " ");
			}
			startRow++;
			startCol++;
			endRow--;
			endCol--;

		}
	}

	public static int diagonal(int matrix[][]) {
		int sum = 0;
		for (int i = 0; i <= matrix.length - 1; i++) {
			for (int j = 0; j <= matrix[0].length - 1; j++) {
				if (i == j) {
					sum += matrix[i][j];
				} else if (i + j == matrix.length - 1) {
					sum += matrix[i][j];
				}
			}
		}
		// optimized way
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
			if (i != matrix.length - i - 1)
				sum += matrix[i][matrix.length - i - 1];
		}
		return sum;
	}

	// there has more effective two point to find the target value
	// ([endRow][startColumn] && [startRow][endColumn])
	// public static boolean Stair_Search(int[][] matrix, int key) {//
	// [startRow][endColumn]
	// int row = 0, col = matrix[0].length - 1;
	// while (row < matrix.length && col >= 0) {
	// if (matrix[row][col] == key) {
	// System.out.println("found key at (" + row + "," + col + ")");
	// return true;
	// } else if (key < matrix[row][col]) {
	// col--;
	// } else {
	// row++;
	// }
	// }
	// System.out.println("key is not found!");
	// return false;
	// }

	public static boolean Stair_Search(int matrix[][], int target) {// [endRow][startColumn]
		int row = matrix.length - 1, col = 0;
		while (row >= 0 && col <= matrix[0].length - 1) {
			if (matrix[row][col] == target) {
				System.out.println("the key is found at (" + row + "," + col + ")");
				return true;
			} else if (target > matrix[row][col]) {
				col++;
			} else {
				row--;
			}
		}
		System.out.println("The key is not Found!");
		return false;
	}

	// Search in sorted Array
	public static void main(String[] args) {
		int matrix[][] = {
				{ 1, 2, 3, 3 },
				{ 4, 5, 6, 6 },
				{ 7, 8, 9, 9 },
				{ 10, 11, 12, 12 }
		};
		int matrix_1[][] = {
				{ 10, 20, 30, 40 },
				{ 15, 25, 35, 45 },
				{ 27, 29, 37, 48 },
				{ 32, 33, 39, 50 }
		};
		int target = 35;
		// Spiral(matrix);
		// System.out.println(diagonal(matrix));
		// System.out.println(Stair_Search(matrix_1, 33));
		System.out.println(Stair_Search(matrix_1, target));
	}

}
