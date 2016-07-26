package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RotateArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/27.
 */
public class TestRotateArray {
    private RotateArray rotateArray = new RotateArray();

    @Test
    public void testRotateArrayCase1() {
        int[] nums = new int[]{1, 2, 3};
        rotateArray.rotate(nums, 1);
        Assert.assertArrayEquals(new int[]{3, 1, 2}, nums);
    }
}
