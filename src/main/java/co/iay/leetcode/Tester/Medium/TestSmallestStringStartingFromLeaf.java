package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Medium.SmallestStringStartingFromLeaf;
import org.junit.Assert;
import org.junit.Test;

public class TestSmallestStringStartingFromLeaf {
    private SmallestStringStartingFromLeaf s = new SmallestStringStartingFromLeaf();

    @Test
    public void testSmallestStringStartingFromLeafCase1() {
        Assert.assertEquals("dba", s.smallestFromLeaf(
                TreeNode.buildTree(
                        new Integer[]{0, 1, 2, 3, 4, 3, 4}
                )
        ));
    }

    @Test
    public void testSmallestStringStartingFromLeafCase2() {
        Assert.assertEquals("adz", s.smallestFromLeaf(
                TreeNode.buildTree(
                        new Integer[]{25, 1, 3, 1, 3, 0, 2}
                )
        ));
    }

    @Test
    public void testSmallestStringStartingFromLeafCase3() {
        Assert.assertEquals("abc", s.smallestFromLeaf(
                TreeNode.buildTree(
                        new Integer[]{2, 2, 1, null, 1, 0, null, 0}
                )
        ));
    }
}
