package co.iay.leetcode.Medium;

/**
 * 64. Minimum Path Sum
 * https://leetcode.com/problems/minimum-path-sum/
 * <p>
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 * <p>
 * Example 1:
 * [[1,3,1],
 * [1,5,1],
 * [4,2,1]]
 * Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;

        if (m == 0) {
            return 0;
        }

        int n = grid[0].length;

        if (n == 0) {
            return 0;
        }

        int dp[][] = new int[m][n];

        dp[0][0] = grid[0][0];

        for (int i = 1; i < grid[0].length; ++i) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        if (m == 1) {
            return dp[0][n - 1];
        }

        for (int i = 1; i < grid.length; ++i) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        if (n == 1) {
            return dp[m - 1][0];
        }

        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1];
    }
}
