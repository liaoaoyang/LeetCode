package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.PathSumIII;
import org.junit.Assert;
import org.junit.Test;

public class TestPathSumIII {
    private PathSumIII p = new PathSumIII();

    @Test
    public void testPathSumIIICase1() {
        TreeNode t = TreeNode.buildTree(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1});
        Assert.assertEquals(3, p.pathSum(t, 8));
    }

    @Test
    public void testPathSumIIICase3() {
        TreeNode t = TreeNode.buildTree(new Integer[]{1, -2, -3, 1, 3, -2, null, -1});
        Assert.assertEquals(4, p.pathSum(t, -1));
    }
}
