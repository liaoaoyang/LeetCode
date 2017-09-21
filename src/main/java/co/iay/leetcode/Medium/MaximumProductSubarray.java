package co.iay.leetcode.Medium;

/**
 * 152. Maximum Product Subarray
 * https://leetcode.com/problems/maximum-product-subarray/
 *
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.
 *
 * For example, given the array [2,3,-2,4],
 * the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int prevMax = nums[0];
        int prevMin = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            int n = nums[i];
            int nowMax = n;
            int nowMin = n;

            if (n > 0) {
                nowMax = Math.max(n, prevMax * n);
                nowMin = Math.min(n, prevMin * n);
            } else if (n < 0) {
                nowMax = Math.max(n, prevMin * n);
                nowMin = Math.min(n, prevMax * n);
            }

            prevMax = nowMax;
            prevMin = nowMin;

            maxProduct = Math.max(nowMax, maxProduct);
        }

        return maxProduct;
    }
}
