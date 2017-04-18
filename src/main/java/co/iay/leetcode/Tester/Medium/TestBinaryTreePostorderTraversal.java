package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Hard.BinaryTreePostorderTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ng on 17/4/18.
 */
public class TestBinaryTreePostorderTraversal {
    private BinaryTreePostorderTraversal b = new BinaryTreePostorderTraversal();

    @Test
    public void testBinaryTreePostorderTraversalCase1() {
        TreeNode tr = TreeNode.buildTree(new Integer[]{});
        List<Integer> cmp = b.postorderTraversal(tr);
        Assert.assertEquals(Arrays.asList(new Integer[] {}), cmp);
    }

    @Test
    public void testBinaryTreePostorderTraversalCase2() {
        TreeNode tr = TreeNode.buildTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1});
        List<Integer> cmp = b.postorderTraversal(tr);
        Assert.assertEquals(Arrays.asList(new Integer[] {8, 9, 4, 1, 5, 2, 6, 7, 3, 1}), cmp);
    }
}
