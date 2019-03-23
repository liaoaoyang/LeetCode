package co.iay.leetcode.Easy;

/**
 * 1005. Maximize Sum Of Array After K Negations
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 * Given an array A of integers, we must modify the array in the following way:
 * we choose an i and replace A[i] with -A[i], and we repeat this process K times in total.
 * (We may choose the same index i multiple times.)
 * <p>
 * Return the largest possible sum of the array after modifying it in this way.
 * <p>
 * Example 1:
 * <p>
 * Input: A = [4,2,3], K = 1
 * Output: 5
 * Explanation: Choose indices (1,) and A becomes [4,-2,3].
 * Example 2:
 * <p>
 * Input: A = [3,-1,0,2], K = 3
 * Output: 6
 * Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].
 * Example 3:
 * <p>
 * Input: A = [2,-3,-1,5,-4], K = 2
 * Output: 13
 * Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 10000
 * 1 <= K <= 10000
 * -100 <= A[i] <= 100
 */
public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        int[] times = new int[201];

        for (int a : A) {
            if (a == 0) {
                times[100]++;
                continue;
            }

            times[a + 100]++;
        }

        for (int i = 0; i < 100 && K > 0; ++i) {
            if (times[i] > 0) {
                int delta = K > times[i] ? times[i] : K;
                times[200 - i] += delta;
                K -= delta;
                times[i] -= delta;
            }
        }

        if (K > 0 && times[100] > 0) {
            K = 0;
        }

        if (K > 0) {
            K %= 2;
        }

        if (K > 0) {
            for (int i = 101; i < times.length; ++i) {
                if (times[i] > 0) {
                    times[200 - i]++;
                    times[i]--;
                    break;
                }
            }
        }

        int result = 0;

        for (int i = 0; i < times.length; ++i) {
            if (i == 100 || times[i] == 0) {
                continue;
            }

            result += (times[i] * (i - 100));
        }

        return result;
    }
}
