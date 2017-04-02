package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/3/30.
 * 103. Binary Tree Zigzag Level Order Traversal
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }

        int levelCount = 1;
        List<TreeNode> l = new ArrayList<TreeNode>();
        List<Integer> treeLevel = new ArrayList<Integer>();
        l.add(root);
        treeLevel.add(root.val);
        result.add(treeLevel);

        while (true) {
            ++levelCount;
            List<TreeNode> pl = l;
            l = new ArrayList<TreeNode>();
            treeLevel = new ArrayList<Integer>();

            boolean allNull = true;

            for(TreeNode node : pl) {
                if (node == null) {
                    continue;
                }

                if (node.left != null) {
                    l.add(node.left);
                    allNull = false;
                    if (levelCount % 2 == 0) {
                        treeLevel.add(0, node.left.val);
                    } else {
                        treeLevel.add(node.left.val);
                    }
                } else {
                    l.add(null);
                }

                if (node.right != null) {
                    l.add(node.right);
                    allNull = false;
                    if (levelCount % 2 == 0) {
                        treeLevel.add(0, node.right.val);
                    } else {
                        treeLevel.add(node.right.val);
                    }
                } else {
                    l.add(null);
                }
            }

            if (allNull) {
                break;
            }
            else {
                result.add(treeLevel);
            }
        }

        return result;
    }
}
