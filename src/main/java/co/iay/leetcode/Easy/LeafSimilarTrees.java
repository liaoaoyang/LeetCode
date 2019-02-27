package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 872. Leaf-Similar Trees
 * https://leetcode.com/problems/leaf-similar-trees/
 * Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.
 * <p>
 * <p>
 * <p>
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 * <p>
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * <p>
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 * <p>
 * <p>
 * <p>
 * Note:
 * <p>
 * Both of the given trees will have between 1 and 100 nodes.
 */
public class LeafSimilarTrees {
    private void getLeaves(TreeNode root, List<Integer> leaves) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leaves.add(root.val);
        }

        if (root.left != null) {
            getLeaves(root.left, leaves);
        }

        if (root.right != null) {
            getLeaves(root.right, leaves);
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ll = new ArrayList<>();
        getLeaves(root1, ll);
        List<Integer> rl = new ArrayList<>();
        getLeaves(root2, rl);

        return ll.equals(rl);
    }
}
