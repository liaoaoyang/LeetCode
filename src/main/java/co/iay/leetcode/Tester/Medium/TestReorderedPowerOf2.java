package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.ReorderedPowerOf2;
import org.junit.Assert;
import org.junit.Test;

public class TestReorderedPowerOf2 {
    private ReorderedPowerOf2 r = new ReorderedPowerOf2();

    @Test
    public void testReorderedPowerOf2Case1() {
        Assert.assertTrue(r.reorderedPowerOf2(1));
    }

    @Test
    public void testReorderedPowerOf2Case2() {
        Assert.assertFalse(r.reorderedPowerOf2(10));
    }

    @Test
    public void testReorderedPowerOf2Case3() {
        Assert.assertTrue(r.reorderedPowerOf2(46));
    }
}
