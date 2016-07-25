package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ReverseString;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/25.
 */
public class TestReverseString {
    private ReverseString reverseString = new ReverseString();

    @Test
    public void testRevertStringCase1() {
        Assert.assertEquals("", reverseString.reverseString(""));
    }

    @Test
    public void testRevertStringCase2() {
        Assert.assertEquals("dcba", reverseString.reverseString("abcd"));
    }

    @Test
    public void testRevertStringCase3() {
        Assert.assertEquals("aaa", reverseString.reverseString("aaa"));
    }
}
