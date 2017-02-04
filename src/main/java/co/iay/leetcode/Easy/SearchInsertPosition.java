package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/2/4.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] >= target) {
            return 0;
        }

        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;
            int middleValue = nums[middle];

            if (middleValue == target) {
                return middle;
            }

            if (middleValue > target) {
                right = middle;
                continue;
            }

            if (middleValue < target) {
                left = middle + 1;
            }
        }

        return nums[left] > target ? left : right;
    }
}
