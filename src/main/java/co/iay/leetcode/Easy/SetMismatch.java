package co.iay.leetcode.Easy;

/**
 * Created by ng on 2017/7/28.
 * 645. Set Mismatch
 * https://leetcode.com/problems/set-mismatch/
 */
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] numCount = new int[nums.length];

        for (int n : nums) {
            ++numCount[n - 1];
        }

        for (int i = 0; i < nums.length; ++i) {
            if (numCount[i] == 2) {
                result[0] = i + 1;
                continue;
            }

            if (numCount[i] == 0) {
                if (i == 0) {
                    result[1] = 1;
                } else if (i == nums.length - 1) {
                    result[1] = nums.length;
                } else {
                    result[1] = i + 1;
                }
            }
        }

        return result;
    }
}
