package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.ConstructStringFromBinaryTree;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/6/10.
 */
public class TestConstructStringFromBinaryTree {
    private ConstructStringFromBinaryTree c = new ConstructStringFromBinaryTree();

    @Test
    public void testConstructStringFromBinaryTreeCase1() {
        TreeNode t = TreeNode.buildTree(new Integer[]{1, 2, 3, 4});
        Assert.assertEquals("1(2(4))(3)", c.tree2str(t));
    }

    @Test
    public void testConstructStringFromBinaryTreeCase2() {
        TreeNode t = TreeNode.buildTree(new Integer[]{1, 2, 3, null, 4});
        Assert.assertEquals("1(2()(4))(3)", c.tree2str(t));
    }

    @Test
    public void testConstructStringFromBinaryTreeCase3() {
        TreeNode t = TreeNode.buildTree(new Integer[]{1});
        Assert.assertEquals("1", c.tree2str(t));
    }

    @Test
    public void testConstructStringFromBinaryTreeCase4() {
        TreeNode t = TreeNode.buildTree(new Integer[]{1, null, 2});
        Assert.assertEquals("1()(2)", c.tree2str(t));
    }

}
