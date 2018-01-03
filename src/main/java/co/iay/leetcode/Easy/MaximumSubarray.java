package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/3/17.
 * 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * <p>
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * Solution:
 * 最大子数组和，如果子数组没有任何元素，那么子数组和是0。
 * 不断累加当前子数组的数字，如果累加和大于0的话，说明还有可能在未来的序列中不断加和出现新的最大值。
 * 一旦累加和小于0，则说明当前的序列的和已经小于不包含任何元素的子序列，需要尝试新的一个子序列。
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
