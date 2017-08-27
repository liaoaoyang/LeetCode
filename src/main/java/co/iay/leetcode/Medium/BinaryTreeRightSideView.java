package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/3/30.
 * 199. Binary Tree Right Side View
 * https://leetcode.com/problems/binary-tree-right-side-view
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        if (root == null) {
            return result;
        }

        List<TreeNode> l = new ArrayList<TreeNode>();
        l.add(root);
        result.add(root.val);

        while (true) {
            List<TreeNode> pl = l;
            l = new ArrayList<TreeNode>();

            boolean allNull = true;

            for (TreeNode node : pl) {
                if (node == null) {
                    continue;
                }

                if (node.left != null) {
                    l.add(node.left);
                    allNull = false;
                }

                if (node.right != null) {
                    l.add(node.right);
                    allNull = false;
                }
            }

            if (allNull) {
                break;
            } else {
                result.add(l.get(l.size() - 1).val);
            }
        }

        return result;
    }
}
