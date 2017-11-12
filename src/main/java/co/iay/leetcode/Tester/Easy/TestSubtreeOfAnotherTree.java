package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.SubtreeOfAnotherTree;
import org.junit.Assert;
import org.junit.Test;

public class TestSubtreeOfAnotherTree {
    private SubtreeOfAnotherTree subtreeOfAnotherTree = new SubtreeOfAnotherTree();

    @Test
    public void testSubtreeOfAnotherTreeCase1() {
        TreeNode s = TreeNode.buildTree(new Integer[]{3, 4, 5, 1, 2});
        TreeNode t = TreeNode.buildTree(new Integer[]{4, 1, 2});

        Assert.assertEquals(true, subtreeOfAnotherTree.isSubtree(s, t));
    }

    @Test
    public void testSubtreeOfAnotherTreeCase2() {
        TreeNode s = TreeNode.buildTree(new Integer[]{
                3,
                4, 5,
                1, 2, null, null,
                null, null, 0});
        TreeNode t = TreeNode.buildTree(new Integer[]{4, 1, 2});

        Assert.assertEquals(false, subtreeOfAnotherTree.isSubtree(s, t));
    }
}
