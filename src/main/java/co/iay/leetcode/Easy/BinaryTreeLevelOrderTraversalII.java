package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/2/12.
 * 107. Binary Tree Level Order Traversal II
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }

        List<List<TreeNode>> t = new ArrayList<List<TreeNode>>();
        List<TreeNode> l = new ArrayList<TreeNode>();
        l.add(root);
        t.add(0, l);

        List<Integer> rl = null;

        while (true) {
            List<TreeNode> pl = l;
            l = new ArrayList<TreeNode>();

            for(TreeNode node : pl) {
                if (node.left != null) {
                    l.add(node.left);
                }

                if (node.right != null) {
                    l.add(node.right);
                }
            }

            if (l.size() == 0) {
                break;
            }

            t.add(0, l);
        }

        for (int i = 0; i < t.size(); ++i) {
            rl = new ArrayList<Integer>();

            for (TreeNode n : t.get(i)) {
                rl.add(n.val);
            }

            result.add(rl);
        }

        return result;
    }
}
