package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.LongestPalindromicSubstring;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/6/24.
 */
public class TestLongestPalindromicSubstring {
    private LongestPalindromicSubstring l = new LongestPalindromicSubstring();

    @Test
    public void testLongestPalindromicSubstringCase1() {
        Assert.assertEquals("bab", l.longestPalindrome("babad"));
    }

    @Test
    public void testLongestPalindromicSubstringCase2() {
        Assert.assertEquals("abcba", l.longestPalindrome("babcbad"));
    }

    @Test
    public void testLongestPalindromicSubstringCase3() {
        Assert.assertEquals("a", l.longestPalindrome("abcda"));
    }
}
