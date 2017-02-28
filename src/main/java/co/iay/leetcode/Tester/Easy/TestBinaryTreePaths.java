package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.BinaryTreePaths;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by ng on 17/2/26.
 */
public class TestBinaryTreePaths {
    private BinaryTreePaths b = new BinaryTreePaths();

    @Test
    public void testBinaryTreePathsCase1() {
        ArrayList<String> cmp = new ArrayList<String>();
        cmp.add("1->2->5");
        cmp.add("1->3");

        Assert.assertEquals(
                cmp,
                b.binaryTreePaths(TreeNode.buildTree(new Integer[] {1, 2, 3, null, 5}))
        );
    }
}
