package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * 1008. Construct Binary Search Tree from Preorder Traversal
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 * Return the root node of a binary search tree that matches the given preorder traversal.
 * <p>
 * (Recall that a binary search tree is a binary tree where for every node,
 * any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.
 * Also recall that a preorder traversal displays the value of the node first,
 * then traverses node.left, then traverses node.right.)
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [8,5,1,7,10,12]
 * Output: [8,5,10,1,7,null,12]
 * <p>
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= preorder.length <= 100
 * The values of preorder are distinct.
 */
@SuppressWarnings("unused")
public class ConstructBinarySearchTreeFromPreorderTraversal {
    private void build(TreeNode node, int val) {
        if (node == null) {
            return;
        }

        if (node.val > val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                build(node.left, val);
            }
            return;
        }

        if (node.val < val) {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                build(node.right, val);
            }
        }
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length <= 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; ++i) {
            build(root, preorder[i]);
        }

        return root;
    }
}
