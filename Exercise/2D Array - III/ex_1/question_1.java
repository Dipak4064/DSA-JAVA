public class question_1 {
	public static int FindTarget(int[][] matrix, int key) {
		int n = matrix.length, m = matrix[0].length;
		int count = 0;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				if (key == matrix[row][col]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int matrix[][] = {
				{ 4, 7, 8 },
				{ 8, 8, 7 }
		};
		System.out.println(FindTarget(matrix, 7));
	}

}
