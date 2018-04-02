package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.BestTimeToBuyAndSellStockWithCooldown;
import org.junit.Assert;
import org.junit.Test;

public class TestBestTimeToBuyAndSellStockWithCooldown {
    private BestTimeToBuyAndSellStockWithCooldown b = new BestTimeToBuyAndSellStockWithCooldown();

    @Test
    public void testBestTimeToBuyAndSellStockWithCooldownCase1() {
        Assert.assertEquals(3, b.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockWithCooldownCase2() {
        Assert.assertEquals(1, b.maxProfit(new int[]{1, 2}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockWithCooldownCase3() {
        Assert.assertEquals(0, b.maxProfit(new int[]{2, 1}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockWithCooldownCase4() {
        Assert.assertEquals(0, b.maxProfit(new int[]{2}));
    }

    @Test
    public void testBestTimeToBuyAndSellStockWithCooldownCase5() {
        Assert.assertEquals(2, b.maxProfit(new int[]{2, 1, 3}));
    }
}
