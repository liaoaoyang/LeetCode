package co.iay.leetcode.Medium;

import java.util.*;

/**
 * 78. Subsets
 * https://leetcode.com/problems/subsets/description/
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * Example:
 * <p>
 * Input: nums = [1,2,3]
 * Output:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 */
public class Subsets {
    private void ss(List<List<Integer>> result,
                    Set<Integer> used,
                    int[] nums,
                    int len,
                    int startIndex) {

        for (int i = startIndex; i < nums.length; ++i) {
            used.add(nums[i]);

            if (used.size() == len) {
                List<Integer> r = new ArrayList<>(used);
                result.add(r);
            } else {
                ss(result, used, nums, len, i + 1);
            }

            used.remove(nums[i]);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        Set<Integer> used = new HashSet<>();

        for (int i = 1; i <= nums.length; ++i) {
            ss(result, used, nums, i, 0);
        }

        return result;
    }
}
