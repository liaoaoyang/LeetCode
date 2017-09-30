package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * 671. Second Minimum Node In a Binary Tree
 * https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 * <p>
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.
 * <p>
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
 * <p>
 * If no such second minimum value exists, output -1 instead.
 * <p>
 * Example 1:
 * Input:
 *    2
 *   / \
 *  2   5
 *     / \
 *    5   7
 * <p>
 * Output: 5
 * Explanation: The smallest value is 2, the second smallest value is 5.
 * Example 2:
 * Input:
 *  2
 * / \
 * 2   2
 * <p>
 * Output: -1
 * Explanation: The smallest value is 2, but there isn't any second smallest value.
 */
public class SecondMinimumNodeInABinaryTree {
    private Integer first;
    private Integer second;

    private void travel(TreeNode root) {
        if (null == root) {
            return;
        }

        if (first == null || root.val < first) {
            second = first;
            first = root.val;
        } else if ((second == null && root.val > first) ||
                (second != null && root.val > first && root.val < second)) {
            second = root.val;
        }

        travel(root.left);
        travel(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        first = null;
        second = null;

        travel(root);

        return second == null ? -1 : second;
    }
}
