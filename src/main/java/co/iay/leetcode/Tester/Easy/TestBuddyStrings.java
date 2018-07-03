package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.BuddyStrings;
import org.junit.Assert;
import org.junit.Test;

public class TestBuddyStrings {
    private BuddyStrings b = new BuddyStrings();

    @Test
    public void testBuddyStringsCase1() {
        Assert.assertTrue(b.buddyStrings("ab", "ba"));
    }

    @Test
    public void testBuddyStringsCase2() {
        Assert.assertFalse(b.buddyStrings("ab", "ab"));
    }

    @Test
    public void testBuddyStringsCase3() {
        Assert.assertTrue(b.buddyStrings("aa", "aa"));
    }

    @Test
    public void testBuddyStringsCase4() {
        Assert.assertTrue(b.buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }

    @Test
    public void testBuddyStringsCase5() {
        Assert.assertFalse(b.buddyStrings("", "aa"));
    }

    @Test
    public void testBuddyStringsCase6() {
        Assert.assertTrue(b.buddyStrings("aabb", "aabb"));
    }

    @Test
    public void testBuddyStringsCase7() {
        Assert.assertTrue(b.buddyStrings("abab", "abab"));
    }
}
