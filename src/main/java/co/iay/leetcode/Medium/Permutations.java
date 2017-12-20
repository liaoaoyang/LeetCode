package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 46. Permutations
 * https://leetcode.com/problems/permutations/
 * Given a collection of distinct numbers, return all possible permutations.
 * <p>
 * For example,
 * [1,2,3] have the following permutations:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 * Solution:
 * 递归求全部排列组合
 */
public class Permutations {
    private void p(int[] nums, List<Integer> nowNums, HashSet<Integer> used, List<List<Integer>> result) {
        if (nums.length == nowNums.size()) {
            result.add(new ArrayList<Integer>(nowNums));
            return;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (used.contains(i)) {
                continue;
            }

            used.add(i);
            nowNums.add(nums[i]);
            p(nums, nowNums, used, result);
            nowNums.remove(nowNums.size() - 1);
            used.remove(i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        p(nums, new ArrayList<Integer>(), new HashSet<Integer>(), result);
        return result;
    }
}
