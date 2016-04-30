package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/4/30.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int nowIdx = 1;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1]) {
                nums[nowIdx] = nums[i];
                ++nowIdx;
            }
        }

        return nowIdx;
    }
}
