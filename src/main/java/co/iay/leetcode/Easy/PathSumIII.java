package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * 437. Path Sum III
 * https://leetcode.com/problems/path-sum-iii/
 * <p>
 * You are given a binary tree in which each node contains an integer value.
 * <p>
 * Find the number of paths that sum to a given value.
 * <p>
 * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
 * <p>
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
 * <p>
 * Example:
 * <p>
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 * <p>
 * 10
 * /  \
 * 5   -3
 * / \    \
 * 3   2   11
 * / \   \
 * 3  -2   1
 * <p>
 * Return 3. The paths that sum to 8 are:
 * <p>
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3. -3 -> 11
 *
 * Solution:
 * 本题可以让每一个节点都作为起点进行遍历，对于已经获得结果的，还可以继续遍历，因为后续的加和仍有可能获得期望的值。
 */

public class PathSumIII {
    private int result;

    private void t(TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        travel(root, sum, 0);
        t(root.left, sum);
        t(root.right, sum);
    }

    private void travel(TreeNode root, int sum, int nowSum) {
        if (root == null) {
            return;
        }

        if (root.val + nowSum == sum) {
            ++result;
        }

        travel(root.left, sum, nowSum + root.val);
        travel(root.right, sum, nowSum + root.val);
    }

    public int pathSum(TreeNode root, int sum) {
        result = 0;
        t(root, sum);
        return result;
    }
}
