package co.iay.leetcode.Easy;

/**
 * 908. Smallest Range I
 * https://leetcode.com/problems/smallest-range-i/
 * Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K,
 * and add x to A[i].
 * <p>
 * After this process, we have some array B.
 * <p>
 * Return the smallest possible difference between the maximum value of B and the minimum value of B.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: A = [1], K = 0
 * Output: 0
 * Explanation: B = [1]
 * Example 2:
 * <p>
 * Input: A = [0,10], K = 2
 * Output: 6
 * Explanation: B = [2,8]
 * Example 3:
 * <p>
 * Input: A = [1,3,6], K = 3
 * Output: 0
 * Explanation: B = [3,3,3] or B = [4,4,4]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * 0 <= K <= 10000
 */
public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        int minA = Integer.MAX_VALUE;
        int maxA = Integer.MIN_VALUE;

        for (int a : A) {
            minA = (minA > a ? a : minA);
            maxA = (maxA < a ? a : maxA);
        }

        if (minA + K >= maxA - K) {
            return 0;
        }

        return maxA - K - minA - K;
    }
}
