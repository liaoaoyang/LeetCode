package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/4/17.
 * 144. Binary Tree Preorder Traversal
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class BinaryTreePreorderTraversal {
    private static void pt(List<Integer> l, TreeNode root) {
        if (null == root) {
            return;
        }

        l.add(root.val);
        pt(l, root.left);
        pt(l, root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<Integer>();
        pt(r, root);

        return r;
    }
}
