package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FindTheTownJudge;
import org.junit.Assert;
import org.junit.Test;

public class TestFindTheTownJudge {
    private FindTheTownJudge f = new FindTheTownJudge();

    @Test
    public void testFindTheTownJudgeCase1() {
        Assert.assertEquals(2, f.findJudge(
                2, new int[][]{
                        {1, 2}
                }
        ));
    }
}
