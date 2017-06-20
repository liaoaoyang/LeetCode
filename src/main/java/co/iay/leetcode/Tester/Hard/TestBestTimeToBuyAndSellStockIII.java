package co.iay.leetcode.Tester.Hard;

import co.iay.leetcode.Hard.BestTimeToBuyAndSellStockIII;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/6/21.
 */
public class TestBestTimeToBuyAndSellStockIII {
    private BestTimeToBuyAndSellStockIII b = new BestTimeToBuyAndSellStockIII();

    @Test
    public void testBestTimeToBuyAndSellStockIIICase1() {
        Assert.assertEquals(0, b.maxProfit(new int[]{}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockIIICase2() {
        Assert.assertEquals(10, b.maxProfit(new int[]{1, 2, 3, 3, 7, 2, 1, 4, 5, 1, 3}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockIIICase3() {
        Assert.assertEquals(1, b.maxProfit(new int[]{1, 2}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockIIICase4() {
        Assert.assertEquals(0, b.maxProfit(new int[]{2, 1}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockIIICase5() {
        Assert.assertEquals(7, b.maxProfit(new int[]{6, 1, 3, 2, 4, 7}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockIIICase6() {
        Assert.assertEquals(0, b.maxProfit(new int[]{1}));
    }
}
