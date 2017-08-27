package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/5/24.
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] longer = nums1.length > nums2.length ? nums1 : nums2;
        int[] shorter = nums1.length <= nums2.length ? nums1 : nums2;
        HashMap<Integer, Integer> r = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> n1 = new HashMap<Integer, Integer>();

        for (int i : longer) {
            n1.put(i, 1);
        }

        for (int i : shorter) {
            if (n1.containsKey(i)) {
                r.put(i, 1);
            }
        }

        if (r.size() == 0) {
            return new int[0];
        }

        int[] result = new int[r.size()];
        int idx = 0;

        for (Integer i : r.keySet()) {
            result[idx] = i;
            ++idx;
        }

        return result;
    }
}
