package co.iay.leetcode.Tester.Hard;

import co.iay.leetcode.Hard.LongestValidParentheses;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/6/21.
 */
public class TestLongestValidParentheses {
    private LongestValidParentheses l = new LongestValidParentheses();

    @Test
    public void testLongestValidParenthesesCase1() {
        Assert.assertEquals(0, l.longestValidParentheses(")"));
    }

    @Test
    public void testLongestValidParenthesesCase2() {
        Assert.assertEquals(2, l.longestValidParentheses("()"));
    }

    @Test
    public void testLongestValidParenthesesCase3() {
        Assert.assertEquals(2, l.longestValidParentheses("()("));
    }

    @Test
    public void testLongestValidParenthesesCase4() {
        Assert.assertEquals(4, l.longestValidParentheses("()())"));
    }

    @Test
    public void testLongestValidParenthesesCase5() {
        Assert.assertEquals(6, l.longestValidParentheses("(()())"));
    }
}
