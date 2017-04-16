package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 17/4/16.
 * 114. Flatten Binary Tree to Linked List
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list
 */
public class FlattenBinaryTreeToLinkedList {
    private TreeNode rightLastNode = null;

    public void flatten(TreeNode root) {
        if (null == root) {
            return;
        }

        if (null != rightLastNode) {
            rightLastNode.left = null;
            rightLastNode.right = root;
        }

        rightLastNode = root;
        TreeNode rightTree = root.right;
        root.right = root.left;
        flatten(root.right);
        flatten(rightTree);
    }
}
