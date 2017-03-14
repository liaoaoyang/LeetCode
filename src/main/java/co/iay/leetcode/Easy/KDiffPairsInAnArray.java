package co.iay.leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ng on 17/3/15.
 * 532. K-diff Pairs in an Array
 * https://leetcode.com/problems/k-diff-pairs-in-an-array
 */
public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }

        Map<Integer, Integer> greater = new HashMap<Integer, Integer>(nums.length);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>(nums.length);

        for (int n : nums) {
            if (!greater.containsKey(n + k)) {
                greater.put(n + k, 0);
            }

            if (k == 0) {
                greater.put(n + k, greater.get(n + k) + 1);
            }

            m.put(n, 1);
        }

        int result = 0;

        for (int n : nums) {
            if (k == 0) {
                if (greater.containsKey(n) && greater.get(n) > 1) {
                    ++result;
                    greater.remove(n);
                }

                continue;
            }

            if (greater.containsKey(n) && m.containsKey(n - k)) {
                ++result;
                greater.remove(n);
            }
        }

        return result;
    }
}
