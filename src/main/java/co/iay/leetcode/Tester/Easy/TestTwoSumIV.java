package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.TwoSumIV;
import org.junit.Assert;
import org.junit.Test;

public class TestTwoSumIV {
    private TwoSumIV t = new TwoSumIV();

    @Test
    public void testTwoSumIVCase1() {
        Assert.assertEquals(false, t.findTarget(null, 1));
    }

    @Test
    public void testTwoSumIVCase2() {
        Assert.assertEquals(false, t.findTarget(new TreeNode(0), 1));
    }

    @Test
    public void testTwoSumIVCase3() {
        Assert.assertEquals(false, t.findTarget(new TreeNode(1), 1));
    }

    @Test
    public void testTwoSumIVCase4() {
        TreeNode root = TreeNode.buildTree(new Integer[]{5, 3, 6, 2, 4, null, 7});

        Assert.assertEquals(true, t.findTarget(root, 9));
    }

    @Test
    public void testTwoSumIVCase5() {
        TreeNode root = TreeNode.buildTree(new Integer[]{5, 3, 6, 2, 4, null, 7});

        Assert.assertEquals(false, t.findTarget(root, 19));
    }
}
