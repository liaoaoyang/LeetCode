package co.iay.leetcode.Easy;

/**
 * 704. Binary Search
 * https://leetcode.com/problems/binary-search/
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise return -1.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 * <p>
 * <p>
 * Note:
 * <p>
 * You may assume that all elements in nums are unique.
 * n will be in the range [1, 10000].
 * The value of each element in nums will be in the range [-9999, 9999].
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
