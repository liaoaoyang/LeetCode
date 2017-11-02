package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.DegreeOfAnArray;
import org.junit.Assert;
import org.junit.Test;

public class TestDegreeOfAnArray {
    private DegreeOfAnArray d = new DegreeOfAnArray();

    @Test
    public void testDegreeOfAnArrayCase1() {
        Assert.assertEquals(2, d.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }

    @Test
    public void testDegreeOfAnArrayCase2() {
        Assert.assertEquals(6, d.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }

    @Test
    public void testDegreeOfAnArrayCase3() {
        Assert.assertEquals(1, d.findShortestSubArray(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testDegreeOfAnArrayCase4() {
        Assert.assertEquals(0, d.findShortestSubArray(new int[]{}));
    }

    @Test
    public void testDegreeOfAnArrayCase5() {
        Assert.assertEquals(7, d.findShortestSubArray(new int[]{2, 1, 1, 2, 1, 3, 3, 3, 1, 3, 1, 3, 2}));
    }
}
