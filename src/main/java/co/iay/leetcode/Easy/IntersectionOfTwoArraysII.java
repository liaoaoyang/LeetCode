package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/5/24.
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] longer = nums1.length > nums2.length ? nums1 : nums2;
        int[] shorter = nums1.length <= nums2.length ? nums1 : nums2;
        HashMap<Integer, Integer> r = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> n1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> n2 = new HashMap<Integer, Integer>();

        for (int i: longer) {
            if (n1.containsKey(i)) {
                n1.put(i, n1.get(i) + 1);
            } else {
                n1.put(i, 1);
            }
        }

        for (int i: shorter) {
            if (n2.containsKey(i)) {
                n2.put(i, n2.get(i) + 1);
            } else {
                n2.put(i, 1);
            }
        }

        int resultLength = 0;

        for (int i: shorter) {
            if (n1.containsKey(i)) {
                r.put(i, Math.min(n1.get(i), n2.get(i)));
            }
        }

        for (Integer i : r.keySet()) {
            resultLength += r.get(i);
        }

        if (resultLength == 0) {
            return new int[0];
        }

        int[] result = new int[resultLength];
        int idx = 0;

        for (Integer i : r.keySet()) {
            int len = r.get(i);

            for (int j = 0; j < len; ++j) {
                result[idx] = i;
                ++idx;
            }
        }

        return result;
    }
}
