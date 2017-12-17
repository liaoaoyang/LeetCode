package co.iay.leetcode.Medium;

import java.util.Arrays;

/**
 * 16. 3Sum Closest
 * https://leetcode.com/problems/3sum-closest/
 * Given an array S of n integers, find three integers in S
 * such that the sum is closest to a given number, target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 * <p>
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * <p>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Solution:
 * 类比3Sum，做法变为逐个比较差值，每当出现最小的差值时进行记录。
 */
public class The3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int closet = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        int diff = Math.abs(closet - target);

        for (int i = 0; i < nums.length - 2; ++i) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int nowDiff = Math.abs(sum - target);

                if (nowDiff < diff) {
                    diff = nowDiff;
                    closet = sum;
                }

                if (sum < target) {
                    ++left;
                } else {
                    --right;
                }
            }
        }

        return closet;
    }
}
