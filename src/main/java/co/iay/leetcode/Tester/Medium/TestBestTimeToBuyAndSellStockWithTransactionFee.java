package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.BestTimeToBuyAndSellStockWithTransactionFee;
import org.junit.Assert;
import org.junit.Test;

public class TestBestTimeToBuyAndSellStockWithTransactionFee {
    private BestTimeToBuyAndSellStockWithTransactionFee b = new BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    public void testBestTimeToBuyAndSellStockWithTransactionFeeCase1() {
        Assert.assertEquals(8, b.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }
}
