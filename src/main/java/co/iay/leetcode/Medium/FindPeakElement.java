package co.iay.leetcode.Medium;

/**
 * 162. Find Peak Element
 * https://leetcode.com/problems/find-peak-element/
 * A peak element is an element that is greater than its neighbors.
 * <p>
 * Given an input array where num[i] ≠ num[i+1],
 * find a peak element and return its index.
 * <p>
 * The array may contain multiple peaks,
 * in that case return the index to any one of the peaks is fine.
 * <p>
 * You may imagine that num[-1] = num[n] = -∞.
 * <p>
 * For example, in array [1, 2, 3, 1],
 * 3 is a peak element and your function should return the index number 2.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }

        if (nums[0] > nums[1]) {
            return 0;
        }

        for (int i = 1; i < nums.length - 1; ++i) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }

        return nums.length - 1;
    }
}
