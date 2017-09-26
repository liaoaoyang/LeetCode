package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.LongestIncreasingSubsequence;
import org.junit.Assert;
import org.junit.Test;

public class TestLongestIncreasingSubsequence {
    private LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();

    @Test
    public void testLongestIncreasingSubsequenceCase1() {
        Assert.assertEquals(4, l.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    public void testLongestIncreasingSubsequenceCase2() {
        Assert.assertEquals(1, l.lengthOfLIS(new int[] {3, 2, 1}));
    }

    @Test
    public void testLongestIncreasingSubsequenceCase3() {
        Assert.assertEquals(3, l.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 4}));
    }

    @Test
    public void testLongestIncreasingSubsequenceCase4() {
        Assert.assertEquals(6, l.lengthOfLIS(new int[] {1, 3, 6, 7, 9, 4, 10, 5, 6}));
    }
}
