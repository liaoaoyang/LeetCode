package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.SumOfLeftLeaves;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/12.
 */
public class TestSumOfLeftLeaves {
    SumOfLeftLeaves s = new SumOfLeftLeaves();

    @Test
    public void testSumOfLeftLeavesCase1() {
        TreeNode root = TreeNode.buildTree(new Integer[] {3, 9, 20, null, null, 15, 7});
        Assert.assertEquals(24, s.sumOfLeftLeaves(root));
    }
}
