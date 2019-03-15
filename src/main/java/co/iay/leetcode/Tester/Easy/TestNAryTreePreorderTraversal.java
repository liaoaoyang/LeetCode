package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.NAryTreePreorderTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestNAryTreePreorderTraversal {
    private NAryTreePreorderTraversal n = new NAryTreePreorderTraversal();

    @Test
    public void testNAryTreePreorderTraversalCase1() {
        NAryTreePreorderTraversal.Node root = new NAryTreePreorderTraversal.Node(1, Arrays.asList(
                new NAryTreePreorderTraversal.Node(3, Arrays.asList(
                        new NAryTreePreorderTraversal.Node(5, null),
                        new NAryTreePreorderTraversal.Node(6, null)
                )),
                new NAryTreePreorderTraversal.Node(2, null),
                new NAryTreePreorderTraversal.Node(4, null)

        ));

        Assert.assertEquals(Arrays.asList(1, 3, 5, 6, 2, 4), n.preorder(root));
    }
}
