package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/25.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int[] maxNumbers = new int[prices.length];

        for (int i = prices.length - 1; i >= 0; --i) {
            if (i == prices.length - 1) {
                maxNumbers[i] = prices[i];
                continue;
            }

            if (prices[i] > maxNumbers[i + 1]) {
                maxNumbers[i] = prices[i];
                continue;
            }

            maxNumbers[i] = maxNumbers[i + 1];
        }

        int maxProfit = 0;

        for (int i = prices.length - 1; i >= 0; --i) {
            if (maxProfit < (maxNumbers[i] - prices[i])) {
                maxProfit = maxNumbers[i] - prices[i];
            }
        }

        return maxProfit;
    }
}
