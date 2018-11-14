package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.MaxIncreaseToKeepCitySkyline;
import org.junit.Assert;
import org.junit.Test;

public class TestMaxIncreaseToKeepCitySkyline {
    private MaxIncreaseToKeepCitySkyline m = new MaxIncreaseToKeepCitySkyline();

    @Test
    public void testMaxIncreaseToKeepCitySkylineCase1() {
        int[][] grid = new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };

        Assert.assertEquals(35, m.maxIncreaseKeepingSkyline(grid));
    }
}
