package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.BinarySubarraysWithSum;
import org.junit.Assert;
import org.junit.Test;

public class TestBinarySubarraysWithSum {
    private BinarySubarraysWithSum b = new BinarySubarraysWithSum();

    @Test
    public void testBinarySubarraysWithSumCase1() {
        Assert.assertEquals(3, b.numSubarraysWithSum(new int[]{0, 1, 1, 1, 1}, 3));
    }

    @Test
    public void testBinarySubarraysWithSumCase2() {
        Assert.assertEquals(4, b.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }

    @Test
    public void testBinarySubarraysWithSumCase3() {
        Assert.assertEquals(15, b.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0}, 0));
    }
}
