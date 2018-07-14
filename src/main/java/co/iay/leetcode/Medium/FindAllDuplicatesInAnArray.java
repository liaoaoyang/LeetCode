package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 442. Find All Duplicates in an Array
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * <p>
 * Find all the elements that appear twice in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime?
 * <p>
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [2,3]
 * Solution:
 * 限制于本题目条件，数字[1,n]，不包含重复的序列为：
 * [1,2,...,n]
 * 可以通过正负数标记是否出现2次，如果某个数字对应位的数字已经被标记为负数了，说明曾经出现过。
 * 以题目中的case举例：
 * [4,3,2,7,8,2,3,1]
 * 4 [4, 3, 2, 7, 8, 2, 3, 1]      [4, 3, 2, -7, 8, 2, 3, 1]
 * 3 [4, 3, 2, -7, 8, 2, 3, 1]     [4, 3, -2, -7, 8, 2, 3, 1]
 * 2 [4, 3, -2, -7, 8, 2, 3, 1]    [4, -3, -2, -7, 8, 2, 3, 1]
 * 7 [4, -3, -2, -7, 8, 2, 3, 1]   [4, -3, -2, -7, 8, 2, -3, 1]
 * 8 [4, -3, -2, -7, 8, 2, -3, 1]  [4, -3, -2, -7, 8, 2, -3, -1]
 * 2 [4, -3, -2, -7, 8, 2, -3, -1] [4, 3, -2, -7, 8, 2, -3, -1]
 * 3 [4, 3, -2, -7, 8, 2, -3, -1]  [4, 3, 2, -7, 8, 2, -3, -1]
 * 1 [4, 3, 2, -7, 8, 2, -3, -1]   [-4, 3, 2, -7, 8, 2, -3, -1]
 */
public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            int idx = Math.abs(nums[i]) - 1;

            if (nums[idx] < 0) {
                result.add(idx + 1);
            }

            nums[idx] = -nums[idx];
        }

        return result;
    }
}
