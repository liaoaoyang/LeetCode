package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.BaseballGame;
import org.junit.Assert;
import org.junit.Test;

public class TestBaseballGame {
    private BaseballGame b = new BaseballGame();

    @Test
    public void testBaseballGameCase1() {
        Assert.assertEquals(30, b.calPoints(new String[] {"5", "2", "C", "D", "+"}));
    }

    @Test
    public void testBaseballGameCase2() {
        Assert.assertEquals(27, b.calPoints(new String[] {"5", "-2", "4", "C", "D", "9", "+", "+"}));
    }
}
