package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.RotateImage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/4/14.
 */
public class TestRotateImage {
    private RotateImage ri = new RotateImage();

    @Test
    public void testRotateImageCase1() {
        int[][] m = new int[][]{{1}};
        int[][] r = new int[][]{{1}};
        ri.rotate(m);
        Assert.assertArrayEquals(r, m);
    }

    @Test
    public void testRotateImageCase2() {
        int[][] m = new int[][]{{1, 2}, {4, 3}};
        int[][] r = new int[][]{{4, 1}, {3, 2}};
        ri.rotate(m);
        Assert.assertArrayEquals(r, m);
    }

    @Test
    public void testRotateImageCase3() {
        int[][] m = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] r = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        ri.rotate(m);
        Assert.assertArrayEquals(r, m);
    }
}
