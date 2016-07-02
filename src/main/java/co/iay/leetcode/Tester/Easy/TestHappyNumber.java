package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.HappyNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/3.
 */
public class TestHappyNumber {
    private HappyNumber happyNumber = new HappyNumber();

    @Test
    public void testHappyNumberCase1() {
        Assert.assertEquals(true, happyNumber.isHappy(19));
    }

    @Test
    public void testHappyNumberCase2() {
        Assert.assertEquals(false, happyNumber.isHappy(8));
    }

    @Test
    public void testHappyNumberCase3() {
        Assert.assertEquals(false, happyNumber.isHappy(0));
    }

    @Test
    public void testHappyNumberCase4() {
        Assert.assertEquals(false, happyNumber.isHappy(-1));
    }

    @Test
    public void testHappyNumberCase5() {
        Assert.assertEquals(true, happyNumber.isHappy(1));
    }

    @Test
    public void testHappyNumberCase6() {
        Assert.assertEquals(false, happyNumber.isHappy(Integer.MAX_VALUE));
    }
}
