public class question_3 {
	public static void transpose(int[][] matrix) {
		int n = matrix.length, m = matrix[0].length;
		int[][] transposeMatrix = new int[m][n];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				transposeMatrix[col][row] = matrix[row][col];
			}
		}
		for (int col = 0; col < m; col++) {
			for (int row = 0; row < n; row++) {
				System.out.print(transposeMatrix[col][row]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 },
				{ 4, 5, 6 }
		};
		transpose(matrix);
	}
}
