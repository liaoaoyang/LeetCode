package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.InvertBinaryTree;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/26.
 */
public class TestInvertBinaryTree {
    InvertBinaryTree ibt = new InvertBinaryTree();

    @Test
    public void testInvertBinaryTreeCase1() {
        Integer[] originTree = new Integer[]{4, 2, 7, 1, 3, 6, 9};
        Integer[] resultTree = new Integer[]{4, 7, 2, 9, 6, 3, 1};
        Integer[] inverted = TreeNode.treeToArray(ibt.invertTree(TreeNode.buildTree(originTree)));
        Assert.assertArrayEquals(resultTree, inverted);
    }

    @Test
    public void testInvertBinaryTreeCase2() {
        Integer[] originTree = new Integer[]{4, 2, 7, 1, 3, null, 9};
        Integer[] resultTree = new Integer[]{4, 7, 2, 9, null, 3, 1};
        Integer[] inverted = TreeNode.treeToArray(ibt.invertTree(TreeNode.buildTree(originTree)));
        Assert.assertArrayEquals(resultTree, inverted);
    }
}
