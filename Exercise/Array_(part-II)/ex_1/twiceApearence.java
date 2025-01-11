package SIGMA;

class twiceApearence {
	public static boolean existence(int Array[]) {
		for (int i = 0; i < Array.length - 1; i++) {
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[i] == Array[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] Array_1 = { 1, 2, 3, 1 };
		int[] Array_2 = { 1, 2, 3, 4 };
		int[] Array_3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(existence(Array_1));
		System.out.println(existence(Array_2));
		System.out.println(existence(Array_3));
	}
}