package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 2017/6/9.
 * 606. Construct String from Binary Tree
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 */
public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        if (null == t) {
            return "";
        }

        if (null == t.left && null == t.right) {
            return t.val + "";
        }

        String left = "(" + tree2str(t.left) + ")";
        String right = null == t.right ? "" : tree2str(t.right);
        right = right.isEmpty() ? "" : "(" + right + ")";

        return t.val + left + right;
    }
}
