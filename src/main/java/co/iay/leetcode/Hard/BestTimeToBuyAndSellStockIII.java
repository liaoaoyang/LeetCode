package co.iay.leetcode.Hard;

/**
 * Created by ng on 2017/6/20.
 * 123. Best Time to Buy and Sell Stock III
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii
 */
public class BestTimeToBuyAndSellStockIII {
    private void getMaxProfitFromLeftToRight(int[] prices, int [] maxProfit) {
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

    private void getMaxProfitFromRightToLeft(int[] prices, int [] maxProfit) {
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
