package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MaximizeSumOfArrayAfterKNegations;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximizeSumOfArrayAfterKNegations {
    private MaximizeSumOfArrayAfterKNegations m = new MaximizeSumOfArrayAfterKNegations();

    @Test
    public void testMaximizeSumOfArrayAfterKNegationsCase1() {
        Assert.assertEquals(5, m.largestSumAfterKNegations(
                new int[]{4, 2, 3}, 1
        ));
    }

    @Test
    public void testMaximizeSumOfArrayAfterKNegationsCase2() {
        Assert.assertEquals(6, m.largestSumAfterKNegations(
                new int[]{3, -1, 0, 2}, 3
        ));
    }

    @Test
    public void testMaximizeSumOfArrayAfterKNegationsCase3() {
        Assert.assertEquals(13, m.largestSumAfterKNegations(
                new int[]{2, -3, -1, 5, -4}, 2
        ));
    }
}
