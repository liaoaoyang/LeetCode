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
 * Solution:
 * 由于A[i]的值在-100到100之间，需要一个201长度的数组记录各个数字出现的次数。
 * 核心在于求各个数字出现的次数和数字本身的乘积。
 * K值的存在会有如下几个影响：
 * 1) 对于负数，可以将小于K个负数变成正数，在这些操作后K的值记做K1
 * 2) K1仍然大于0时，如果存在0，那么由于0没有符号，不会影响最后结果，K值变为0
 * 3) 在K1经过步骤2的判断之后仍然大于0，由于一次操作就是反转符号位，那么实际上偶数K1等于不进行操作，
 * 奇数次K1实际上等于操作1次，在本步骤中全部操作的是正数，所以为了求最大值，只需要选出最小的正数变为
 * 复数即可。
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
