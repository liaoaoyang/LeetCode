package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Medium.LinkedListComponents;
import org.junit.Assert;
import org.junit.Test;

public class TestLinkedListComponents {
    private LinkedListComponents l = new LinkedListComponents();

    @Test
    public void testLinkedListComponentsCase1() {
        ListNode input = ListNode.buildListNodeByArray(new Integer[]{1, 2, 3});
        Assert.assertEquals(2, l.numComponents(input, new int[]{0, 1, 3}));
    }

    @Test
    public void testLinkedListComponentsCase2() {
        ListNode input = ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 4});
        Assert.assertEquals(2, l.numComponents(input, new int[]{0, 3, 1, 4}));
    }

    @Test
    public void testLinkedListComponentsCase3() {
        ListNode input = ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 4, 5});
        Assert.assertEquals(2, l.numComponents(input, new int[]{0, 3, 1, 4}));
    }

    @Test
    public void testLinkedListComponentsCase5() {
        ListNode input = ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 4, 5});
        Assert.assertEquals(2, l.numComponents(input, new int[]{0, 3, 1, 4, 5}));
    }
}
