package co.iay.leetcode.Medium;

import java.util.*;

/**
 * 18. 4Sum
 * https://leetcode.com/problems/4sum/
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * <p>
 * Note: The solution set must not contain duplicate quadruplets.
 * <p>
 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 * <p>
 * A solution set is:
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 * Solution:
 * 求出两两数字的组合，之后按照2 Sum的方式进行解题
 */
public class The4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashMap<Integer, List<int[]>> twoSums = new HashMap<Integer, List<int[]>>();

        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                int sum = nums[i] + nums[j];

                if (twoSums.get(sum) == null) {
                    twoSums.put(sum, new ArrayList<int[]>());
                }

                twoSums.get(sum).add(new int[]{i, j});
            }
        }

        int[] sumIndex = new int[4];
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        HashSet<List<Integer>> valueSet = new HashSet<List<Integer>>();

        for (Map.Entry<Integer, List<int[]>> e : twoSums.entrySet()) {
            int sum = target - e.getKey();

            if (twoSums.get(sum) == null) {
                continue;
            }

            List<int[]> list1 = e.getValue();
            List<int[]> list2 = twoSums.get(sum);

            for (int[] l1 : list1) {
                for (int[] l2 : list2) {
                    sumIndex[0] = l1[0];
                    sumIndex[1] = l1[1];
                    sumIndex[2] = l2[0];
                    sumIndex[3] = l2[1];
                    Arrays.sort(sumIndex);

                    if (sumIndex[0] >= sumIndex[1] ||
                            sumIndex[1] >= sumIndex[2] ||
                            sumIndex[2] >= sumIndex[3]) {
                        continue;
                    }

                    List<Integer> r = Arrays.asList(sumIndex[0], sumIndex[1], sumIndex[2], sumIndex[3]);

                    if (set.contains(r)) {
                        continue;
                    }

                    List<Integer> vr = Arrays.asList(nums[sumIndex[0]], nums[sumIndex[1]], nums[sumIndex[2]], nums[sumIndex[3]]);

                    if (valueSet.contains(vr)) {
                        continue;
                    }

                    set.add(r);
                    valueSet.add(vr);
                    result.add(vr);
                }
            }
        }

        return result;
    }
}
