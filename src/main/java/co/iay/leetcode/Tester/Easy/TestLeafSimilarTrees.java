package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.LeafSimilarTrees;
import org.junit.Assert;
import org.junit.Test;

public class TestLeafSimilarTrees {
    private LeafSimilarTrees l = new LeafSimilarTrees();

    @Test
    public void testLeafSimilarTreesCase1() {
        Assert.assertEquals(false, l.leafSimilar(
                TreeNode.buildTree(new Integer[]{
                        18, 35, 22, null, 103, 43, 101, 58, null, 97
                }),
                TreeNode.buildTree(new Integer[]{
                        94, 102, 17, 122, null, null, 54, 58, 101, 97
                })
        ));
    }

    @Test
    public void testLeafSimilarTreesCase2() {
        Assert.assertEquals(true, l.leafSimilar(
                TreeNode.buildTree(new Integer[]{
                        3, 5, 1, 6, 2, 9, 8, null, null, 7, 4
                }),
                TreeNode.buildTree(new Integer[]{
                        3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8
                })
        ));
    }
}
