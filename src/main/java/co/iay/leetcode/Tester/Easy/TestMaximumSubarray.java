package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MaximumSubarray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/3/17.
 */
public class TestMaximumSubarray {
    private MaximumSubarray m = new MaximumSubarray();

    @Test
    public void testMaximumSubarrayCase1() {
        Assert.assertEquals(6, m.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void testMaximumSubarrayCase2() {
        Assert.assertEquals(1, m.maxSubArray(new int[] {1, -11, -12}));
    }
}
