package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by aoyang on 16/6/8.
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 * <p>
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * Solution:
 * 使用HashMap解决。
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
