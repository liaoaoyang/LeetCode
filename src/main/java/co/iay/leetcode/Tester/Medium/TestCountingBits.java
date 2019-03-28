package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.CountingBits;
import org.junit.Assert;
import org.junit.Test;

public class TestCountingBits {
    private CountingBits c = new CountingBits();

    @Test
    public void testCountingBitsCase1() {
        Assert.assertArrayEquals(
                new int[]{0, 1, 1},
                c.countBits(2)
        );
    }

    @Test
    public void testCountingBitsCase2() {
        Assert.assertArrayEquals(
                new int[]{0, 1, 1, 2, 1, 2},
                c.countBits(5)
        );
    }
}
