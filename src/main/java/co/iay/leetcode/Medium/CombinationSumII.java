package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 40. Combination Sum II
 * https://leetcode.com/problems/combination-sum-ii/
 * <p>
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * Each number in C may only be used once in the combination.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 * A solution set is:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 * <p>
 * Solution:
 * 首先，如果能够加和出结果，在都是正数的情况下，可以剔除掉所有比目标值大的数据，因为这些没有意义。
 * 对候选数字排序之后，可以通过递归深搜的方法，记录当前的尝试路径，判断当前和是否超过了目标值。
 * 如果没有超过目标值，那么可以继续尝试下一个数字。
 * 有一种特殊情况，当排序后有多个相同数字时，例如序列[a,b,c]，值为[1,1,2]，目标值为3，那么a+b和a+c
 * 都是满足条件的，但是二者只是同一种情况，没有意义。
 * 所以在选择起始值时，如果出现了连续相同的数字，那么要排除掉这样的情况。
 */
public class CombinationSumII {
    private void travel(List<Integer> candidatesSmallerThanTarget,
                        List<Integer> nowList,
                        List<List<Integer>> result,
                        int start,
                        int sum,
                        int target) {
        for (int i = start; i < candidatesSmallerThanTarget.size(); ++i) {
            int v = candidatesSmallerThanTarget.get(i);

            if (i > start && v == candidatesSmallerThanTarget.get(i - 1)) {
                continue;
            }

            if (sum + v > target) {
                break;
            }

            nowList.add(v);

            if (sum + v == target) {
                result.add(new ArrayList<Integer>(nowList));
            }

            if (sum + v < target) {
                travel(candidatesSmallerThanTarget,
                        nowList,
                        result,
                        i + 1,
                        sum + v,
                        target);
            }

            nowList.remove(nowList.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> nowList = new ArrayList<Integer>();

        List<Integer> candidatesSmallerThanTarget = new ArrayList<Integer>();

        for (int c : candidates) {
            if (c > target) {
                continue;
            }

            candidatesSmallerThanTarget.add(c);
        }

        Collections.sort(candidatesSmallerThanTarget);

        travel(candidatesSmallerThanTarget,
                nowList,
                result,
                0,
                0,
                target);

        return result;
    }
}
