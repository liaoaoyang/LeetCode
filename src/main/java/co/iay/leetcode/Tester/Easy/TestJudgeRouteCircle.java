package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.JudgeRouteCircle;
import org.junit.Assert;
import org.junit.Test;

public class TestJudgeRouteCircle {
    private JudgeRouteCircle j = new JudgeRouteCircle();

    @Test
    public void testJudgeRouteCircleCase1() {
        Assert.assertEquals(true, j.judgeCircle("UD"));
    }

    @Test
    public void testJudgeRouteCircleCase2() {
        Assert.assertEquals(false, j.judgeCircle("LL"));
    }
}
