package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ClimbingStairs;
import org.junit.Assert;
import org.junit.Test;

public class TestClimbingStairs {
    private ClimbingStairs c = new ClimbingStairs();

    @Test
    public void testClimbingStairsCase1() {
        // 1
        Assert.assertEquals(1, c.climbStairs(1));
    }

    @Test
    public void testClimbingStairsCase2() {
        // 1 1
        // 2
        Assert.assertEquals(2, c.climbStairs(2));
    }

    @Test
    public void testClimbingStairsCase3() {
        // 1 1 1
        // 1 2
        // 2 1
        Assert.assertEquals(3, c.climbStairs(3));
    }

    @Test
    public void testClimbingStairsCase4() {
        // 1 1 1 1
        // 1 1 2
        // 1 2 1
        // 2 1 1
        // 2 2
        Assert.assertEquals(5, c.climbStairs(4));
    }
}
