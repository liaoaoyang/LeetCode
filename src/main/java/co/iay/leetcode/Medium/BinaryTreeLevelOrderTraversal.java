package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/3/30.
 * 102. Binary Tree Level Order Traversal
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }

        List<TreeNode> l = new ArrayList<TreeNode>();
        List<Integer> treeLevel = new ArrayList<Integer>();
        l.add(root);
        treeLevel.add(root.val);
        result.add(treeLevel);

        while (true) {
            List<TreeNode> pl = l;
            l = new ArrayList<TreeNode>();
            treeLevel = new ArrayList<Integer>();

            boolean allNull = true;

            for (TreeNode node : pl) {
                if (node == null) {
                    continue;
                }

                if (node.left != null) {
                    l.add(node.left);
                    allNull = false;
                    treeLevel.add(node.left.val);
                } else {
                    l.add(null);
                }

                if (node.right != null) {
                    l.add(node.right);
                    allNull = false;
                    treeLevel.add(node.right.val);
                } else {
                    l.add(null);
                }
            }

            if (allNull) {
                break;
            } else {
                result.add(treeLevel);
            }
        }

        return result;
    }
}
