package co.iay.leetcode.Medium;

/**
 * 931. Minimum Falling Path Sum
 * https://leetcode.com/problems/minimum-falling-path-sum/
 * Given a square array of integers A, we want the minimum sum of a falling path through A.
 * <p>
 * A falling path starts at any element in the first row, and chooses one element from each row.
 * The next row's choice must be in a column that is different from the previous row's column by at most one.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: 12
 * Explanation:
 * The possible falling paths are:
 * [1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]
 * [2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]
 * [3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]
 * The falling path with the smallest sum is [1,4,7], so the answer is 12.
 * <p>
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length == A[0].length <= 100
 * -100 <= A[i][j] <= 100
 * Solution:
 * 可以求到达当前节点的最小成本，到达当前节点的最小成本可以表示为到达上一层相关节点的成本加上当前节点的成本，取最小值即可。
 * 如果只有一层，那么到达每个节点的成本就是当前节点的成本
 * 到第二层，则可以计算上一层相邻2/3个节点到达当前节点的成本与当前节点之和。
 */
public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        int[][] dp = new int[A.length][];

        for (int i = 0; i < A.length; ++i) {
            dp[i] = new int[A.length];

            if (i != 0) {
                continue;
            }

            System.arraycopy(A[0], 0, dp[i], 0, A.length);
        }

        for (int i = 1; i < A.length; ++i) {
            for (int j = 0; j < A.length; ++j) {
                if (j == 0) {
                    dp[i][j] = Math.min(A[i][j] + dp[i - 1][j], A[i][j] + dp[i - 1][j + 1]);
                    continue;
                }

                if (j == A.length - 1) {
                    dp[i][j] = Math.min(A[i][j] + dp[i - 1][j], A[i][j] + dp[i - 1][j - 1]);
                    continue;
                }

                dp[i][j] = Math.min(A[i][j] + dp[i - 1][j + 1], A[i][j] + dp[i - 1][j - 1]);
                dp[i][j] = Math.min(dp[i][j], A[i][j] + dp[i - 1][j]);
            }
        }

        int result = Integer.MAX_VALUE;

        for (int i : dp[A.length - 1]) {
            if (result < i) {
                continue;
            }

            result = i;
        }

        return result;
    }
}
