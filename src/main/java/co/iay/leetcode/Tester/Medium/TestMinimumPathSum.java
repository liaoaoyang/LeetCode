package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.MinimumPathSum;
import org.junit.Assert;
import org.junit.Test;

public class TestMinimumPathSum {
    private MinimumPathSum m = new MinimumPathSum();

    @Test
    public void testMinimumPathSumCase1() {
        Assert.assertEquals(7, m.minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1},
        }));
    }

    @Test
    public void testMinimumPathSumCase2() {
        Assert.assertEquals(3, m.minPathSum(new int[][]{
                {1, 2},
        }));
    }

    @Test
    public void testMinimumPathSumCase3() {
        Assert.assertEquals(3, m.minPathSum(new int[][]{
                {1},
                {2},
        }));
    }

    @Test
    public void testMinimumPathSumCase4() {
        Assert.assertEquals(1, m.minPathSum(new int[][]{
                {1},
        }));
    }
}
