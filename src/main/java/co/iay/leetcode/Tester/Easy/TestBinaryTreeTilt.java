package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.BinaryTreeTilt;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/4/25.
 */
public class TestBinaryTreeTilt {
    private BinaryTreeTilt b = new BinaryTreeTilt();

    @Test
    public void testBinaryTreeTiltCase1() {
        Assert.assertEquals(1, b.findTilt(TreeNode.buildTree(new Integer[]{
                1, 2, 3
        })));
    }

    @Test
    public void testBinaryTreeTiltCase2() {
        Assert.assertEquals(40, b.findTilt(TreeNode.buildTree(new Integer[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        })));
    }

    @Test
    public void testBinaryTreeTiltCase3() {
        Assert.assertEquals(0, b.findTilt(TreeNode.buildTree(new Integer[]{
                1
        })));
    }

    @Test
    public void testBinaryTreeTiltCase4() {
        Assert.assertEquals(2, b.findTilt(TreeNode.buildTree(new Integer[]{
                1, 2
        })));
    }
}
