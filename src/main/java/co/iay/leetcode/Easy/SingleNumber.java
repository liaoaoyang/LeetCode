package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/9/4.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(nums[i])) {
                m.put(nums[i], m.get(nums[i]) + 1);
                continue;
            }

            m.put(nums[i], 1);

        }

        for (int i = 0; i < nums.length; ++i) {
            if (m.get(nums[i]) == 1) {
                return nums[i];
            }
        }

        return 0;
    }
}
