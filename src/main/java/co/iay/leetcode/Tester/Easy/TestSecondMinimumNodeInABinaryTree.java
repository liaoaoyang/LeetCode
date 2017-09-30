package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.SecondMinimumNodeInABinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class TestSecondMinimumNodeInABinaryTree {
    private SecondMinimumNodeInABinaryTree s = new SecondMinimumNodeInABinaryTree();

    @Test
    public void testSecondMinimumNodeInABinaryTreeCase1() {
        TreeNode t = TreeNode.buildTree(new Integer[]{2, 2, 5, null, null, 5, 5});
        Assert.assertEquals(5, s.findSecondMinimumValue(t));
    }

    @Test
    public void testSecondMinimumNodeInABinaryTreeCase2() {
        TreeNode t = TreeNode.buildTree(new Integer[]{2, 2, 2});
        Assert.assertEquals(-1, s.findSecondMinimumValue(t));
    }

    @Test
    public void testSecondMinimumNodeInABinaryTreeCase3() {
        TreeNode t = TreeNode.buildTree(new Integer[]{2, 2, 5, null, null, 5, 7});
        Assert.assertEquals(5, s.findSecondMinimumValue(t));
    }

    @Test
    public void testSecondMinimumNodeInABinaryTreeCase4() {
        TreeNode t = TreeNode.buildTree(new Integer[]{1, 1, 3, 1, 1, 3, 4, 3, 1, 1, 1, 3, 8, 4, 8, 3, 3, 1, 6, 2, 1});
        Assert.assertEquals(2, s.findSecondMinimumValue(t));
    }
}
