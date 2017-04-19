package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Medium.SumRootToLeafNumbers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/4/17.
 */
public class TestSumRootToLeafNumbers {
    private SumRootToLeafNumbers s = new SumRootToLeafNumbers();

    @Test
    public void testSumRootToLeafNumbersCase1() {
        TreeNode tr = TreeNode.buildTree(new Integer[]{1, 2, 3});
        Assert.assertEquals(25, s.sumNumbers(tr));
    }

    @Test
    public void testSumRootToLeafNumbersCase2() {
        TreeNode tr = TreeNode.buildTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1});
        Assert.assertEquals(4021, s.sumNumbers(tr));
    }
}
