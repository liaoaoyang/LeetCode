package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MinCostClimbingStairs;
import org.junit.Assert;
import org.junit.Test;

public class TestMinCostClimbingStairs {
    private MinCostClimbingStairs m = new MinCostClimbingStairs();

    @Test
    public void testMinCostClimbingStairsCase1() {
        Assert.assertEquals(15, m.minCostClimbingStairs(
                new int[]{10, 15, 20}
        ));
    }

    @Test
    public void testMinCostClimbingStairsCase2() {
        Assert.assertEquals(6, m.minCostClimbingStairs(
                new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}
        ));
    }
}
