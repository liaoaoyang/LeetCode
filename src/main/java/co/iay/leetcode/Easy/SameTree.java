package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 17/2/12.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            if (isSameTree(p.left, q.left)) {
                if (isSameTree(p.right, q.right)) {
                    return true;
                }
            }
        }

        return false;
    }
}
