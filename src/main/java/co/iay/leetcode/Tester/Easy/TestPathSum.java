package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.PathSum;
import org.junit.Assert;
import org.junit.Test;

public class TestPathSum {
    private PathSum p = new PathSum();

    @Test
    public void testPathSumCase1() {
        TreeNode t = TreeNode.buildTree(new Integer[]{});
        Assert.assertEquals(false, p.hasPathSum(t, 1));
    }

    @Test
    public void testPathSumCase2() {
        TreeNode t = TreeNode.buildTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});
        Assert.assertEquals(true, p.hasPathSum(t, 22));
    }

    @Test
    public void testPathSumCase3() {
        TreeNode t = TreeNode.buildTree(new Integer[]{1, 2});
        Assert.assertEquals(false, p.hasPathSum(t, 1));
    }
}
