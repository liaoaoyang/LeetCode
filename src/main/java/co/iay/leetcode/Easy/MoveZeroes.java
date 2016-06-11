package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/11.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                ++zeroCount;
                continue;
            }

            if (zeroCount > 0 && i - zeroCount >= 0) {
                nums[i - zeroCount] = nums[i];
            }
        }

        for (int i = nums.length - zeroCount; i < nums.length; ++i) {
            nums[i] = 0;
        }
    }
}
