package co.iay.leetcode.Easy;

/**
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
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
