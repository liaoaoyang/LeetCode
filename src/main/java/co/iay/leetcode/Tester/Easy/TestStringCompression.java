package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.StringCompression;
import org.junit.Assert;
import org.junit.Test;

public class TestStringCompression {
    private StringCompression s = new StringCompression();

    @Test
    public void testStringCompressionCase1() {
        char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] expect = new char[]{'a', '2', 'b', '2', 'c', '3', 'c'};

        Assert.assertEquals(6, s.compress(chars));
        Assert.assertArrayEquals(expect, chars);
    }

    @Test
    public void testStringCompressionCase2() {
        char[] chars = new char[]{'a'};
        char[] expect = new char[]{'a'};

        Assert.assertEquals(1, s.compress(chars));
        Assert.assertArrayEquals(expect, chars);
    }
}
