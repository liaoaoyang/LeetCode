package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.FindPeakElement;
import org.junit.Assert;
import org.junit.Test;

public class TestFindPeakElement {
    private FindPeakElement f = new FindPeakElement();

    @Test
    public void testFindPeakElementCase1() {
        Assert.assertEquals(2, f.findPeakElement(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void testFindPeakElementCase2() {
        Assert.assertEquals(3, f.findPeakElement(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testFindPeakElementCase3() {
        Assert.assertEquals(1, f.findPeakElement(new int[]{1, 2}));
    }

    @Test
    public void testFindPeakElementCase4() {
        Assert.assertEquals(0, f.findPeakElement(new int[]{2, 1}));
    }

    @Test
    public void testFindPeakElementCase5() {
        Assert.assertEquals(0, f.findPeakElement(new int[]{1}));
    }

    @Test
    public void testFindPeakElementCase6() {
        Assert.assertEquals(1, f.findPeakElement(new int[]{1, 3, 2, 4, 0}));
    }
}
