package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Medium.ValidateBinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

public class TestValidateBinarySearchTree {
    private ValidateBinarySearchTree v = new ValidateBinarySearchTree();

    @Test
    public void testValidateBinarySearchTreeCase1() {
        Assert.assertEquals(true, v.isValidBST(TreeNode.buildTree(
                new Integer[]{2, 1, 3}
        )));
    }

    @Test
    public void testValidateBinarySearchTreeCase2() {
        Assert.assertEquals(false, v.isValidBST(TreeNode.buildTree(
                new Integer[]{1, 2, 3}
        )));
    }

    @Test
    public void testValidateBinarySearchTreeCase3() {
        Assert.assertEquals(false, v.isValidBST(TreeNode.buildTree(
                new Integer[]{10, 5, 15, null, null, 6, 20}
        )));
    }
}
