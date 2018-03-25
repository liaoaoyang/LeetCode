package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.CustomSortString;
import org.junit.Assert;
import org.junit.Test;

public class TestCustomSortString {
    private CustomSortString c = new CustomSortString();

    @Test
    public void testCustomSortStringCase1() {
        Assert.assertEquals("ccbbaaed", c.customSortString("cba", "abacbced"));
    }

    @Test
    public void testCustomSortStringCase2() {
        Assert.assertEquals("cbad", c.customSortString("cba", "abcd"));
    }
}
