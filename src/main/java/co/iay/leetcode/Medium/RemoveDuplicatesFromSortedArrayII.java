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
    @SuppressWarnings("unused")
    private int bruteForceSolution(int[] nums) {
        long now = Long.MIN_VALUE;
        int nowLength = 0;
        int result = 0;
        int[] tmpNum = new int[nums.length];
        int tmpIndex = 0;

        for (int n : nums) {
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

        System.arraycopy(tmpNum, 0, nums, 0, result);

        return result;
    }

    private int indexMoveSolution(int[] nums) {
        int slowIndex = 0;
        int nowNumberOccurred = 0;
        long now = Long.MIN_VALUE;

        for (int n : nums) {
            nums[slowIndex] = n;

            if (now != n) {
                nowNumberOccurred = 1;
                now = n;
                ++slowIndex;
                continue;
            }

            if (nowNumberOccurred == 1) {
                ++nowNumberOccurred;
                ++slowIndex;
            }
        }

        return slowIndex;
    }

    public int removeDuplicates(int[] nums) {
        return indexMoveSolution(nums);
    }
}
