package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ValidPalindrome;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/8/7.
 */
public class TestValidPalindrome {
    protected ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void testValidPalindromeCase1() {
        Assert.assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testValidPalindromeCase2() {
        Assert.assertEquals(false, validPalindrome.isPalindrome("race a car"));
    }

    @Test
    public void testValidPalindromeCase3() {
        Assert.assertEquals(false, validPalindrome.isPalindrome("0P"));
    }
}
