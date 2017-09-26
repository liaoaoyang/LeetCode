package co.iay.leetcode.Medium;

/**
 * 300. Longest Increasing Subsequence
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 *
 * For example,
 * Given [10, 9, 2, 5, 3, 7, 101, 18],
 * The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4.
 * Note that there may be more than one LIS combination, it is only necessary for you
 * to return the length.
 *
 * Your algorithm should run in O(n2) complexity.
 *
 * Follow up: Could you improve it to O(n log n) time complexity?
 *
 * Notes:
 *
 * dp:
 *
 * dp[i] = n[i] > n[j] ? max(dp[i], dp[j] + 1) : n[i] = n[i]
 *
 * 对于每个数字本身，都相当于处于一个增长序列的开端，所以最长长度都是1
 * 当当前值(下标i)大于之前的值（下标j），说明在以当前值为终点的序列中，
 * 至少拥有一个长度比下标j的数字作为序列终点的长度多1的增长序列。
 */

public class LongestIncreasingSubsequence {
    private int o2Solution(int[] nums) {
        int maxLength = 0;
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            dp[i] = 1;

            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if (maxLength < dp[i]) {
                maxLength = dp[i];
            }
        }

        return maxLength;
    }

    public int lengthOfLIS(int[] nums) {
        return o2Solution(nums);
    }
}
