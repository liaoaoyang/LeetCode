package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LongestContinuousIncreasingSubsequence;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aoyang on 17/9/15.
 */
public class TestLongestContinuousIncreasingSubsequence {
    private LongestContinuousIncreasingSubsequence l = new LongestContinuousIncreasingSubsequence();

    @Test
    public void testLongestContinuousIncreasingSubsequenceCase1() {
        Assert.assertEquals(1, l.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    public void testLongestContinuousIncreasingSubsequenceCase2() {
        Assert.assertEquals(3, l.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
    }

    @Test
    public void testLongestContinuousIncreasingSubsequenceCase3() {
        Assert.assertEquals(4, l.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7, 8, 9, 9}));
    }

    @Test
    public void testLongestContinuousIncreasingSubsequenceCase4() {
        Assert.assertEquals(2, l.findLengthOfLCIS(new int[]{1, 3}));
    }

    @Test
    public void testLongestContinuousIncreasingSubsequenceCase5() {
        Assert.assertEquals(1, l.findLengthOfLCIS(new int[]{1, 1}));
    }

    @Test
    public void testLongestContinuousIncreasingSubsequenceCase6() {
        Assert.assertEquals(0, l.findLengthOfLCIS(new int[]{}));
    }
}
