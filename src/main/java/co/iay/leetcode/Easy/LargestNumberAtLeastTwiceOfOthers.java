package co.iay.leetcode.Easy;

/**
 * 748. Largest Number At Least Twice of Others
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 * In a given integer array nums, there is always exactly one largest element.
 * <p>
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 * <p>
 * If it is, return the index of the largest element, otherwise return -1.
 * <p>
 * Example 1:
 * Input: nums = [3, 6, 1, 0]
 * Output: 1
 * Explanation: 6 is the largest integer, and for every other number in the array x,
 * 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
 * Example 2:
 * Input: nums = [1, 2, 3, 4]
 * Output: -1
 * Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
 * Note:
 * nums will have a length in the range [1, 50].
 * Every nums[i] will be an integer in the range [0, 99].
 * Solution:
 * O(n)时间复杂度，首先对所有数字倍乘。
 * 之后如果存在两倍于最大值的，说明遇到了最大值，可以忽略。
 * 后续如果遇到大于最值的数字，说明存在不符合题意的值。
 */
public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = 0;

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; ++i) {
            if (max < nums[i]) {
                result = i;
                max = nums[i];
            }

            nums[i] = 2 * nums[i];
        }

        for (int num : nums) {
            if (2 * max == num) {
                continue;
            }

            if (max < num) {
                return -1;
            }
        }

        return result;
    }
}
