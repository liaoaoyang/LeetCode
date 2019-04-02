package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.ValidParenthesisString;
import org.junit.Assert;
import org.junit.Test;

public class TestValidParenthesisString {
    private ValidParenthesisString v = new ValidParenthesisString();

    @Test
    public void testValidParenthesisStringCase1() {
        Assert.assertTrue(v.checkValidString("()"));
    }

    @Test
    public void testValidParenthesisStringCase2() {
        Assert.assertTrue(v.checkValidString("(*)"));
    }

    @Test
    public void testValidParenthesisStringCase3() {
        Assert.assertTrue(v.checkValidString("(*))"));
    }

    @Test
    public void testValidParenthesisStringCase4() {
        Assert.assertFalse(v.checkValidString("()(*)*))**)("));
    }

    @Test
    public void testValidParenthesisStringCase5() {
        Assert.assertTrue(v.checkValidString("(*()"));
    }
}
