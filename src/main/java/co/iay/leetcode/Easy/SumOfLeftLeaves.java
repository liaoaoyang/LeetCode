package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 17/2/12.
 */
public class SumOfLeftLeaves {
    private boolean hasLeftLeaves(TreeNode node) {
        if (node == null) {
            return false;
        }

        if (node.left == null) {
            return false;
        }

        if (node.left.left == null && node.left.right == null) {
            return true;
        }

        return false;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (hasLeftLeaves(root)) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
