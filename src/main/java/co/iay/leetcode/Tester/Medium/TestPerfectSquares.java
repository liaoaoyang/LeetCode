package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.PerfectSquares;
import org.junit.Assert;
import org.junit.Test;

public class TestPerfectSquares {
    private PerfectSquares p = new PerfectSquares();

    @Test
    public void testPerfectSquaresCase1() {
        Assert.assertEquals(3, p.numSquares(12));
    }

    @Test
    public void testPerfectSquaresCase3() {
        Assert.assertEquals(2, p.numSquares(13));
    }
}
