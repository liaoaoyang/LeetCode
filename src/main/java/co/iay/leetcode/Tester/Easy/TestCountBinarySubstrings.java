package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.CountBinarySubstrings;
import org.junit.Assert;
import org.junit.Test;

public class TestCountBinarySubstrings {
    private CountBinarySubstrings c = new CountBinarySubstrings();

    @Test
    public void testCountBinarySubstringsCase1() {
        Assert.assertEquals(6, c.countBinarySubstrings("00110011"));
    }

    @Test
    public void testCountBinarySubstringsCase2() {
        Assert.assertEquals(4, c.countBinarySubstrings("10101"));
    }
}
