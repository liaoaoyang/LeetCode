package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.TwoSum;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/6/30.
 */
public class TestTwoSum {
    TwoSum twoSum = new TwoSum();

    @Test
    public void testTwoSumCase1() {
        Assert.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
