package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.FindMinimumInRotatedSortedArray;
import org.junit.Assert;
import org.junit.Test;

public class TestFindMinimumInRotatedSortedArray {
    private FindMinimumInRotatedSortedArray f = new FindMinimumInRotatedSortedArray();

    @Test
    public void testFindMinimumInRotatedSortedArrayCase1() {
        Assert.assertEquals(0, f.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCase2() {
        Assert.assertEquals(0, f.findMin(new int[]{0, 1, 2}));
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCase3() {
        Assert.assertEquals(0, f.findMin(new int[]{2, 1, 0}));
    }

    @Test
    public void testFindMinimumInRotatedSortedArrayCase4() {
        Assert.assertEquals(0, f.findMin(new int[]{0}));
    }
}
