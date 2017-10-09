package co.iay.leetcode.Medium;

import java.util.List;

/**
 * 120. Triangle
 * https://leetcode.com/problems/triangle/
 * <p>
 * Given a triangle, find the minimum path sum from top to bottom.
 * Each step you may move to adjacent numbers on the row below.
 * <p>
 * For example, given the following triangle
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * <p>
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * <p>
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space,
 * where n is the total number of rows in the triangle.
 * <p>
 * Solution:
 * 题目限制了空间复杂度，要求使用O(n)的空间复杂度。
 * 可以看做已知某一层的路径选择成本，即每个数字，也知道下层的选择成本，可以得知从下层要到达上层的这一个节点，
 * 可以存在的最低成本路径，以题目为例子：
 * [6,5,7]这一层，用[a,b,c]指代，可以选择到达a这个节点的路径可以是4-6与1-6，那么成本肯定是1-6最低，
 * 所以a这个节点的最低到达成本是7。
 * b这个节点路径可以是1-5与8-5，所以b这个节点的最低到达成本是6。
 * c这个节点路径可以是8-7与3-7，所以c这个节点的最低到达成本是10。
 * 综上，[a,b,c]的最低到达成本是[7,6,10]。
 * 继续向上查找，能最终得知到达顶部节点的最低到达成本。
 */

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        int dp[] = new int[height];

        for (int i = 0; i < height; ++i) {
            dp[i] = triangle.get(height - 1).get(i);
        }

        for (int i = height - 2; i >= 0; --i) {
            for (int j = 0; j <= i; ++j) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }

        return dp[0];
    }
}
