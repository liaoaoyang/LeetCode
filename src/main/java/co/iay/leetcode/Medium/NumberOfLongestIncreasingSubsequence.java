package co.iay.leetcode.Medium;

/**
 * 673. Number of Longest Increasing Subsequence
 * https://leetcode.com/problems/number-of-longest-increasing-subsequence/
 * <p>
 * Given an unsorted array of integers, find the number of longest increasing subsequence.
 * <p>
 * Example 1:
 * Input: [1,3,5,4,7]
 * Output: 2
 * Explanation: The two longest increasing subsequence are [1, 3, 4, 7] and [1, 3, 5, 7].
 * Example 2:
 * Input: [2,2,2,2,2]
 * Output: 5
 * Explanation: The length of longest continuous increasing subsequence is 1,
 * and there are 5 subsequences' length is 1, so output 5.
 * Note: Length of the given array will be not exceed 2000 and the answer is guaranteed
 * to be fit in 32-bit signed int.
 */

public class NumberOfLongestIncreasingSubsequence {
    private int o2Solution(int[] nums) {
        int[] dp = new int[nums.length];
        int[] len = new int[nums.length];
        int maxLength = 0;

        for (int i = 0; i < nums.length; ++i) {
            dp[i] = len[i] = 1;

            for (int j = 0; j < i; ++j) {
                if (nums[i] <= nums[j]) {
                    continue;
                }

                if (dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    len[i] = len[j];
                } else if (dp[j] + 1 == dp[i]) {
                    len[i] += len[j];
                }
            }

            if (maxLength < dp[i]) {
                maxLength = dp[i];
            }
        }

        int result = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (dp[i] == maxLength) {
                result += len[i];
            }
        }

        return result;
    }


    public int findNumberOfLIS(int[] nums) {
        return o2Solution(nums);
    }
}
