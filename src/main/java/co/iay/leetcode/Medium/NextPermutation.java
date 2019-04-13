package co.iay.leetcode.Medium;

import java.util.Arrays;

/**
 * 31. Next Permutation
 * https://leetcode.com/problems/next-permutation/
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * <p>
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * <p>
 * The replacement must be in-place and use only constant extra memory.
 * <p>
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * <p>
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int sep = nums.length - 2;

        while (sep >= 0 && nums[sep] >= nums[sep + 1]) {
            --sep;
        }

        if (sep < 0) {
            Arrays.sort(nums);
            return;
        }

        int firstGreaterThanNumAtSep = nums.length - 1;

        while (firstGreaterThanNumAtSep >= 0 &&
                nums[firstGreaterThanNumAtSep] <= nums[sep]) {
            --firstGreaterThanNumAtSep;
        }

        if (sep != firstGreaterThanNumAtSep) {
            int tmp = nums[sep];
            nums[sep] = nums[firstGreaterThanNumAtSep];
            nums[firstGreaterThanNumAtSep] = tmp;
        }

        Arrays.sort(nums, sep + 1, nums.length);
    }
}
