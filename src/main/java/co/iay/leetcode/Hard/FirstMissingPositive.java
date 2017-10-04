package co.iay.leetcode.Hard;

/**
 * Created by ng on 2017/7/13.
 * 41. First Missing Positive
 * https://leetcode.com/problems/first-missing-positive/
 * <p>
 * Given an unsorted integer array, find the first missing positive integer.
 * <p>
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 * <p>
 * Your algorithm should run in O(n) time and uses constant space.
 * <p>
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if (null == nums || nums.length <= 0) {
            return 1;
        }

        for (int i = 0; i < nums.length; ) {
            int tmp = nums[i];

            if (nums[i] >= 1 && nums[i] <= nums.length && nums[tmp - 1] != nums[i] && nums[i] != i + 1) {
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            } else {
                ++i;
            }
        }

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}
