package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * 98. Validate Binary Search Tree
 * https://leetcode.com/problems/validate-binary-search-tree/
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * Assume a BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 * 2
 * / \
 * 1   3
 * Binary tree [2,1,3], return e.
 * Example 2:
 * 1
 * / \
 * 2   3
 * Binary tree [1,2,3], return false.
 */
public class ValidateBinarySearchTree {
    private boolean isValidBST(TreeNode root, long low, long high) {
        if (null == root) {
            return true;
        }

        if (root.val <= low || root.val >= high) {
            return false;
        }

        return isValidBST(root.left, low, root.val) && isValidBST(root.right, root.val, high);
    }

    public boolean isValidBST(TreeNode root) {
        if (null == root) {
            return true;
        }

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
