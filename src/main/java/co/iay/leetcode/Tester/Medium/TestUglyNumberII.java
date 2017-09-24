package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.UglyNumberII;
import org.junit.Assert;
import org.junit.Test;

public class TestUglyNumberII {
    private UglyNumberII u = new UglyNumberII();

    @Test
    public void testUglyNumberIICase1() {
        Assert.assertEquals(12, u.nthUglyNumber(10));
    }

    @Test
    public void testUglyNumberIICase2() {
        Assert.assertEquals(859963392, u.nthUglyNumber(1500));
    }

    @Test
    public void testUglyNumberIICase3() {
        Assert.assertEquals(2123366400, u.nthUglyNumber(1690));
    }
}
