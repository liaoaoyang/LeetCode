package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.MaximumProductSubarray;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumProductSubarray {
    private MaximumProductSubarray m = new MaximumProductSubarray();

    @Test
    public void testMaximumProductSubarrayCase1() {
        Assert.assertEquals(6, m.maxProduct(new int[]{2, 3, -2 , 4}));
    }

    @Test
    public void testMaximumProductSubarrayCase2() {
        Assert.assertEquals(144, m.maxProduct(new int[]{2, 3, -2 , 4, -3}));
    }

    @Test
    public void testMaximumProductSubarrayCase3() {
        Assert.assertEquals(168, m.maxProduct(new int[]{2, 3, -2 , 4, -3, -14}));
    }

    @Test
    public void testMaximumProductSubarrayCase4() {
        Assert.assertEquals(3, m.maxProduct(new int[]{-2, 3}));
    }

    @Test
    public void testMaximumProductSubarrayCase5() {
        Assert.assertEquals(-2, m.maxProduct(new int[]{-2}));
    }
}
