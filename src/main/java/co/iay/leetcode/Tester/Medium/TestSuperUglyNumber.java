package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.SuperUglyNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/27.
 */
public class TestSuperUglyNumber {
    private SuperUglyNumber superUglyNumber = new SuperUglyNumber();

    @Test
    public void testSuperUglyNumberCase1() {
        Assert.assertEquals(32, superUglyNumber.nthSuperUglyNumber(12, new int[]{2, 7, 13, 19}));
    }
}
