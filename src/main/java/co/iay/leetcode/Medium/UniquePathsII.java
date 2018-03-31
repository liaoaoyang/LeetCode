package co.iay.leetcode.Medium;

/**
 * 63. Unique Paths II
 * https://leetcode.com/problems/unique-paths-ii/
 * <p>
 * Follow up for "Unique Paths":
 * <p>
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * <p>
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * <p>
 * For example,
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 * <p>
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 * The total number of unique paths is 2.
 * <p>
 * Note: m and n will be at most 100.
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }

        if (obstacleGrid.length == 1) {
            for (int i : obstacleGrid[0]) {
                if (i == 1) {
                    return 0;
                }
            }
        }

        if (obstacleGrid[0].length == 1) {
            for (int[] anObstacleGrid : obstacleGrid) {
                if (anObstacleGrid[0] == 1) {
                    return 0;
                }
            }
        }

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int dp[][] = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }

                if ((i - 1 >= 0 && obstacleGrid[i - 1][j] != 1 && dp[i - 1][j] != 0) ||
                        (j - 1 >= 0 && obstacleGrid[i][j - 1] != 1 && dp[i][j - 1] != 0) ||
                        (i == 0 && j == 0)) {
                    dp[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
