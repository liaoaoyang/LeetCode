package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/6/20.
 * <p>
 * Test Cases
 * []
 * 0
 * [1,1,1]
 * 1
 * [1,1,1]
 * 2
 * [1,1,2,1,2,1]
 * 4
 * [1,1,2,1,2,1]
 * 1
 * [1,1,2,1,2,1]
 * 2
 * [1,1,2,1,2,1]
 * 3
 * [1,2,3,4,5,6,1,2,1]
 * 2
 */
public class ContainsDuplicateII {
    class IJ {
        public int i = 0;
        public int j = 0;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, IJ> m = new HashMap<Integer, IJ>();

        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(nums[i])) {
                if (i > m.get(nums[i]).i) {
                    if (i - m.get(nums[i]).i <= k) {
                        return true;
                    } else {
                        m.get(nums[i]).i = i;
                    }
                }

                continue;
            }

            IJ v = new IJ();
            v.i = i;
            m.put(nums[i], v);
        }

        return false;
    }
}
