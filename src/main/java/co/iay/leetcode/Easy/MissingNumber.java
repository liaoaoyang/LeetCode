package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/3/31.
 * 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        boolean hasZero = false;

        for (int i : nums) {
            if (i == 0) {
                hasZero = true;
            }

            sum += i;
        }

        return hasZero ? nums.length * (nums.length + 1) / 2 - sum : 0;
    }
}
