package co.iay.leetcode.Easy;

/**
 * Created by aoyang on 17/9/15.
 * 674. Longest Continuous Increasing Subsequence
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/
 */
public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int nowLength = 1;
        int maxLength = 1;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] >= nums[i]) {
                maxLength = maxLength < nowLength ? nowLength: maxLength;
                nowLength = 1;
            } else {
                nowLength++;
            }
        }

        return maxLength < nowLength ? nowLength: maxLength;
    }
}
