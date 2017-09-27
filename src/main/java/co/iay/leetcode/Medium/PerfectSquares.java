package co.iay.leetcode.Medium;

import java.util.Arrays;

/**
 * 279. Perfect Squares
 * https://leetcode.com/problems/perfect-squares/
 * <p>
 * Given a positive integer n, find the least number of perfect
 * square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * For example,
 * given n = 12, return 3 because 12 = 4 + 4 + 4;
 * given n = 13, return 2 because 13 = 4 + 9.
 * <p>
 * Notes:
 * DP:
 * dp数组大小为n + 1，dp[0]表示数字0，0不应有结果，所以初始化为0，其他设定为Integer.MAX_VALUE
 * dp[i + j * j] = min(dp[i + j * j], dp[i] + 1);
 * 上述等式表示的是，当知道数字i的推导结果时，对于数字 i + j^2，要么本身就是平方数，要么结果就是i的结果加上[1]个数字j。
 * 上述解法效率不高，空间占用率爆表。
 * <p>
 * 四平方和定理（https://zh.wikipedia.org/wiki/%E5%9B%9B%E5%B9%B3%E6%96%B9%E5%92%8C%E5%AE%9A%E7%90%86）：
 * 每个正整数均可表示为4个整数的平方和，所以结果只能是1/2/3/4之一。
 */

public class PerfectSquares {
    private int dpSolution(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for (int i = 0; i * i <= n; i++) {
            dp[i * i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; i + j * j <= n; j++) {
                dp[i + j * j] = Math.min(dp[i] + 1, dp[i + j * j]);
            }
        }

        return dp[n];
    }

    public int numSquares(int n) {
        return dpSolution(n);
    }
}
