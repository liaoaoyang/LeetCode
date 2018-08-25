package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FairCandySwap;
import org.junit.Assert;
import org.junit.Test;

public class TestFairCandySwap {
    private FairCandySwap f = new FairCandySwap();

    @Test
    public void testFairCandySwapCase1() {
        Assert.assertArrayEquals(new int[]{1, 2},
                f.fairCandySwap(new int[]{1, 2}, new int[]{2, 3}));
    }

    @Test
    public void testFairCandySwapCase2() {
        Assert.assertArrayEquals(new int[]{5, 4},
                f.fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4}));
    }
}
