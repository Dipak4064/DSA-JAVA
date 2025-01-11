public class linearsearch {
	public static void SearchLinear(int numm[], int n) {
		for (int i = 0; i < numm.length; i++) {
			if (numm[i] == n) {
				System.out.println("target found at " + i + " index!");
			}
		}
	}

	public static void SearchFruit(String fruit[], String tar) {
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i].equals(tar)) {
				System.out.println("find fruit at " + i + " index!");
			}
		}
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6 };
		String[] fruit = { "apple", "banana", "caphal", "graph" };
		int target = 6;
		String tar = "graph";
		SearchLinear(num, target);
		SearchFruit(fruit, tar);
	}
}
