package co.iay.leetcode.Medium;

/**
 * Created by ng on 16/7/27.
 * 313. Super Ugly Number
 * https://leetcode.com/problems/super-ugly-number/
 * <p>
 * Write a program to find the nth super ugly number.
 * <p>
 * Super ugly numbers are positive numbers whose all prime factors
 * are in the given prime list primes of size k.
 * For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32] is the sequence of
 * the first 12 super ugly numbers given primes = [2, 7, 13, 19] of size 4.
 * <p>
 * Note:
 * (1) 1 is a super ugly number for any given primes.
 * (2) The given numbers in primes are in ascending order.
 * (3) 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.
 * (4) The nth super ugly number is guaranteed to fit in a 32-bit signed integer.
 *
 * Solution:
 * 首先1一定是丑陋数，所以dp[0]一定是1；
 * 有数组index表示当前质数需要尝试进行惩罚操作的被乘数的在结果数组中的下标。
 * 每次将各个质数与当前要尝试的下标进行相乘，找出最小值，
 * 作为下一个数字序列中应该填充的数字，并将对应质数的下标向前推进。
 */
public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int dp[] = new int[n];

        for (int i = 0; i < n; ++i) {
            dp[i] = 1;
        }

        int index[] = new int[primes.length];

        for (int i = 1; i < n; ++i) {
            dp[i] = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; ++j) {
                dp[i] = Math.min(dp[i], dp[index[j]] * primes[j]);
            }

            for (int j = 0; j < primes.length; ++j) {
                if (dp[i] == dp[index[j]] * primes[j]) {
                    ++index[j];
                }
            }
        }

        return dp[n - 1];
    }
}
