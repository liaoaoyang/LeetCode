package co.iay.leetcode.Medium;

/**
 * 714. Best Time to Buy and Sell Stock with Transaction Fee
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee
 * <p>
 * Your are given an array of integers prices,
 * for which the i-th element is the price of a given stock on day i;
 * and a non-negative integer fee representing a transaction fee.
 * <p>
 * You may complete as many transactions as you like,
 * but you need to pay the transaction fee for each transaction.
 * You may not buy more than 1 share of a stock at a time
 * (ie. you must sell the stock share before you buy again.)
 * <p>
 * Return the maximum profit you can make.
 * <p>
 * Example 1:
 * Input: prices = [1, 3, 2, 8, 4, 9], fee = 2
 * Output: 8
 * Explanation: The maximum profit can be achieved by:
 * Buying at prices[0] = 1
 * Selling at prices[3] = 8
 * Buying at prices[4] = 4
 * Selling at prices[5] = 9
 * The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 * Note:
 * <p>
 * 0 < prices.length <= 50000.
 * 0 < prices[i] < 50000.
 * 0 <= fee < 50000.
 * Solution:
 * cash为第n天不持有股票的情况下的收益，hold为第n天持有股票情况下的成本
 * 1) 当日在不持有股票的情况下，可能是昨日就不持有股票，或持有股票当日卖出，二者取最大值。
 * 2) 当日持有股票的情况下，可能是继续持有昨日已经持有的股票，或者用昨日的收益进行购入操作。
 * 初始状态，即第1天，cash应为0，因为未进行购入操作，所以没有收益，所以为0；
 * 而在第1天，由于必须持有股票，应该与在第1天购入，所以应该为负的第一天价格。
 * 之后第2天的cash因为是不持有股票的收益，所以，所以要判断当天的价格是否能够比第1天的成本更高。
 * 在获得第2天的最大收益之后，第2天还需要持有股票要成本最低（即流动资金最多），
 * 要判继续持有第1天价格购入的股票成本更低还是第2天再购入成本更低，由于第2天再购入需要第1天不持有，
 * 只可能在第二天价格低于第一天的情况下才可能发生。
 * 即当价格为[2,1]时，cash应为0，hold应为-1，因为max(-2, 0-1)==-1。
 * 推广到第n天的情况，cash的选择容易理解，hold分析如下：
 * 如果能在n天选择购入的，因为不能一天交易两次，那么上一次卖出操作一定是第n-1天以及之前完成的。
 * 如果在第n天的cash要满足这一个条件，说明在n天cash应该与n-1天相同，如果要满足这一条件，
 * 第n-1天之前的某次购入价格高于第n天的价格加上手续费（假设是第m天，m < n - 1），
 * 所以应该在第n天进行购入，成本更低。cash由于第m天购入会造成后续没有更高的价格可以卖出，
 * 所以会一直保持不购入状态，直到遇到下一次可以高价卖出的情况。
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];

        for (int i = 1; i < prices.length; ++i) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }

        return cash;
    }
}
