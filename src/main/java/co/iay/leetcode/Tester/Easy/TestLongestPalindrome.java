package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LongestPalindrome;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/10/5.
 */
public class TestLongestPalindrome {
    LongestPalindrome l = new LongestPalindrome();

    @Test
    public void testLongestPalindromeCase1() {
        Assert.assertEquals(7, l.longestPalindrome("abccccdd"));
    }

    @Test
    public void testLongestPalindromeCase2() {
        Assert.assertEquals(7, l.longestPalindrome("aaabbbccc"));
    }

    @Test
    public void testLongestPalindromeCase3() {
        Assert.assertEquals(1, l.longestPalindrome("a"));
    }

    @Test
    public void testLongestPalindromeCase4() {
        Assert.assertEquals(2, l.longestPalindrome("aa"));
    }

    @Test
    public void testLongestPalindromeCase5() {
        Assert.assertEquals(3, l.longestPalindrome("aaa"));
    }
}
