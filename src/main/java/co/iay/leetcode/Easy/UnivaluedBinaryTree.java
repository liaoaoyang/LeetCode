package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

public class UnivaluedBinaryTree {
    private boolean travel(TreeNode node, int preVal) {
        if (null == node) {
            return true;
        }

        if (node.val != preVal) {
            return false;
        }

        return travel(node.left, preVal) && travel(node.right, preVal);
    }

    public boolean isUnivalTree(TreeNode root) {
        if (null == root) {
            return true;
        }

        return travel(root, root.val);
    }
}
