package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ArrangingCoins;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/11/1.
 */
public class TestArranginCoins {
    private ArrangingCoins arrangingCoins = new ArrangingCoins();

    @Test
    public void testArrangingCoinsCase1() {
        Assert.assertEquals(2, arrangingCoins.arrangeCoins(5));
    }

    @Test
    public void testArrangingCoinsCase2() {
        Assert.assertEquals(3, arrangingCoins.arrangeCoins(8));
    }

    @Test
    public void testArrangingCoinsCase3() {
        Assert.assertEquals(3, arrangingCoins.arrangeCoins(6));
    }

    @Test
    public void testArrangingCoinsCase4() {
        Assert.assertEquals(0, arrangingCoins.arrangeCoins(0));
    }

    @Test
    public void testArrangingCoinsCase5() {
        Assert.assertEquals(1, arrangingCoins.arrangeCoins(1));
    }

    @Test
    public void testArrangingCoinsCase6() {
        Assert.assertEquals(60070, arrangingCoins.arrangeCoins(1804289383));
    }

}
