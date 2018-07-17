package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.BinaryGap;
import org.junit.Assert;
import org.junit.Test;

public class TestBinaryGap {
    private BinaryGap b = new BinaryGap();

    @Test
    public void testBinaryGapCase1() {
        Assert.assertEquals(2, b.binaryGap(22));
    }

    @Test
    public void testBinaryGapCase2() {
        Assert.assertEquals(0, b.binaryGap(8));
    }

    @Test
    public void testBinaryGapCase3() {
        Assert.assertEquals(1, b.binaryGap(6));
    }
}
