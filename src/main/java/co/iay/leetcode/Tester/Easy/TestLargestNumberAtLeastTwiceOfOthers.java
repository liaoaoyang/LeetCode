package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LargestNumberAtLeastTwiceOfOthers;
import org.junit.Assert;
import org.junit.Test;

public class TestLargestNumberAtLeastTwiceOfOthers {
    private LargestNumberAtLeastTwiceOfOthers l = new LargestNumberAtLeastTwiceOfOthers();

    @Test
    public void testLargestNumberAtLeastTwiceOfOthersCase1() {
        Assert.assertEquals(1, l.dominantIndex(new int[]{3, 6, 1, 0}));
    }

    @Test
    public void testLargestNumberAtLeastTwiceOfOthersCase2() {
        Assert.assertEquals(-1, l.dominantIndex(new int[]{1, 2, 3, 4}));
    }
}
