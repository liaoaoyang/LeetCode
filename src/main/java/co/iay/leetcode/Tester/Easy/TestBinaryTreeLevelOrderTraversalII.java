package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.BinaryTreeLevelOrderTraversalII;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ng on 17/2/12.
 */
public class TestBinaryTreeLevelOrderTraversalII {
    private BinaryTreeLevelOrderTraversalII b = new BinaryTreeLevelOrderTraversalII();

    @Test
    public void testBinaryTreeLevelOrderTraversalIICase1() {
        TreeNode t = TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(Arrays.asList(new Integer[] {15, 7}));
        result.add(Arrays.asList(new Integer[] {9, 20}));
        result.add(Arrays.asList(new Integer[] {3}));
        Assert.assertEquals(result, b.levelOrderBottom(t));
    }
}
