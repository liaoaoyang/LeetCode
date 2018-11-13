package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Medium.RangeSumOfBST;
import org.junit.Assert;
import org.junit.Test;

public class TestRangeSumOfBST {
    private RangeSumOfBST r = new RangeSumOfBST();

    @Test
    public void testRangeSumOfBSTCase1() {
        Assert.assertEquals(32, r.rangeSumBST(TreeNode.buildTree(
                new Integer[]{10, 5, 15, 3, 7, null, 18}
        ), 7, 15));
    }

    @Test
    public void testRangeSumOfBSTCase2() {
        Assert.assertEquals(23, r.rangeSumBST(TreeNode.buildTree(
                new Integer[]{10, 5, 15, 3, 7, 13, 18, 1, null, 6}
        ), 6, 10));
    }
}
