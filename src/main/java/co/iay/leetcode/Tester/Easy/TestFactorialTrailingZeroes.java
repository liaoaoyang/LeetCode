package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FactorialTrailingZeroes;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/10.
 */
public class TestFactorialTrailingZeroes {
    FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();

    @Test
    public void testFactorialTrailingZeroesCase1() {
        Assert.assertEquals(0, factorialTrailingZeroes.trailingZeroes(0));
    }

    @Test
    public void testFactorialTrailingZeroesCase2() {
        Assert.assertEquals(0, factorialTrailingZeroes.trailingZeroes(1));
    }

    @Test
    public void testFactorialTrailingZeroesCase3() {
        Assert.assertEquals(0, factorialTrailingZeroes.trailingZeroes(2));
    }

    @Test
    public void testFactorialTrailingZeroesCase4() {
        Assert.assertEquals(1, factorialTrailingZeroes.trailingZeroes(5));
    }

    @Test
    public void testFactorialTrailingZeroesCase5() {
        Assert.assertEquals(2, factorialTrailingZeroes.trailingZeroes(10));
    }

    @Test
    public void testFactorialTrailingZeroesCase6() {
        Assert.assertEquals(24, factorialTrailingZeroes.trailingZeroes(100));
    }
}
