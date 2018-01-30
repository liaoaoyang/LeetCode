package co.iay.leetcode.Easy;

/**
 * 198. House Robber
 * https://leetcode.com/problems/house-robber/
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint
 * stopping you from robbing each of them is that adjacent houses have
 * security system connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money
 * of each house, determine the maximum amount of money you can rob tonight
 * without alerting the police.
 * Solution:
 * 关键在于判断如何是否加上当前一间屋子的价值，由于不能加上相邻屋子的价值，
 * 需要判断加上当前屋子的价值和不加上当前屋子的价值的选择之间哪个更为有利。
 * 可以得出递推公式为：
 * dp[i] = max(dp[i - 2] + nums[i], dp[i - 1])
 */
public class HouseRobber {
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

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; ++i) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
