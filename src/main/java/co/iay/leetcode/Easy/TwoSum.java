package co.iay.leetcode.Easy;

/**
 * https://leetcode.com/problems/two-sum/
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIdxMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; ++i) {
            numIdxMap.put(nums[i], i);
        }

        int[] idx = new int[2];

        for (int i = 0; i < nums.length; ++i) {
            if (numIdxMap.containsKey(target - nums[i])) {
                int j = numIdxMap.get(target - nums[i]);

                if (i == j) {
                    continue;
                }

                idx[0] = i;
                idx[1] = j;

                if (idx[0] > idx[1]) {
                    int tmp = idx[1];
                    idx[1] = idx[0];
                    idx[0] = tmp;
                }

                break;
            }
        }

        return idx;
    }
}
