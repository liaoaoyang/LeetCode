package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SumOfSquareNumbers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/7/3.
 */
public class TestSumOfSquareNumbers {
    private SumOfSquareNumbers s = new SumOfSquareNumbers();

    @Test
    public void testSumOfSquareNumbersCase1() {
        Assert.assertEquals(true, s.judgeSquareSum(5));
    }

    @Test
    public void testSumOfSquareNumbersCase2() {
        Assert.assertEquals(false, s.judgeSquareSum(3));
    }

    @Test
    public void testSumOfSquareNumbersCase3() {
        Assert.assertEquals(true, s.judgeSquareSum(25));
    }

    @Test
    public void testSumOfSquareNumbersCase4() {
        Assert.assertEquals(true, s.judgeSquareSum(1000));
    }

    @Test
    public void testSumOfSquareNumbersCase5() {
        Assert.assertEquals(false, s.judgeSquareSum(Integer.MAX_VALUE));
    }

    @Test
    public void testSumOfSquareNumbersCase6() {
        Assert.assertEquals(true, s.judgeSquareSum(2));
    }
}
