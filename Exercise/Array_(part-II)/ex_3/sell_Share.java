import javax.management.loading.PrivateClassLoader;

public class sell_Share {
	public static void finding_maxprofit(int prices[]) {
		int Buyprices = Integer.MAX_VALUE;
		int n = prices.length;
		int maxProfit = 0;
		for (int i = 0; i < n; i++) {
			if (Buyprices < prices[i]) {
				int profit = prices[i] - Buyprices;
				maxProfit = Math.max(maxProfit, profit);
				System.out.println("selling price(" + prices[i] + ") - Buy prices(" + Buyprices + ") = " + profit);
			} else {
				Buyprices = prices[i];
			}
		}
		System.out.println("max profit is = " + maxProfit);
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int[] prices1 = { 7, 6, 4, 3 };
		finding_maxprofit(prices);
		// finding_maxprofit(prices1);
	}

}
