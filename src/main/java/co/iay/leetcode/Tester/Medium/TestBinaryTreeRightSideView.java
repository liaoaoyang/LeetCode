package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Medium.BinaryTreeRightSideView;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ng on 17/3/30.
 */
public class TestBinaryTreeRightSideView {
    private BinaryTreeRightSideView b = new BinaryTreeRightSideView();

    @Test
    public void testBinaryTreeRightSideViewCase1() {
        TreeNode t = TreeNode.buildTree(new Integer[]{});
        Assert.assertEquals(Arrays.asList(new Integer[]{}), b.rightSideView(t));
    }

    @Test
    public void testBinaryTreeRightSideViewCase2() {
        TreeNode t = TreeNode.buildTree(new Integer[]{1, 2, 3, null, 5, null, 4});
        Assert.assertEquals(Arrays.asList(new Integer[]{1, 3, 4}), b.rightSideView(t));
    }

    @Test
    public void testBinaryTreeRightSideViewCase3() {
        TreeNode t = TreeNode.buildTree(new Integer[]{1, 2, 3, 4, null, null, null});
        Assert.assertEquals(Arrays.asList(new Integer[]{1, 3, 4}), b.rightSideView(t));
    }
}
