package co.iay.leetcode.Easy;

/**
 * Created by ng on 2017/7/19.
 * 643. Maximum Average Subarray I
 * https://leetcode.com/problems/maximum-average-subarray-i/
 */
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        if (null == nums || 0 == nums.length || 0 == k) {
            return 0;
        }

        if (k > nums.length) {
            return Integer.MIN_VALUE;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        double[] nowKSum = new double[nums.length];
        nowKSum[0] = nums[0];
        double maxSum = nowKSum[0];

        for (int i = 1; i < nums.length; ++i) {
            if (i < k) {
                nowKSum[i] = nowKSum[i - 1] + nums[i];

                if (i == k - 1) {
                    if (nowKSum[i] > maxSum) {
                        maxSum = nowKSum[i];
                    }
                }

                continue;
            }

            nowKSum[i] = nowKSum[i - 1] - nums[i - k] + nums[i];

            if (nowKSum[i] > maxSum) {
                maxSum = nowKSum[i];
            }
        }

        return 1.0 * maxSum / k;
    }
}
