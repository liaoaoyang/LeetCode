package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 17/2/12.
 */
public class MaximumDepthOfBinaryTree {
    private int maxDepth = 0;

    private int getDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        if (node.left == null && node.right == null) {
            return depth + 1;
        }

        if (node.left != null) {
            int returnDepth = getDepth(node.left, depth + 1);
            maxDepth = (returnDepth > maxDepth ? returnDepth : maxDepth);
        }

        if (node.right != null) {
            int returnDepth = getDepth(node.right, depth + 1);
            maxDepth = (returnDepth > maxDepth ? returnDepth : maxDepth);
        }

        return maxDepth;
    }

    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
    }
}
