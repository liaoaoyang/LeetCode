package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.NumberOfLongestIncreasingSubsequence;
import org.junit.Assert;
import org.junit.Test;

public class TestNumberOfLongestIncreasingSubsequence {
    private NumberOfLongestIncreasingSubsequence n = new NumberOfLongestIncreasingSubsequence();

    @Test
    public void testNumberOfLongestIncreasingSubsequenceCase1() {
        Assert.assertEquals(2, n.findNumberOfLIS(new int[]{1, 3, 5, 4, 7}));
    }

    @Test
    public void testNumberOfLongestIncreasingSubsequenceCase2() {
        Assert.assertEquals(5, n.findNumberOfLIS(new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    public void testNumberOfLongestIncreasingSubsequenceCase3() {
        // 1 2 4 5 7
        // 1 2 3 5 7
        // 1 2 3 4 7
        Assert.assertEquals(3, n.findNumberOfLIS(new int[]{1, 2, 4, 3, 5, 4, 7, 2}));
    }

    @Test
    public void testNumberOfLongestIncreasingSubsequenceCase4() {
        Assert.assertEquals(1, n.findNumberOfLIS(new int[]{1, 2}));
    }
}

