package co.iay.leetcode.Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 930. Binary Subarrays With Sum
 * https://leetcode.com/problems/binary-subarrays-with-sum/
 * In an array A of 0s and 1s, how many non-empty subarrays have sum S?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: A = [1,0,1,0,1], S = 2
 * Output: 4
 * Explanation:
 * The 4 subarrays are bolded below:
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * <p>
 * <p>
 * Note:
 * <p>
 * A.length <= 30000
 * 0 <= S <= A.length
 * A[i] is either 0 or 1.
 */
public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] A, int S) {
        int result = 0;
        int nowSum = 0;
        Map<Integer, Integer> target = new HashMap<>(A.length);
        target.put(0, 1);

        for (int aA : A) {
            nowSum += aA;
            result += target.getOrDefault(nowSum - S, 0);
            target.putIfAbsent(nowSum, 0);
            target.put(nowSum, target.get(nowSum) + 1);
        }

        return result;
    }
}
