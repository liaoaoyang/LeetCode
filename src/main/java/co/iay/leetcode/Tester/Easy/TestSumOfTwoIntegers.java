package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SumOfTwoIntegers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/15.
 */
public class TestSumOfTwoIntegers {
    SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();

    @Test
    public void testSumOfTwoIntegersCase1() {
        Assert.assertEquals(3, sumOfTwoIntegers.getSum(1, 2));
    }

    @Test
    public void testSumOfTwoIntegersCase2() {
        Assert.assertEquals(-1, sumOfTwoIntegers.getSum(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testSumOfTwoIntegersCase3() {
        Assert.assertEquals(-2, sumOfTwoIntegers.getSum(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
}
