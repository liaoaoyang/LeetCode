package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MonotonicArray;
import org.junit.Assert;
import org.junit.Test;

public class TestMonotonicArray {
    private MonotonicArray m = new MonotonicArray();

    @Test
    public void testMonotonicArrayCase1() {
        Assert.assertTrue(m.isMonotonic(new int[]{1, 2, 3, 3, 4}));
    }

    @Test
    public void testMonotonicArrayCase2() {
        Assert.assertFalse(m.isMonotonic(new int[]{4, 3, 2, 1, -1, -1, 2, 3}));
    }
}
