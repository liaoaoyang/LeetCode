package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.PalindromicSubstrings;
import org.junit.Assert;
import org.junit.Test;

public class TestPalindromicSubstrings {
    private PalindromicSubstrings p = new PalindromicSubstrings();

    @Test
    public void testPalindromicSubstringsCase1() {
        Assert.assertEquals(3, p.countSubstrings("abc"));
    }

    @Test
    public void testPalindromicSubstringsCase2() {
        Assert.assertEquals(6, p.countSubstrings("aaa"));
    }

    @Test
    public void testPalindromicSubstringsCase3() {
        Assert.assertEquals(10, p.countSubstrings("aaaa"));
    }
}
