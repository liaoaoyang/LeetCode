package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MaximumProductOfThreeNumbers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/7/1.
 */
public class TestMaximumProductOfThreeNumbers {
    private MaximumProductOfThreeNumbers m = new MaximumProductOfThreeNumbers();

    @Test
    public void testMaximumProductOfThreeNumbersCase1() {
        Assert.assertEquals(6, m.maximumProduct(new int[]{1, 2, 3}));
    }

    @Test
    public void testMaximumProductOfThreeNumbersCase2() {
        Assert.assertEquals(24, m.maximumProduct(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testMaximumProductOfThreeNumbersCase3() {
        Assert.assertEquals(36, m.maximumProduct(new int[]{-1, -2, -3, -4, 0, 1, 2, 3}));
    }

    @Test
    public void testMaximumProductOfThreeNumbersCase4() {
        Assert.assertEquals(0, m.maximumProduct(new int[]{-1, -2, -3, -4, 0}));
    }
}
