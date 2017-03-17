package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/3/17.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int[][] tempSum = new int[nums.length][nums.length];
        int[] tempMax = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i; j < nums.length; ++j) {
                tempSum[i][j] = (j == i ? nums[j] : nums[j] + tempSum[i][j - 1]);
                tempMax[i] = (j == i || tempMax[i] < nums[i] ? nums[i] : (tempSum[i][j]> tempMax[i] ? tempSum[i][j] : tempMax[i]));
            }
        }

        int result = Integer.MIN_VALUE;

        for (int s : tempMax) {
            result = (result > s ? result : s);
        }

        return result;
    }
}
