package co.iay.leetcode.Hard;

/**
 * Created by ng on 2017/6/20.
 * 123. Best Time to Buy and Sell Stock III
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 * <p>
 * Note: You may not engage in multiple transactions at the same time
 * (i.e., you must sell the stock before you buy again).
 * <p>
 * Example 1:
 * <p>
 * Input: [3,3,5,0,0,3,1,4]
 * Output: 6
 * Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
 * Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
 * Example 2:
 * <p>
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 * engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * Solution：
 * 最多两次交易，那么可以以某天作为中点，获取当天之前和之后发生交易的最大值，之后求和，找出最大的和即可。
 * 从左到右，可以知道第i天之前的最低价格，之后可以获得在第i天的最大收益，得到第一个收益值。
 * 从右到左，也可以得知在第j天之后的最高价，可以知道到第j天买入操作带来的最大收益，得到第二个收益值。
 * 综上，得出解。
 */
public class BestTimeToBuyAndSellStockIII {
    private void getMaxProfitFromLeftToRight(int[] prices, int[] maxProfit) {
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; ++i) {
            if (0 == i) {
                maxProfit[i] = 0;
                continue;
            }

            maxProfit[i] = prices[i] - minPrice;
            maxProfit[i] = maxProfit[i] < maxProfit[i - 1] ? maxProfit[i - 1] : maxProfit[i];

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
    }

    private void getMaxProfitFromRightToLeft(int[] prices, int[] maxProfit) {
        int maxPrice = prices[prices.length - 1];

        for (int i = prices.length - 1; i >= 0; --i) {
            if (i == prices.length - 1) {
                maxProfit[i] = 0;
                continue;
            }

            maxProfit[i] = maxPrice - prices[i];
            maxProfit[i] = maxProfit[i] < maxProfit[i + 1] ? maxProfit[i + 1] : maxProfit[i];

            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }
    }

    public int maxProfit(int[] prices) {
        if (null == prices || prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;
        int[] maxProfitLeftToRight = new int[prices.length];
        int[] maxProfitRightToLeft = new int[prices.length];
        getMaxProfitFromLeftToRight(prices, maxProfitLeftToRight);
        getMaxProfitFromRightToLeft(prices, maxProfitRightToLeft);

        for (int i = 0; i < prices.length - 1; ++i) {
            int tempMaxProfit = maxProfitLeftToRight[i] + maxProfitRightToLeft[i];
            maxProfit = maxProfit < tempMaxProfit ? tempMaxProfit : maxProfit;
        }

        return maxProfit;
    }
}
