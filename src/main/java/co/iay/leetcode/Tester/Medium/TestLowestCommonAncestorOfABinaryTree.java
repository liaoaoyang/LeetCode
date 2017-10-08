package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Medium.LowestCommonAncestorOfABinaryTree;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestLowestCommonAncestorOfABinaryTree {
    private LowestCommonAncestorOfABinaryTree l = new LowestCommonAncestorOfABinaryTree();

    @Test
    public void testLowestCommonAncestorOfABinaryTreeCase1() {
        TreeNode t0 = new TreeNode(0);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t = t3;

        t.left = t5;
        t.right = t1;
        t5.left = t6;
        t5.right = t2;
        t2.left = t7;
        t2.right = t4;
        t1.left = t0;
        t1.right = t8;

        Assert.assertEquals(t, l.lowestCommonAncestor(t, t5, t1));
    }

    @Test
    public void testLowestCommonAncestorOfABinaryTreeCase2() {
        TreeNode t0 = new TreeNode(0);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t = t3;

        t.left = t5;
        t.right = t1;
        t5.left = t6;
        t5.right = t2;
        t2.left = t7;
        t2.right = t4;
        t1.left = t0;
        t1.right = t8;

        Assert.assertEquals(t5, l.lowestCommonAncestor(t, t5, t4));
    }
}
