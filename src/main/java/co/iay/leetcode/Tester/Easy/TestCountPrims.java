package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.CountPrimes;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/31.
 */
public class TestCountPrims {
    private CountPrimes countPrimes = new CountPrimes();

    @Test
    public void testCountPrimesCase1() {
        Assert.assertEquals(0, countPrimes.countPrimes(0));
    }

    @Test
    public void testCountPrimesCase2() {
        Assert.assertEquals(0, countPrimes.countPrimes(1));
    }

    @Test
    public void testCountPrimesCase3() {
        Assert.assertEquals(0, countPrimes.countPrimes(2));
    }

    @Test
    public void testCountPrimesCase4() {
        Assert.assertEquals(1, countPrimes.countPrimes(3));
    }

    @Test
    public void testCountPrimesCase5() {
        Assert.assertEquals(2, countPrimes.countPrimes(4));
    }

    @Test
    public void testCountPrimesCase6() {
        Assert.assertEquals(2, countPrimes.countPrimes(5));
    }
}
