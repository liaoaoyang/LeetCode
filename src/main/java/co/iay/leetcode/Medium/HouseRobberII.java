package co.iay.leetcode.Medium;

/**
 * 213. House Robber II
 * https://leetcode.com/problems/house-robber-ii/
 * Note: This is an extension of House Robber.
 * <p>
 * After robbing those houses on that street,
 * the thief has found himself a new place for his thievery so that he will not get too much attention.
 * This time, all houses at this place are arranged in a circle.
 * That means the first house is the neighbor of the last one.
 * Meanwhile, the security system for these houses remain the same as for those in the previous street.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobberII {
    private int rob(int[] nums, int start, int end) {
        int[] dp = new int[end - start + 1];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2; i <= end; ++i) {
            int dpIndex = i - start;
            dp[dpIndex] = Math.max(dp[dpIndex - 2] + nums[i], dp[dpIndex - 1]);
        }

        return dp[dp.length - 1];
    }

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(rob(nums, 0, nums.length - 2),
                rob(nums, 1, nums.length - 1));
    }
}
