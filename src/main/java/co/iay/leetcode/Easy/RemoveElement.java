package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/4/30.
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int removed = 0;

        for (int i = 0; i < nums.length - removed; ++i) {
            if (nums[i] == val) {
                for (int j = i; j + 1 < nums.length; ++j) {
                    nums[j] = nums[j + 1];
                }

                ++removed;
                --i;
            }
        }

        return nums.length - removed;
    }
}
