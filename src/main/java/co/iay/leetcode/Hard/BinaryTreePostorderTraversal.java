package co.iay.leetcode.Hard;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/4/17.
 * 145. Binary Tree Postorder Traversal
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class BinaryTreePostorderTraversal {
    private static void pt(List<Integer> l, TreeNode root) {
        if (null == root) {
            return;
        }

        pt(l, root.left);
        pt(l, root.right);
        l.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<Integer>();
        pt(r, root);

        return r;
    }
}
