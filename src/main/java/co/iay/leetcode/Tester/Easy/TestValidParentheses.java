package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ValidParentheses;
import org.junit.Assert;
import org.junit.Test;

public class TestValidParentheses {
    private ValidParentheses v = new ValidParentheses();

    @Test
    public void testValidParenthesesCase1() {
        Assert.assertEquals(true, v.isValid(""));
    }

    @Test
    public void testValidParenthesesCase2() {
        Assert.assertEquals(true, v.isValid("()"));
    }

    @Test
    public void testValidParenthesesCase3() {
        Assert.assertEquals(false, v.isValid(")("));
    }

    @Test
    public void testValidParenthesesCase4() {
        Assert.assertEquals(false, v.isValid("([)]"));
    }

    @Test
    public void testValidParenthesesCase5() {
        Assert.assertEquals(true, v.isValid("()[]{}"));
    }

    @Test
    public void testValidParenthesesCase6() {
        Assert.assertEquals(false, v.isValid("]"));
    }

    @Test
    public void testValidParenthesesCase7() {
        Assert.assertEquals(false, v.isValid("(((()"));
    }
}
