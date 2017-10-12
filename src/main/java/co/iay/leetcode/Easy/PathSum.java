package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * 112. Path Sum
 * https://leetcode.com/problems/path-sum/
 * <p>
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * <p>
 * For example:
 * Given the below binary tree and sum = 22,
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * <p>
 * Solution:
 * 简单题，需要注意的地方即这个和要求是从根节点到叶子节点的，所以需要注意是否已经到达叶子节点。
 */

public class PathSum {
    private boolean result = false;

    private void travel(TreeNode root, int sum, int nowSum) {
        if (result) {
            return;
        }

        if (root == null) {
            return;
        }

        if (root.val + nowSum > sum) {
            return;
        }

        // 必须已经到达叶子节点
        if (root.val + nowSum == sum && root.left == null && root.right == null) {
            result = true;
            return;
        }

        travel(root.left, sum, nowSum + root.val);
        travel(root.right, sum, nowSum + root.val);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        result = false;
        travel(root, sum, 0);
        return result;
    }
}
