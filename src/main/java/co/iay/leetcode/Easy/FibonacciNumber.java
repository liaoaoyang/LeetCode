package co.iay.leetcode.Easy;

/**
 * 509. Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 * <p>
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * Example 3:
 * <p>
 * Input: 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 ≤ N ≤ 30.
 */
public class FibonacciNumber {
    public int fib(int N) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;

        if (N <= 0) {
            return f0;
        } else if (N <= 1) {
            return f1;
        }

        for (int i = 2; i <= N; ++i) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }

        return f2;
    }
}
