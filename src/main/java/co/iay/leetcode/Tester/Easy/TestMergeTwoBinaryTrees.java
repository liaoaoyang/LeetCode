package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.MergeTwoBinaryTrees;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/6/14.
 */
public class TestMergeTwoBinaryTrees {
    private MergeTwoBinaryTrees m = new MergeTwoBinaryTrees();

    @Test
    public void testMergeTwoBinaryTreesCase1() {
        TreeNode t1 = TreeNode.buildTree(new Integer[]{1, 3, 2, 5});
        TreeNode t2 = TreeNode.buildTree(new Integer[]{2, 1, 3, null, 4, null, 7});

        Assert.assertArrayEquals(new Integer[]{3, 4, 5, 5, 4, null, 7},
                TreeNode.treeToArray(m.mergeTrees(t1, t2)));
    }

    @Test
    public void testMergeTwoBinaryTreesCase2() {
        TreeNode t1 = TreeNode.buildTree(new Integer[]{1});
        TreeNode t2 = TreeNode.buildTree(new Integer[]{1, 2, 3, 4, 5, 6, 7});

        Assert.assertArrayEquals(new Integer[]{2, 2, 3, 4, 5, 6, 7},
                TreeNode.treeToArray(m.mergeTrees(t1, t2)));
    }

    @Test
    public void testMergeTwoBinaryTreesCase3() {
        TreeNode t1 = TreeNode.buildTree(new Integer[]{1});
        TreeNode t2 = TreeNode.buildTree(new Integer[]{});

        Assert.assertArrayEquals(new Integer[]{1},
                TreeNode.treeToArray(m.mergeTrees(t1, t2)));
    }

    @Test
    public void testMergeTwoBinaryTreesCase4() {
        TreeNode t1 = TreeNode.buildTree(new Integer[]{});
        TreeNode t2 = TreeNode.buildTree(new Integer[]{1});

        Assert.assertArrayEquals(new Integer[]{1},
                TreeNode.treeToArray(m.mergeTrees(t1, t2)));
    }
}
