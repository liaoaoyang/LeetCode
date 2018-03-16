package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RotatedDigits;
import org.junit.Assert;
import org.junit.Test;

public class TestRotatedDigits {
    private RotatedDigits r = new RotatedDigits();

    @Test
    public void testRotatedDigitsCase1() {
        Assert.assertEquals(4, r.rotatedDigits(10));
    }
}
