package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.AdvantageShuffle;
import org.junit.Assert;
import org.junit.Test;

public class TestAdvantageShuffle {
    private AdvantageShuffle a = new AdvantageShuffle();

    @Test
    public void testAdvantageShuffleCase1() {
        int[] A = new int[]{2, 0, 4, 1, 2};
        int[] B = new int[]{1, 3, 0, 0, 2};
        int[] C = new int[]{2, 0, 2, 1, 4};
        Assert.assertArrayEquals(C, a.advantageCount(A, B));
    }
}
