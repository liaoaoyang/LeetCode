package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * Created by ng on 2017/6/12.
 * 617. Merge Two Binary Trees
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
public class MergeTwoBinaryTrees {
    final private static int LEFT = 0;
    final private static int RIGHT = 1;

    private void travel(TreeNode t1, TreeNode prevT1, int dir1, TreeNode t2) {
        if (null == t1 && null == t2) {
            return;
        }

        int t2Val = 0;

        if (null == t1) {
            TreeNode node = new TreeNode(0);

            if (LEFT == dir1) {
                prevT1.left = node;
            } else {
                prevT1.right = node;
            }

            t1 = node;
        }

        if (null != t2){
            t2Val = t2.val;
        }

        t1.val += t2Val;

        TreeNode t2LeftNode = (null == t2 || null == t2.left) ? null : t2.left;
        TreeNode t2RightNode = (null == t2 || null == t2.right) ? null : t2.right;

        travel(t1.left, t1, LEFT, t2LeftNode);
        travel(t1.right, t1, RIGHT, t2RightNode);
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (null == t1) {
            return t2;
        }

        if (null == t2) {
            return t1;
        }

        TreeNode fakeT1 = new TreeNode(0);
        fakeT1.left = t1;

        travel(t1, fakeT1, LEFT, t2);

        return fakeT1.left;
    }
}
