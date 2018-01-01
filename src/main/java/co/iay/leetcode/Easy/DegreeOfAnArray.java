package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * 697. Degree of an Array
 * https://leetcode.com/problems/degree-of-an-array/
 * Given a non-empty array of non-negative integers nums,
 * the degree of this array is defined as the maximum frequency of any one of its elements.
 * <p>
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums,
 * that has the same degree as nums.
 * <p>
 * Example 1:
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 * Example 2:
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 * Note:
 * <p>
 * nums.length will be between 1 and 50,000.
 * nums[i] will be an integer between 0 and 49,999.
 * Solution:
 * 首先判断数字出现次数，如果大于最大值，则记录当前数字的间距值；
 * 如果出现频率等于最大频率，则判断数字距离是否更小，如果更小，则记录结果。
 */
public class DegreeOfAnArray {
    private class Info {
        public int start = -1;
        public int end   = -1;
        public int count = 0;
    }

    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Info> idx = new HashMap<Integer, Info>();
        Info max = null;

        for (int i = 0; i < nums.length; ++i) {
            int n = nums[i];
            Info info;

            if (!idx.containsKey(n)) {
                info = new Info();
                info.start = i;
                info.end = i;
                info.count++;
                idx.put(n, info);
            } else {
                info = idx.get(n);
                info.end = i;
                ++info.count;
                idx.put(n, info);
            }

            if (null == max) {
                max = info;
                continue;
            }

            if (max.count == info.count) {
                if (max.end - max.start > info.end - info.start) {
                    max = info;
                    continue;
                }
            }

            if (max.count < info.count) {
                max = info;
            }
        }

        return max.end - max.start + 1;
    }
}
