package F_Buy_Sell_Stock;
public class stock {
	public static void sellStock(int prices[]) {
		int max_profit = 0;
		int buying_price = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (buying_price < prices[i]) {
				int profit = prices[i] - buying_price;
				max_profit = Math.max(max_profit, profit);
			} else {
				buying_price = prices[i];
			}
		}
		System.out.println("the max profit is = " + max_profit);
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		sellStock(prices);
	}
}
