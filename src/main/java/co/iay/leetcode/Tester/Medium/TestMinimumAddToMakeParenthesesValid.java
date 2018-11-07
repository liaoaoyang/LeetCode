package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.MinimumAddToMakeParenthesesValid;
import org.junit.Assert;
import org.junit.Test;

public class TestMinimumAddToMakeParenthesesValid {
    private MinimumAddToMakeParenthesesValid m = new MinimumAddToMakeParenthesesValid();

    @Test
    public void testMinimumAddToMakeParenthesesValidCase1() {
        Assert.assertEquals(1, m.minAddToMakeValid("())"));
    }

    @Test
    public void testMinimumAddToMakeParenthesesValidCase2() {
        Assert.assertEquals(3, m.minAddToMakeValid("((("));
    }

    @Test
    public void testMinimumAddToMakeParenthesesValidCase3() {
        Assert.assertEquals(0, m.minAddToMakeValid("()"));
    }

    @Test
    public void testMinimumAddToMakeParenthesesValidCase4() {
        Assert.assertEquals(4, m.minAddToMakeValid("()))(("));
    }
}
