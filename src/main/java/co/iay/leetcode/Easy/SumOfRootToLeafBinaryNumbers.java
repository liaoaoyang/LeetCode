package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * 1022. Sum of Root To Leaf Binary Numbers
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 * Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 * <p>
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 * <p>
 * Return the sum of these numbers.
 */
public class SumOfRootToLeafBinaryNumbers {
    private int result = 0;

    private void t(TreeNode node, int now) {
        if (node == null) {
            return;
        }

        if (node.left == node.right && node.left == null) {
            result += (now * 2 + node.val);
        }

        t(node.left, now * 2 + node.val);
        t(node.right, now * 2 + node.val);
    }

    public int sumRootToLeaf(TreeNode root) {
        result = 0;
        t(root, 0);

        return result;
    }
}
