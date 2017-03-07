package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.TwoSumII;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/26.
 */
public class TestTwoSumII {
    private TwoSumII t = new TwoSumII();

    @Test
    public void testTwoSumIICase1() {
        Assert.assertArrayEquals(new int[] {1, 2}, t.twoSum(new int[] {2, 7, 11, 15}, 9));
    }
}
