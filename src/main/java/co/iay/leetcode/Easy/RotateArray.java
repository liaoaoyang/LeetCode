package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/23.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int numsLen = nums.length;
        k %= numsLen;
        int[] tmp = new int[numsLen];

        for (int i = numsLen - k, j = 0; i < numsLen; ++i, ++j) {
            tmp[j] = nums[i];
        }

        for (int i = 0, j = k; i < numsLen - k; ++i, ++j) {
            tmp[j] = nums[i];
        }

        for (int i = 0; i < numsLen; ++i) {
            nums[i] = tmp[i];
        }

    }
}
