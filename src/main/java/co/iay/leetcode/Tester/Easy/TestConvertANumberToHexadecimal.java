package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ConvertANumberToHexadecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/10/1.
 */
public class TestConvertANumberToHexadecimal {
    private ConvertANumberToHexadecimal c = new ConvertANumberToHexadecimal();

    @Test
    public void testTestConvertANumberToHexadecimalCase1() {
        Assert.assertEquals("1", c.toHex(1));
    }

    @Test
    public void testTestConvertANumberToHexadecimalCase2() {
        Assert.assertEquals("a", c.toHex(10));
    }

    @Test
    public void testTestConvertANumberToHexadecimalCase3() {
        Assert.assertEquals("b", c.toHex(11));
    }

    @Test
    public void testTestConvertANumberToHexadecimalCase4() {
        Assert.assertEquals("1a", c.toHex(26));
    }

    @Test
    public void testTestConvertANumberToHexadecimalCase5() {
        Assert.assertEquals("ffffffff", c.toHex(-1));
    }

    @Test
    public void testTestConvertANumberToHexadecimalCase6() {
        Assert.assertEquals("fffffffe", c.toHex(-2));
    }

    @Test
    public void testTestConvertANumberToHexadecimalCase7() {
        Assert.assertEquals("10", c.toHex(16));
    }

    @Test
    public void testTestConvertANumberToHexadecimalCase8() {
        Assert.assertEquals("0", c.toHex(0));
    }
}
