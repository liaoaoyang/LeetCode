package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * 938. Range Sum of BST
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 * <p>
 * The binary search tree is guaranteed to have unique values.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
 * Output: 32
 * Example 2:
 * <p>
 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * Output: 23
 * <p>
 * <p>
 * Note:
 * <p>
 * The number of nodes in the tree is at most 10000.
 * The final answer is guaranteed to be less than 2^31.
 */
public class RangeSumOfBST {
    private int sum = 0;

    private void travel(TreeNode root, int L, int R) {
        if (root == null) {
            return;
        }

        if (root.val < L) {
            travel(root.right, L, R);
        } else if (root.val > R) {
            travel(root.left, L, R);
        } else {
            sum += root.val;
            travel(root.left, L, R);
            travel(root.right, L, R);
        }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        sum = 0;
        travel(root, L, R);
        return sum;
    }
}
