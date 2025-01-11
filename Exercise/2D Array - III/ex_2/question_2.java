public class question_2 {
	public static int secondRowSum(int[][] matrix) {
		int n = matrix.length, m = matrix[0].length, sum = 0;
		// for (int row = 0; row < n; row++) {
		// for (int col = 0; col < m; col++) {
		// if (row == 1) {
		// sum += matrix[row][col];
		// }
		// }
		// }
		for (int col = 0; col < m; col++) {
			sum += matrix[1][col];
		}
		return sum;
	}

	public static void main(String[] args) {
		int matrix[][] = {
				{ 1, 4, 9 },
				{ 11, 4, 3 },
				{ 2, 2, 3 }
		};

		System.out.println(secondRowSum(matrix));
	}
}
