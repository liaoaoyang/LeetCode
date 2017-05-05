package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.MinimumDepthOfBinaryTree;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/5/4.
 */
public class TestMinimumDepthOfBinaryTree {
    private MinimumDepthOfBinaryTree m = new MinimumDepthOfBinaryTree();

    @Test
    public void testMinimumDepthOfBinaryTreeCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[]{1,
                null, 2,
                null, null, 3, null,
                null, null, null, null, null, 4, null, null,
                5, 6});
        Assert.assertEquals(4, m.minDepth(root));
    }

    @Test
    public void testMinimumDepthOfBinaryTreeCase2() {
        TreeNode root = TreeNode.buildTree(new Integer[]{1, 2});
        Assert.assertEquals(2, m.minDepth(root));
    }

    @Test
    public void testMinimumDepthOfBinaryTreeCase3() {
        TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3, null, 4});
        Assert.assertEquals(2, m.minDepth(root));
    }

    @Test
    public void testMinimumDepthOfBinaryTreeCase4() {
        TreeNode root = TreeNode.buildTree(new Integer[]{});
        Assert.assertEquals(0, m.minDepth(root));
    }
}
