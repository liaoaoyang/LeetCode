package co.iay.leetcode.Tester.Hard;

import co.iay.leetcode.Hard.BestTimeToBuyAndSellStockIV;
import org.junit.Assert;
import org.junit.Test;

public class TestBestTimeToBuyAndSellStockIV {
    private BestTimeToBuyAndSellStockIV b = new BestTimeToBuyAndSellStockIV();

    @Test
    public void testBestTimeToBuyAndSellStockIVCase1() {
        Assert.assertEquals(0, b.maxProfit(2, new int[]{}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockIVCase2() {
        Assert.assertEquals(2, b.maxProfit(2, new int[]{2, 1, 2, 0, 1}));
    }
}
