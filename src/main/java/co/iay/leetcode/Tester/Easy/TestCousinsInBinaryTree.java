package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.CousinsInBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class TestCousinsInBinaryTree {
    private CousinsInBinaryTree c = new CousinsInBinaryTree();

    @Test
    public void testCousinsInBinaryTreeCase1() {
        Assert.assertFalse(
                c.isCousins(
                        TreeNode.buildTree(
                                new Integer[]{1, 2, 3, 4}
                        ),
                        4,
                        3)
        );
    }

    @Test
    public void testCousinsInBinaryTreeCase2() {
        Assert.assertTrue(
                c.isCousins(
                        TreeNode.buildTree(
                                new Integer[]{1, 2, 3, null, 4, null, 5}
                        ),
                        5,
                        4)
        );
    }

    @Test
    public void testCousinsInBinaryTreeCase3() {
        Assert.assertFalse(
                c.isCousins(
                        TreeNode.buildTree(
                                new Integer[]{1, 2, 3, null, 4}
                        ),
                        2,
                        3)
        );
    }
}
