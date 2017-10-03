package co.iay.leetcode.Hard;

/**
 * 188. Best Time to Buy and Sell Stock IV
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete at most k transactions.
 * <p>
 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * <p>
 * 解法：
 * dp[i][j]表示第i天交易j次之后的最大利润
 * gdp[i][j]表示所有组合之中的最大值第i天交易j次之后的最大利润
 * 推导公式如下：
 * d = prices[i] - prices[i - 1];
 * dp[i][j] = max(g[i - 1][j - 1] + max(0, d), dp[i - 1][j] + d);
 * gdp[i][j] = max(dp[i][j], gdp[i - 1][j])
 */

public class BestTimeToBuyAndSellStockIV {
    private int maxProfitII(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }

        return profit;
    }

    public int maxProfit(int k, int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }

        if (k > prices.length) {
            return maxProfitII(prices);
        }

        int[] dp = new int[k + 1];
        int[] gdp = new int[k + 1];

        for (int i = 0; i < prices.length - 1; ++i) {
            int d = prices[i + 1] - prices[i];

            for (int j = k; j > 0; --j) {
                dp[j] = Math.max(gdp[j - 1] + Math.max(0, d), dp[j] + d);
                gdp[j] = Math.max(gdp[j], dp[j]);
            }
        }

        return gdp[k];
    }
}
