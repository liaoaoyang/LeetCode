package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RectangleOverlap;
import org.junit.Assert;
import org.junit.Test;

public class TestRectangleOverlap {
    private RectangleOverlap r = new RectangleOverlap();

    @Test
    public void testRectangleOverlapCase1() {
        Assert.assertTrue(r.isRectangleOverlap(
                new int[]{0, 0, 2, 2},
                new int[]{1, 1, 3, 3}
        ));
    }

    @Test
    public void testRectangleOverlapCase2() {
        Assert.assertFalse(r.isRectangleOverlap(
                new int[]{0, 0, 1, 1},
                new int[]{1, 0, 2, 1}
        ));
    }

    @Test
    public void testRectangleOverlapCase3() {
        Assert.assertTrue(r.isRectangleOverlap(
                new int[]{7, 8, 13, 15},
                new int[]{10, 8, 12, 20}
        ));
    }

    @Test
    public void testRectangleOverlapCase4() {
        Assert.assertTrue(r.isRectangleOverlap(
                new int[]{-193634870, -175701756, 958697367, 607619635},
                new int[]{91619846, 10349052, 822028072, 696611776}
        ));
    }
}
