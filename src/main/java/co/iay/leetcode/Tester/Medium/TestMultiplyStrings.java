package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.MultiplyStrings;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/7/11.
 */
public class TestMultiplyStrings {
    private MultiplyStrings m = new MultiplyStrings();

    @Test
    public void testMultiplyStringsCase1() {
        Assert.assertEquals("1", m.multiply("1", "1"));
    }

    @Test
    public void testMultiplyStringsCase2() {
        Assert.assertEquals("4", m.multiply("2", "2"));
    }

    @Test
    public void testMultiplyStringsCase3() {
        Assert.assertEquals("81", m.multiply("9", "9"));
    }

    @Test
    public void testMultiplyStringsCase4() {
        Assert.assertEquals("" + (99 * 99), m.multiply("99", "99"));
    }
}
