package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.AverageOfLevelsInBinaryTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ng on 2017/7/14.
 */
public class TestAverageOfLevelsInBinaryTree {
    private AverageOfLevelsInBinaryTree a = new AverageOfLevelsInBinaryTree();

    @Test
    public void testAverageOfLevelsInBinaryTreeCase1() {
        TreeNode t = TreeNode.buildTree(new Integer[] {1, 3, 4, null, null, 5, 6});
        Assert.assertEquals(Arrays.asList(1.0d, 3.5d, 5.5d), a.averageOfLevels(t));
    }
}
