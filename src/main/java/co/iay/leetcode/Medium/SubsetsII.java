package co.iay.leetcode.Medium;

import java.util.*;

/**
 * 90. Subsets II
 * https://leetcode.com/problems/subsets-ii/description/
 * Given a collection of integers that might contain duplicates, nums,
 * return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * Example:
 * <p>
 * Input: [1,2,2]
 * Output:
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
 * [1,2],
 * []
 * ]
 */
public class SubsetsII {
    private void ss(List<List<Integer>> result,
                    Set<Integer> used,
                    Set<String> kSet,
                    int[] nums,
                    int len,
                    int startIndex) {

        for (int i = startIndex; i < nums.length; ++i) {
            used.add(i);

            if (used.size() == len) {
                List<Integer> r = new ArrayList<>();

                for (Integer ii : used) {
                    r.add(nums[ii]);
                }

                if (!kSet.contains(r.toString())) {
                    kSet.add(r.toString());
                    result.add(r);
                }
            } else {
                ss(result, used, kSet, nums, len, i + 1);
            }

            used.remove(i);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        Set<Integer> used = new HashSet<>();
        Set<String> kSet = new HashSet<>();

        for (int i = 1; i <= nums.length; ++i) {
            ss(result, used, kSet, nums, i, 0);
        }

        return result;
    }
}
