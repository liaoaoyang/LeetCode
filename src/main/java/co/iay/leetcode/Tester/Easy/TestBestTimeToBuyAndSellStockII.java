package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.BestTimeToBuyAndSellStockII;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/7/16.
 */
public class TestBestTimeToBuyAndSellStockII {
    private BestTimeToBuyAndSellStockII b = new BestTimeToBuyAndSellStockII();

    @Test
    public void testBestTimeToBuyAndSellStockIICase1() {
        Assert.assertEquals(2, b.maxProfit(new int[]{1, 2, 3}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockIICase2() {
        Assert.assertEquals(4, b.maxProfit(new int[]{1, 3, 2, 4}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockIICase3() {
        Assert.assertEquals(0, b.maxProfit(new int[]{4, 3, 2, 1}));
    }
}
