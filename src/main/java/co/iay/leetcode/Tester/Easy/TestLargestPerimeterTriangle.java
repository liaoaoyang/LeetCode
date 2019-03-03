package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LargestPerimeterTriangle;
import org.junit.Assert;
import org.junit.Test;

public class TestLargestPerimeterTriangle {
    private LargestPerimeterTriangle l = new LargestPerimeterTriangle();

    @Test
    public void testLargestPerimeterTriangleCase1() {
        Assert.assertEquals(0, l.largestPerimeter(new int[]{2, 1, 1}));
    }

    @Test
    public void testLargestPerimeterTriangleCase2() {
        Assert.assertEquals(10, l.largestPerimeter(new int[]{3, 2, 3, 4}));
    }

    @Test
    public void testLargestPerimeterTriangleCase3() {
        Assert.assertEquals(8, l.largestPerimeter(new int[]{3, 6, 2, 3}));
    }
}
