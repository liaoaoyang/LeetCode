package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * 965. Univalued Binary Tree
 * https://leetcode.com/problems/univalued-binary-tree/
 * A binary tree is univalued if every node in the tree has the same value.
 * <p>
 * Return true if and only if the given tree is univalued.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: [1,1,1,1,1,null,1]
 * Output: true
 * Example 2:
 * <p>
 * <p>
 * Input: [2,2,2,5,2]
 * Output: false
 * <p>
 * <p>
 * Note:
 * <p>
 * The number of nodes in the given tree will be in the range [1, 100].
 * Each node's value will be an integer in the range [0, 99].
 */
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
