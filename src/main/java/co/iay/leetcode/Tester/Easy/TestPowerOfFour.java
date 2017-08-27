package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.PowerOfFour;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/8/11.
 */
public class TestPowerOfFour {
    private PowerOfFour powerOfFour = new PowerOfFour();

    @Test
    public void testPowerOfFourCase1() {
        Assert.assertEquals(true, powerOfFour.isPowerOfFour(1 << 2));
    }

    @Test
    public void testPowerOfFourCase2() {
        Assert.assertEquals(false, powerOfFour.isPowerOfFour((1 << 1) + 1));
    }
}
