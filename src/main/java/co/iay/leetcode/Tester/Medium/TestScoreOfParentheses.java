package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.ScoreOfParentheses;
import org.junit.Assert;
import org.junit.Test;

public class TestScoreOfParentheses {
    private ScoreOfParentheses s = new ScoreOfParentheses();

    @Test
    public void testScoreOfParenthesesCase1() {
        Assert.assertEquals(6, s.scoreOfParentheses("(()(()))"));
    }

    @Test
    public void testScoreOfParenthesesCase2() {
        Assert.assertEquals(1, s.scoreOfParentheses("()"));
    }

    @Test
    public void testScoreOfParenthesesCase3() {
        Assert.assertEquals(2, s.scoreOfParentheses("(())"));
    }

    @Test
    public void testScoreOfParenthesesCase4() {
        Assert.assertEquals(2, s.scoreOfParentheses("()()"));
    }

    @Test
    public void testScoreOfParenthesesCase5() {
        Assert.assertEquals(2, s.scoreOfParentheses("(()())"));
    }
}
