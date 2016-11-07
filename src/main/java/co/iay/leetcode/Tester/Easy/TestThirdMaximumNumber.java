package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ThirdMaximumNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/11/7.
 */
public class TestThirdMaximumNumber {
    ThirdMaximumNumber m = new ThirdMaximumNumber();

    @Test
    public void testThirdMaximumNumberCase1() {
        Assert.assertEquals(1, m.thirdMax(new int[]{3, 2, 1}));
    }

    @Test
    public void testThirdMaximumNumberCase2() {
        Assert.assertEquals(2, m.thirdMax(new int[]{2, 1}));
    }

    @Test
    public void testThirdMaximumNumberCase3() {
        Assert.assertEquals(1, m.thirdMax(new int[]{1}));
    }

    @Test
    public void testThirdMaximumNumberCase4() {
        Assert.assertEquals(-2147483648, m.thirdMax(new int[]{1, 2, -2147483648}));
    }
}
