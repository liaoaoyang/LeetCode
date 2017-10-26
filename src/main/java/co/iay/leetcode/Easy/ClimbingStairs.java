package co.iay.leetcode.Easy;

/**
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * Solution:
 * 本题因为可以一次走1步或者2步，可以分解为如果离当前台阶1步或者2步，
 * 只会有一种走法，就是选择走1步或者走2步。
 * 所以演变为可以有多少种走法之和的问题。
 */
public class ClimbingStairs {
    private int lessSpaceSolution(int n) {
        if (n == 1) {
            return 1;
        }

        int dp1 = 1;
        int dp2 = 1;

        for (int i = 0; i < n; ++i) {
            dp2 += dp1;
            dp1 = dp2 - dp1;
        }

        return dp1;
    }

    @SuppressWarnings("unused")
    private int dpSolution(int n) {
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < n; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }

    public int climbStairs(int n) {
        return lessSpaceSolution(n);
    }
}
