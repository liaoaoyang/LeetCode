package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 17/2/26.
 * 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        return TreeNode.buildTree(TreeNode.treeToArrayReverse(root));
    }
}
