package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Easy.LowestCommonAncestorOfABinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by ng on 17/2/26.
 */
public class TestLowestCommonAncestorOfABinarySearchTree {
    private LowestCommonAncestorOfABinarySearchTree l = new LowestCommonAncestorOfABinarySearchTree();

    @Test
    public void testLowestCommonAncestorOfABinarySearchTreeCase1() {
        HashMap<Integer, TreeNode> oriIdxTreeNodeMap = new HashMap<Integer, TreeNode>();

        TreeNode[] t = TreeNode.buildTreeArray(new Integer[]{6,
                2, 8,
                0, 4, 7, 9,
                null, null, 3, 5, null, null, null, null}, oriIdxTreeNodeMap);

        if (null == t) {
            return;
        }

        TreeNode r = l.lowestCommonAncestor(oriIdxTreeNodeMap.get(0),
                oriIdxTreeNodeMap.get(1),
                oriIdxTreeNodeMap.get(2));
        Assert.assertEquals(r, oriIdxTreeNodeMap.get(0));
    }

    @Test
    public void testLowestCommonAncestorOfABinarySearchTreeCase2() {
        HashMap<Integer, TreeNode> oriIdxTreeNodeMap = new HashMap<Integer, TreeNode>();

        TreeNode[] t = TreeNode.buildTreeArray(new Integer[]{6,
                2, 8,
                0, 4, 7, 9,
                null, null, 3, 5, null, null, null, null}, oriIdxTreeNodeMap);

        if (null == t) {
            return;
        }

        TreeNode r = l.lowestCommonAncestor(oriIdxTreeNodeMap.get(0),
                oriIdxTreeNodeMap.get(3),
                oriIdxTreeNodeMap.get(10));
        Assert.assertEquals(r, oriIdxTreeNodeMap.get(1));
    }
}
