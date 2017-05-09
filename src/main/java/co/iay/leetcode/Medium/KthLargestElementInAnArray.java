package co.iay.leetcode.Medium;

import java.util.Arrays;

/**
 * Created by ng on 2017/5/7.
 * 215. Kth Largest Element in an Array
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        int[] kPlus1Arr = new int[k + 1];

        for (int i = 0; i < nums.length; ++i) {
            if (i < k) {
                kPlus1Arr[i] = nums[i];

                if (i == k - 1) {
                    kPlus1Arr[k] = Integer.MIN_VALUE;
                    Arrays.sort(kPlus1Arr);
                }

                continue;
            }

            kPlus1Arr[0] = nums[i];
            Arrays.sort(kPlus1Arr);
        }

        return kPlus1Arr[1];
    }
}
