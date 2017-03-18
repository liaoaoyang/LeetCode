package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.KDiffPairsInAnArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/3/15.
 */
public class TestKDiffPairsInAnArray {
    private KDiffPairsInAnArray k = new KDiffPairsInAnArray();

    @Test
    public void testKDiffPairsInAnArrayCase1() {
        Assert.assertEquals(2, k.findPairs(new int[] {3, 1, 4, 1, 5}, 2));
    }

    @Test
    public void testKDiffPairsInAnArrayCase2() {
        Assert.assertEquals(4, k.findPairs(new int[] {1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void testKDiffPairsInAnArrayCase3() {
        Assert.assertEquals(1, k.findPairs(new int[] {1, 3, 1, 5, 4}, 0));
    }

    @Test
    public void testKDiffPairsInAnArrayCase4() {
        Assert.assertEquals(1, k.findPairs(new int[] {1, 1, 1, 2, 2}, 1));
    }
}
