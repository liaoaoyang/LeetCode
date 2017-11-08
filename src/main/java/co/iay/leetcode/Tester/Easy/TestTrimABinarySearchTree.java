package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.TrimABinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

public class TestTrimABinarySearchTree {
    private TrimABinarySearchTree t = new TrimABinarySearchTree();

    @Test
    public void testTrimABinarySearchTreeCase1() {
        Integer[] integers = new Integer[]{1, 0, 2};
        TreeNode root = TreeNode.buildTree(integers);
        Assert.assertEquals(1, t.trimBST(root, 1, 2).val);
    }

    @Test
    public void testTrimABinarySearchTreeCase2() {
        Integer[] integers = new Integer[]{3, 0, 4, null, 2, null, null, null, null, null, 1};
        TreeNode root = TreeNode.buildTree(integers);
        Assert.assertEquals(3, t.trimBST(root, 1, 3).val);
    }
}
