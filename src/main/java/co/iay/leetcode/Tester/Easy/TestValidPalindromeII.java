package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ValidPalindromeII;
import org.junit.Assert;
import org.junit.Test;

public class TestValidPalindromeII {
    private ValidPalindromeII v = new ValidPalindromeII();

    @Test
    public void testValidPalindromeIICase1() {
        Assert.assertEquals(true, v.validPalindrome("aba"));
    }

    @Test
    public void testValidPalindromeIICase2() {
        Assert.assertEquals(true, v.validPalindrome("abca"));
    }

    @Test
    public void testValidPalindromeIICase3() {
        Assert.assertEquals(true, v.validPalindrome("abcb"));
    }

    @Test
    public void testValidPalindromeIICase4() {
        Assert.assertEquals(false, v.validPalindrome("abcbd"));
    }

    @Test
    public void testValidPalindromeIICase5() {
        Assert.assertEquals(true, v.validPalindrome("bcba"));
    }

    @Test
    public void testValidPalindromeIICase6() {
        Assert.assertEquals(true, v.validPalindrome("aebcdcba"));
    }

    @Test
    public void testValidPalindromeIICase7() {
        Assert.assertEquals(true, v.validPalindrome(""));
    }

    @Test
    public void testValidPalindromeIICase8() {
        Assert.assertEquals(true, v.validPalindrome("cbbcc"));
    }
}
