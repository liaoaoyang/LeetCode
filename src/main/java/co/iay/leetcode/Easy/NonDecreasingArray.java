package co.iay.leetcode.Easy;

/**
 * 665. Non-decreasing Array
 * https://leetcode.com/problems/non-decreasing-array/
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }

        int attempt = 0;
        int i = 1;

        for (; i < nums.length && attempt <= 1; ++i) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            }

            if (i == 1) {
                // 4 2 3 -> 2 2 3
                nums[i - 1] = nums[i];
            } else {
                if (nums[i] > nums[i - 2]) {
                    // 1 4 2 -> 1 2 2
                    nums[i - 1] = nums[i];
                } else {
                    // 3 4 2 -> 3 4 4
                    nums[i] = nums[i - 1];
                }
            }

            ++attempt;
        }

        return attempt <= 1;
    }
}
