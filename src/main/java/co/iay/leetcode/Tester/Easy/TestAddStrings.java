package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.AddStrings;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/10/10.
 */
public class TestAddStrings {
    private AddStrings a = new AddStrings();

    @Test
    public void testAddStringsCase1() {
        Assert.assertEquals("2", a.addStrings("1", "1"));
    }

    @Test
    public void testAddStringsCase2() {
        Assert.assertEquals("10", a.addStrings("9", "1"));
    }

    @Test
    public void testAddStringsCase3() {
        Assert.assertEquals("10000", a.addStrings("9999", "1"));
    }

    @Test
    public void testAddStringsCase4() {
        Assert.assertEquals("10000", a.addStrings("9989", "11"));
    }

    @Test
    public void testAddStringsCase5() {
        Assert.assertEquals("1", a.addStrings("0", "1"));
    }

    @Test
    public void testAddStringsCase6() {
        Assert.assertEquals("0", a.addStrings("0", "0"));
    }

    @Test
    public void testAddStringsCase7() {
        Assert.assertEquals("108", a.addStrings("99", "9"));
    }

    @Test
    public void testAddStringsCase8() {
        Assert.assertEquals("579", a.addStrings("123", "456"));
    }
}
