package co.iay.leetcode.Medium;

import org.junit.Test;

public class TestConstructBinTreeFromPreorderAndInorderTraversal {
    private ConstructBinTreeFromPreorderAndInorderTraversal c = new ConstructBinTreeFromPreorderAndInorderTraversal();

    @Test
    public void testCase1() {
        c.buildTree(
                new int[]{3, 9, 20, 15, 7},
                new int[]{9, 3, 15, 20, 7}
        );
    }

    @Test
    public void testCase2() {
        c.buildTree(
                new int[]{1, 2, 3},
                new int[]{3, 2, 1}
        );
    }
}
