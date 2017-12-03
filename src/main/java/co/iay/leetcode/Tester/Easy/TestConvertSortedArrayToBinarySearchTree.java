package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.ConvertSortedArrayToBinarySearchTree;
import co.iay.leetcode.Easy.SameTree;
import org.junit.Assert;
import org.junit.Test;

public class TestConvertSortedArrayToBinarySearchTree {
    private ConvertSortedArrayToBinarySearchTree c        = new ConvertSortedArrayToBinarySearchTree();
    private SameTree                             sameTree = new SameTree();

    @Test
    public void testConvertSortedArrayToBinarySearchTreeCase1() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-10);
        root.right = new TreeNode(5);
        root.left.right = new TreeNode(-3);
        root.right.right = new TreeNode(9);
        TreeNode result = c.sortedArrayToBST(
                new int[]{-10, -3, 0, 5, 9}
        );

        if (!sameTree.isSameTree(result, root)) {
            Assert.fail();
        }
    }
}
