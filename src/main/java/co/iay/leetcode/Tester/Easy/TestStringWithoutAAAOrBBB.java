package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.StringWithoutAAAOrBBB;
import org.junit.Assert;
import org.junit.Test;

public class TestStringWithoutAAAOrBBB {
    private StringWithoutAAAOrBBB s = new StringWithoutAAAOrBBB();

    @Test
    public void testStringWithoutAAAOrBBBCase1() {
        Assert.assertEquals("bab", s.strWithout3a3b(1, 2));
    }

    @Test
    public void testStringWithoutAAAOrBBBCase2() {
        Assert.assertEquals("aabaa", s.strWithout3a3b(4, 1));
    }
}
