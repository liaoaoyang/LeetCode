package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.DiameterOfBinaryTree;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/3/23.
 */
public class TestDiameterOfBinaryTree {
    private DiameterOfBinaryTree d = new DiameterOfBinaryTree();

    @Test
    public void testDiameterOfBinaryTreeCase1() {
        TreeNode r = TreeNode.buildTree(new Integer[]{1, 2, 3, 4, 5, null, null});
        Assert.assertEquals(3, d.diameterOfBinaryTree(r));
    }

    @Test
    public void testDiameterOfBinaryTreeCase2() {
        TreeNode r = TreeNode.buildTree(new Integer[]{1, 2, 3, 4, 5, null, null, 6});
        Assert.assertEquals(4, d.diameterOfBinaryTree(r));
    }

    @Test
    public void testDiameterOfBinaryTreeCase3() {
        TreeNode r = TreeNode.buildTree(new Integer[]{4, -7, -3, null, null, -9, -3, 9, -7, -4, null, 6, null, -6, -6, null, null, 0, 6, 5, null, 9, null, null, -1, -4, null, null, null, -2});
        Assert.assertEquals(8, d.diameterOfBinaryTree(r));
    }

    @Test
    public void testDiameterOfBinaryTreeCase4() {
        TreeNode r = TreeNode.buildTree(new Integer[]{});
        Assert.assertEquals(0, d.diameterOfBinaryTree(r));
    }
}
