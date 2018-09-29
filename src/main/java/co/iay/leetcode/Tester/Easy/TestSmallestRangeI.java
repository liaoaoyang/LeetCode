package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SmallestRangeI;
import org.junit.Assert;
import org.junit.Test;

public class TestSmallestRangeI {
    private SmallestRangeI s = new SmallestRangeI();

    @Test
    public void testSmallestRangeICase1() {
        Assert.assertEquals(0, s.smallestRangeI(new int[]{1}, 0));
    }

    @Test
    public void testSmallestRangeICase2() {
        Assert.assertEquals(6, s.smallestRangeI(new int[]{0, 10}, 2));
    }

    @Test
    public void testSmallestRangeICase3() {
        Assert.assertEquals(0, s.smallestRangeI(new int[]{1, 3, 6}, 3));
    }
}
