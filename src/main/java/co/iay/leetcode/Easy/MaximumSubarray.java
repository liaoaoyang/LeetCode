package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/3/17.
 * 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    private int oNSolution(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sum = 0;

        for (int n : nums) {
            sum += n;

            if (sum > result) {
                result = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return result;
    }

    public int maxSubArray(int[] nums) {
        return oNSolution(nums);
    }
}
