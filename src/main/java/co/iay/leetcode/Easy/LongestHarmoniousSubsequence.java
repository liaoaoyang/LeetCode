package co.iay.leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 594. Longest Harmonious Subsequence
 * https://leetcode.com/problems/longest-harmonious-subsequence/
 * We define a harmonious array is an array where the difference
 * between its maximum value and its minimum value is exactly 1.
 * <p>
 * Now, given an integer array, you need to find the length of
 * its longest harmonious subsequence among all its possible subsequences.
 * <p>
 * Example 1:
 * Input: [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * Note: The length of the input array will not exceed 20,000.
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int n : nums) {
            if (!m.containsKey(n)) {
                m.put(n, 0);
            }

            m.put(n, m.get(n) + 1);
        }

        int max = 0;

        for (Map.Entry<Integer, Integer> n : m.entrySet()) {
            int nowLengthSmaller = 0;
            int nowLengthGreater = 0;

            if (m.containsKey(n.getKey() - 1)) {
                nowLengthSmaller = n.getValue() + m.get(n.getKey() - 1);
            }

            if (m.containsKey(n.getKey() + 1)) {
                nowLengthGreater = n.getValue() + m.get(n.getKey() + 1);
            }

            int nowLength = Math.max(nowLengthGreater, nowLengthSmaller);

            max = max < nowLength ? nowLength : max;
        }

        return max;
    }
}
