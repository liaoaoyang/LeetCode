package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 17/2/12.
 */
public class SymmetricTree {
    public static boolean isSameTreeOfSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            if (isSameTreeOfSymmetric(p.left, q.right)) {
                if (isSameTreeOfSymmetric(p.right, q.left)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSameTreeOfSymmetric(root.left, root.right);
    }
}
