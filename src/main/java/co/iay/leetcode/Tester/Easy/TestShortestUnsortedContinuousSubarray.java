package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ShortestUnsortedContinuousSubarray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/5/16.
 */
public class TestShortestUnsortedContinuousSubarray {
    private ShortestUnsortedContinuousSubarray s = new ShortestUnsortedContinuousSubarray();

    @Test
    public void testShortestUnsortedContinuousSubarrayCase1() {
        int[] input = new int[]{2, 6, 4, 8, 10, 9, 15};
        Assert.assertEquals(5, s.findUnsortedSubarray(input));
    }

    @Test
    public void testShortestUnsortedContinuousSubarrayCase2() {
        int[] input = new int[]{1, 2, 3, 4};
        Assert.assertEquals(0, s.findUnsortedSubarray(input));
    }

    @Test
    public void testShortestUnsortedContinuousSubarrayCase3() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(0, s.findUnsortedSubarray(input));
    }

    @Test
    public void testShortestUnsortedContinuousSubarrayCase4() {
        int[] input = new int[]{4, 3, 2, 1};
        Assert.assertEquals(4, s.findUnsortedSubarray(input));
    }

    @Test
    public void testShortestUnsortedContinuousSubarrayCase5() {
        int[] input = new int[]{5, 4, 3, 2, 1};
        Assert.assertEquals(5, s.findUnsortedSubarray(input));
    }

    @Test
    public void testShortestUnsortedContinuousSubarrayCase6() {
        int[] input = new int[]{1};
        Assert.assertEquals(0, s.findUnsortedSubarray(input));
    }
}
