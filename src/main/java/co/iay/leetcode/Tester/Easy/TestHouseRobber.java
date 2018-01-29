package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.HouseRobber;
import org.junit.Assert;
import org.junit.Test;

public class TestHouseRobber {
    private HouseRobber h = new HouseRobber();

    @Test
    public void testHouseRobberCase1() {
        Assert.assertEquals(1, h.rob(new int[]{1}));
    }

    @Test
    public void testHouseRobberCase2() {
        Assert.assertEquals(2, h.rob(new int[]{1, 2}));
    }

    @Test
    public void testHouseRobberCase3() {
        Assert.assertEquals(2, h.rob(new int[]{2, 1}));
    }

    @Test
    public void testHouseRobberCase4() {
        Assert.assertEquals(3, h.rob(new int[]{1, 1, 2}));
    }

    @Test
    public void testHouseRobberCase5() {
        Assert.assertEquals(7, h.rob(new int[]{2, 1, 3, 5}));
    }

    @Test
    public void testHouseRobberCase6() {
        Assert.assertEquals(0, h.rob(new int[]{}));
    }

    @Test
    public void testHouseRobberCase7() {
        Assert.assertEquals(7, h.rob(new int[]{2, 1, 3, 5, 1}));
    }
}
