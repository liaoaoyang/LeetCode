package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by aoyang on 16/6/8.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int n : nums) {
            if (m.containsKey(n)) {
                return true;
            }

            m.put(n, 1);
        }

        return false;
    }
}
