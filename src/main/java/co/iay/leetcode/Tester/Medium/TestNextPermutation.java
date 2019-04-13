package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.NextPermutation;
import org.junit.Assert;
import org.junit.Test;

public class TestNextPermutation {
    private NextPermutation n = new NextPermutation();

    @Test
    public void testNextPermutationCase1() {
        int[] nums = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 3, 2};
        n.nextPermutation(nums);
        Assert.assertArrayEquals(nums, expected);
    }

    @Test
    public void testNextPermutationCase2() {
        int[] nums = new int[]{1, 2, 7, 4, 3, 1};
        int[] expected = new int[]{1, 3, 1, 2, 4, 7};
        n.nextPermutation(nums);
        Assert.assertArrayEquals(nums, expected);
    }

    @Test
    public void testNextPermutationCase3() {
        int[] nums = new int[]{3, 2, 1};
        int[] expected = new int[]{1, 2, 3};
        n.nextPermutation(nums);
        Assert.assertArrayEquals(nums, expected);
    }

    @Test
    public void testNextPermutationCase4() {
        int[] nums = new int[]{1, 5, 1};
        int[] expected = new int[]{5, 1, 1};
        n.nextPermutation(nums);
        Assert.assertArrayEquals(nums, expected);
    }
}
