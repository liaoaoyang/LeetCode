package co.iay.leetcode.Medium;

/**
 * 80. Remove Duplicates from Sorted Array II
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * <p>
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
 * It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        long now = Long.MIN_VALUE;
        int nowLength = 0;
        int result = 0;
        int[] tmpNum = new int[nums.length];
        int tmpIndex = 0;

        for (int i = 0; i < nums.length; ++i) {
            int n = nums[i];

            if (now != n) {
                result += nowLength;
                nowLength = 1;
                now = n;
                tmpNum[tmpIndex] = n;
                ++tmpIndex;
                continue;
            }

            if (nowLength < 2) {
                ++nowLength;
                tmpNum[tmpIndex] = n;
                ++tmpIndex;
            }
        }

        result += nowLength;

        for (int i = 0; i < result; ++i) {
            nums[i] = tmpNum[i];
        }

        return result;
    }
}
