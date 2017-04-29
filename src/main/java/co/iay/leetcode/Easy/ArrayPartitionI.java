package co.iay.leetcode.Easy;

import java.util.Arrays;

/**
 * Created by ng on 17/4/24.
 * 561. Array Partition I
 * https://leetcode.com/problems/array-partition-i/
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (i % 2 != 0) {
                continue;
            }

            sum += nums[i];
        }

        return sum;
    }
}
