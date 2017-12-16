package co.iay.leetcode.Medium;

import java.util.*;

/**
 * 15. 3Sum
 * https://leetcode.com/problems/3sum/
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note: The solution set must not contain duplicate triplets.
 * <p>
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class The3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<String> indexes = new HashSet<String>();

        for (int i = 0; i < nums.length - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int pivot = nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (0 == nums[left] + pivot + nums[right]) {
                    List<Integer> tmp = Arrays.asList(nums[left], pivot, nums[right]);
                    Collections.sort(tmp);

                    if (indexes.contains(tmp.get(0) + "_" + tmp.get(1) + "_" + tmp.get(2))) {
                        ++left;
                        --right;
                        continue;
                    }

                    indexes.add(tmp.get(0) + "_" + tmp.get(1) + "_" + tmp.get(2));
                    result.add(tmp);

                    while (left < right && nums[left] == nums[left + 1]) {
                        ++left;
                    }

                    while (left < right && nums[right - 1] == nums[right]) {
                        --right;
                    }

                    ++left;
                    --right;
                } else if (nums[left] + pivot + nums[right] < 0) {
                    ++left;
                } else {
                    --right;
                }
            }
        }

        return result;
    }
}
