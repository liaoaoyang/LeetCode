package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.UnivaluedBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class TestUnivaluedBinaryTree {
    private UnivaluedBinaryTree u = new UnivaluedBinaryTree();

    @Test
    public void testUnivaluedBinaryTreeCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{
                1, 1, 1, 1, 1, null, 1
        });
        Assert.assertTrue(u.isUnivalTree(root));
    }
}
