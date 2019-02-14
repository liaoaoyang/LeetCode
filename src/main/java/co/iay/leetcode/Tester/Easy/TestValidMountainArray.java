package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ValidMountainArray;
import org.junit.Assert;
import org.junit.Test;

public class TestValidMountainArray {
    private ValidMountainArray v = new ValidMountainArray();

    @Test
    public void testValidMountainArrayCase1() {
        Assert.assertFalse(v.validMountainArray(
                new int[]{2, 1}
        ));
    }

    @Test
    public void testValidMountainArrayCase2() {
        Assert.assertFalse(v.validMountainArray(
                new int[]{3, 5, 5}
        ));
    }

    @Test
    public void testValidMountainArrayCase3() {
        Assert.assertTrue(v.validMountainArray(
                new int[]{0, 3, 2, 1}
        ));
    }

    @Test
    public void testValidMountainArrayCase4() {
        Assert.assertTrue(v.validMountainArray(
                new int[]{0, 1, 2, 4, 2, 1}
        ));
    }
}
