package co.iay.leetcode.Medium;

/**
 * Created by ng on 2017/7/9.
 * 33. Search in Rotated Sorted Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {
    final private static int NOT_FOUND = -1;

    private int getPivotIndex(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < nums[i - 1]) {
                return i;
            }
        }

        return 0;
    }

    private int binarySearch(int[] nums, int begin, int end, int target) {
        if (nums.length == 0) {
            return NOT_FOUND;
        }

        if (begin > end) {
            return NOT_FOUND;
        }

        while (begin <= end) {
            int mid = (begin + end) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                begin = mid + 1;
            } else {
                return mid;
            }
        }

        return NOT_FOUND;
    }

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return NOT_FOUND;
        }

        if (nums.length == 1) {
            return nums[0] == target ? 0 : NOT_FOUND;
        }

        int leftBegin = 0;
        int rightBegin = getPivotIndex(nums);
        int leftEnd = rightBegin - 1;
        int rightEnd = nums.length - 1;

        int leftResult = binarySearch(nums, leftBegin, leftEnd, target);

        if (leftResult != NOT_FOUND) {
            return leftResult;
        }

        return binarySearch(nums, rightBegin, rightEnd, target);
    }
}
