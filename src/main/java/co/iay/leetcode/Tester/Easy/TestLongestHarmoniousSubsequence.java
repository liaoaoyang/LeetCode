package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LongestHarmoniousSubsequence;
import org.junit.Assert;
import org.junit.Test;

public class TestLongestHarmoniousSubsequence {
    private LongestHarmoniousSubsequence l = new LongestHarmoniousSubsequence();

    @Test
    public void testLongestHarmoniousSubsequenceCase1() {
        Assert.assertEquals(5, l.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
    }

    @Test
    public void testLongestHarmoniousSubsequenceCase2() {
        Assert.assertEquals(0, l.findLHS(new int[]{1, 1, 1}));
    }

    @Test
    public void testLongestHarmoniousSubsequenceCase3() {
        Assert.assertEquals(4, l.findLHS(new int[]{4, 1, 1, 1, 2, 4}));
    }

    @Test
    public void testLongestHarmoniousSubsequenceCase4() {
        Assert.assertEquals(5, l.findLHS(new int[]{3, 1, 2, 4, 2, 1, 2}));
    }
}
