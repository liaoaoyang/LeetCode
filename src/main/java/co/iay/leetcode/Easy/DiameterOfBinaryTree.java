package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 17/3/23.
 * 543. Diameter of Binary Tree
 * https://leetcode.com/problems/diameter-of-binary-tree
 */
public class DiameterOfBinaryTree {
    private static int diameter = 0;

    private static void travel(TreeNode root) {
        if (root == null) {
            return;
        }

        int lh = getDepthOfTree(root.left);
        int rh = getDepthOfTree(root.right);
        int mh = lh + rh;

        diameter = mh > diameter ? mh : diameter;

        travel(root.left);
        travel(root.right);
    }

    private static int getDepthOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = getDepthOfTree(root.left);
        int rh = getDepthOfTree(root.right);

        return lh > rh ? lh + 1 : rh + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;

        if (null == root) {
            return 0;
        }

        travel(root);

        return diameter;
    }
}
