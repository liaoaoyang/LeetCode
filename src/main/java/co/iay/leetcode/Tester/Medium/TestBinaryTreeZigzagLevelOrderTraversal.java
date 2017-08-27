package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Medium.BinaryTreeZigzagLevelOrderTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ng on 17/3/30.
 */
public class TestBinaryTreeZigzagLevelOrderTraversal {
    private BinaryTreeZigzagLevelOrderTraversal b = new BinaryTreeZigzagLevelOrderTraversal();

    @Test
    public void testBinaryTreeLevelOrderTraversalCase1() {
        TreeNode t = TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> cmp = new ArrayList<List<Integer>>();
        List<Integer> tl = Arrays.asList(new Integer[]{3});
        cmp.add(tl);
        tl = Arrays.asList(new Integer[]{20, 9});
        cmp.add(tl);
        tl = Arrays.asList(new Integer[]{15, 7});
        cmp.add(tl);
        Assert.assertEquals(cmp, b.zigzagLevelOrder(t));
    }
}
