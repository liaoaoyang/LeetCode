package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/4/9.
 * 94. Binary Tree Inorder Traversal
 * https://leetcode.com/problems/binary-tree-inorder-traversal
 */
public class BinaryTreeInorderTraversal {
    private void ir(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            ir(result, node.left);
        }

        result.add(node.val);

        if (node.right != null) {
            ir(result, node.right);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        ir(result, root);

        return result;
    }
}
