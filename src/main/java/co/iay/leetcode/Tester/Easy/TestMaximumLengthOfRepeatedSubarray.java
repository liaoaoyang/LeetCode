package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MaximumLengthOfRepeatedSubarray;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumLengthOfRepeatedSubarray {
    private MaximumLengthOfRepeatedSubarray m = new MaximumLengthOfRepeatedSubarray();

    @Test
    public void testMaximumLengthOfRepeatedSubarrayCase1() {
        Assert.assertEquals(3, m.findLength(
                new int[]{1, 2, 3, 2, 1},
                new int[]{3, 2, 1, 4, 7}
        ));
    }
}
