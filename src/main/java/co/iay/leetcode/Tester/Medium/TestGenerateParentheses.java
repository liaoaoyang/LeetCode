package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.GenerateParentheses;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ng on 17/3/18.
 */
public class TestGenerateParentheses {
    GenerateParentheses g = new GenerateParentheses();

    @Test
    public void testGenerateParenthesesCase1() {
        String[] cmps = new String[] {
            "()"
        };

        Assert.assertEquals(Arrays.asList(cmps), g.generateParenthesis(1));
    }

    @Test
    public void testGenerateParenthesesCase2() {
        String[] cmps = new String[] {
            "(())",
            "()()"
        };

        Assert.assertEquals(Arrays.asList(cmps), g.generateParenthesis(2));
    }

    @Test
    public void testGenerateParenthesesCase3() {
        String[] cmps = new String[] {
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
        };

        Assert.assertEquals(Arrays.asList(cmps), g.generateParenthesis(3));
    }
}
