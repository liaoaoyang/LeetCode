package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.NthDigit;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/11/5.
 */
public class TestNthDigit {
    private NthDigit n = new NthDigit();

    @Test
    public void testNthDigitCase1() {
        Assert.assertEquals(3, n.findNthDigit(3));
    }

    @Test
    public void testNthDigitCase2() {
        Assert.assertEquals(1, n.findNthDigit(10));
    }

    @Test
    public void testNthDigitCase3() {
        Assert.assertEquals(1, n.findNthDigit(190));
    }

    @Test
    public void testNthDigitCase4() {
        Assert.assertEquals(0, n.findNthDigit(191));
    }

    @Test
    public void testNthDigitCase5() {
        Assert.assertEquals(1, n.findNthDigit(193));
    }

    @Test
    public void testNthDigitCase6() {
        Assert.assertEquals(1, n.findNthDigit(195));
    }

    @Test
    public void testNthDigitCase7() {
        Assert.assertEquals(1, n.findNthDigit(1000000000));
    }
}
