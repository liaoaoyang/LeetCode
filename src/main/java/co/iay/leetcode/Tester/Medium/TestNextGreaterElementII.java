package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.NextGreaterElementII;
import org.junit.Assert;
import org.junit.Test;

public class TestNextGreaterElementII {
    private NextGreaterElementII n = new NextGreaterElementII();

    @Test
    public void testNextGreaterElementIICase1() {
        Assert.assertArrayEquals(new int[]{2, -1, 2}, n.nextGreaterElements(new int[]{1, 2, 1}));
    }

    @Test
    public void testNextGreaterElementIICase2() {
        Assert.assertArrayEquals(new int[]{-1, 5, 5, 5, 5}, n.nextGreaterElements(new int[]{5, 4, 3, 2, 1}));
    }
}
