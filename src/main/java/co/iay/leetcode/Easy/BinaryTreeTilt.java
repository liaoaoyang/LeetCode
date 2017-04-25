package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 17/4/25.
 * 563. Binary Tree Tilt
 * https://leetcode.com/problems/binary-tree-tilt
 */
public class BinaryTreeTilt {
    private int tilt = 0;

    private int sumOfTree(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int leftSum = 0;
        int rightSum = 0;

        if (root.left != null) {
            leftSum = sumOfTree(root.left) + root.left.val;
        }

        if (root.right != null) {
            rightSum = sumOfTree(root.right) + root.right.val;
        }

        tilt += Math.abs(leftSum - rightSum);

        return leftSum + rightSum;
    }

    public int findTilt(TreeNode root) {
        tilt = 0;
        sumOfTree(root);
        return tilt;
    }
}
