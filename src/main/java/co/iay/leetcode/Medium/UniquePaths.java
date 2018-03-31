package co.iay.leetcode.Medium;

/**
 * 62. Unique Paths
 * https://leetcode.com/problems/unique-paths/
 * <p>
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid
 * (marked 'Finish' in the diagram below).
 * <p>
 * How many possible unique paths are there?
 * <p>
 * Above is a 3 x 7 grid.
 * <p>
 * How many possible unique paths are there?
 * <p>
 * Note: m and n will be at most 100.
 * Solution:
 * 到达终点的上方和左方的方块的路线是没有重叠的，所以可以先到达这两个位置，然后通过唯一的路线到达终点。
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m < 1 || n < 1) {
            return 0;
        }

        int dp[][] = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                dp[i][j] = 1;
            }
        }

        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
