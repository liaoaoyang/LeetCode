package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/6/24.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i : nums) {
            if (m.containsKey(i)) {
                m.put(i, m.get(i) + 1);
            } else {
                m.put(i, 1);
            }
        }

        for (Integer k : m.keySet()) {
            if (m.get(k) > (int) Math.floor(nums.length / 2.0)) {
                return k;
            }
        }

        return 0;
    }
}
