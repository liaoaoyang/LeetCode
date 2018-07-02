package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LemonadeChange;
import org.junit.Assert;
import org.junit.Test;

public class TestLemonadeChange {
    private LemonadeChange l = new LemonadeChange();

    @Test
    public void testLemonadeChangeCase1() {
        Assert.assertTrue(l.lemonadeChange(new int[]{5, 5, 5, 10, 20}));
    }

    @Test
    public void testLemonadeChangeCase2() {
        Assert.assertTrue(l.lemonadeChange(new int[]{5, 5, 10}));
    }

    @Test
    public void testLemonadeChangeCase3() {
        Assert.assertFalse(l.lemonadeChange(new int[]{10, 10}));
    }

    @Test
    public void testLemonadeChangeCase4() {
        Assert.assertFalse(l.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }

    @Test
    public void testLemonadeChangeCase5() {
        Assert.assertTrue(l.lemonadeChange(new int[]{5, 5, 5, 10, 5, 20, 5, 10, 5, 20}));
    }

    @Test
    public void testLemonadeChangeCase6() {
        Assert.assertTrue(l.lemonadeChange(new int[]{5, 5, 5, 5, 10, 5, 10, 10, 10, 20}));
    }
}
