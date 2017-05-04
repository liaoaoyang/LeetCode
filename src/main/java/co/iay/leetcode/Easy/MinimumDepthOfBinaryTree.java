package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 17/5/4.
 * 111. Minimum Depth of Binary Tree
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDepthOfBinaryTree {
    private int minDepthVal = Integer.MAX_VALUE;

    private void getMinDepth(TreeNode r, int nowDepth) {
        if (r.left == null && r.right == null) {
            minDepthVal = nowDepth < minDepthVal ? nowDepth : minDepthVal;
            return;
        }

        if (r.left != null) {
            getMinDepth(r.left, nowDepth + 1);
        }

        if (r.right != null) {
            getMinDepth(r.right, nowDepth + 1);
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        minDepthVal = Integer.MAX_VALUE;
        getMinDepth(root, 1);
        return minDepthVal;
    }
}
