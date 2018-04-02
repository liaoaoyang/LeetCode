package co.iay.leetcode.Medium;

/**
 * 309. Best Time to Buy and Sell Stock with Cooldown
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
 * <p>
 * You may not engage in multiple transactions at the same time
 * (ie, you must sell the stock before you buy again).
 * After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
 * Example:
 * <p>
 * prices = [1, 2, 3, 0, 2]
 * maxProfit = 3
 * transactions = [buy, sell, cooldown, buy, sell]
 */
public class BestTimeToBuyAndSellStockWithCooldown {
    @SuppressWarnings("unused")
    private int oNSpaceSolution(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int[] sell = new int[prices.length];
        int[] buy = new int[prices.length];

        // buy数组的含义在于包含当天的时间执行了买入操作时候时候的最大收益
        // 所以第一天买入作为负债需要记录
        buy[0] = -prices[0];

        if (prices[1] > prices[0]) {
            // 对于第二天的操作
            // 如果第二天价格大于第一天，那么可以选择第二天就卖出
            sell[1] = prices[1] - prices[0];
            // 因为第二天价格高于第一天，买入动作不应该在第二天执行
            // 所以直到第二天买入操作不执行，最大收益（负债）是第一天付出成本
            buy[1] = -prices[0];
        } else {
            // 因为第二天价格低于第一天，买入动作应该在第二天执行
            buy[1] = -prices[1];
        }

        for (int i = 2; i < prices.length; ++i) {
            // buy[i - 1]的意义是昨天之前有买入操作时获得的最大利润
            // 加上今天的卖出价格的原因是buy[i - 1]隐含了之前购入价格的成本
            // 假设是j（j <= i - 1）天买入，buy[i - 1] + prices[i]可以
            // 理解为maxProfit[i - 1] + (prices[i] - prices[j])
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
            // 因为存在cooldown操作，所以需要追踪到2天前有卖出股票操作的最大收益
            buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
        }

        return sell[prices.length - 1];
    }

    public int maxProfit(int[] prices) {
        return oNSpaceSolution(prices);
    }
}
