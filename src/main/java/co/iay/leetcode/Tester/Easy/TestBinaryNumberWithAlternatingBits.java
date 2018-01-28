package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.BinaryNumberWithAlternatingBits;
import org.junit.Assert;
import org.junit.Test;

public class TestBinaryNumberWithAlternatingBits {
    private BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

    @Test
    public void testBinaryNumberWithAlternatingBitsCase1() {
        Assert.assertEquals(true, b.hasAlternatingBits(5));
    }

    @Test
    public void testBinaryNumberWithAlternatingBitsCase2() {
        Assert.assertEquals(false, b.hasAlternatingBits(7));
    }

    @Test
    public void testBinaryNumberWithAlternatingBitsCase3() {
        Assert.assertEquals(false, b.hasAlternatingBits(11));
    }

    @Test
    public void testBinaryNumberWithAlternatingBitsCase4() {
        Assert.assertEquals(true, b.hasAlternatingBits(10));
    }
}
