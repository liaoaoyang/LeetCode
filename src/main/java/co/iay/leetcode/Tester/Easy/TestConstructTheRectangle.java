package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ConstructTheRectangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/1/22.
 */
public class TestConstructTheRectangle {
    private ConstructTheRectangle c = new ConstructTheRectangle();

    @Test
    public void testConstructTheRectangleCase1() {
        Assert.assertArrayEquals(new int[]{1, 1}, c.constructRectangle(1));
    }

    @Test
    public void testConstructTheRectangleCase2() {
        Assert.assertArrayEquals(new int[]{2, 2}, c.constructRectangle(4));
    }

    @Test
    public void testConstructTheRectangleCase3() {
        Assert.assertArrayEquals(new int[]{4, 3}, c.constructRectangle(12));
    }
}
