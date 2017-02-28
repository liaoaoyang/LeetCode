package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/2/26.
 * 257. Binary Tree Paths
 * https://leetcode.com/problems/binary-tree-paths/
 */
public class BinaryTreePaths {
    private static void travel(TreeNode node, StringBuilder sb, List<String> result) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            String pathValue = "" + node.val;
            sb.append(pathValue);
            result.add(sb.toString());
            sb.delete(sb.length() - pathValue.length(), sb.length());
        }

        String pathValue = node.val + "->";

        sb.append(pathValue);

        if (node.left != null) {
            travel(node.left, sb, result);
        }
        if (node.right != null) {
            travel(node.right, sb, result);
        }

        sb.delete(sb.length() - pathValue.length(), sb.length());
    }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList<String>();
        travel(root, new StringBuilder(), result);
        return result;
    }
}
