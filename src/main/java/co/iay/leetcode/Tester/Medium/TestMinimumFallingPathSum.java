package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.MinimumFallingPathSum;
import org.junit.Assert;
import org.junit.Test;

public class TestMinimumFallingPathSum {
    private MinimumFallingPathSum m = new MinimumFallingPathSum();

    @Test
    public void testMinimumFallingPathSumCase1() {
        Assert.assertEquals(12, m.minFallingPathSum(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        }));
    }
}
