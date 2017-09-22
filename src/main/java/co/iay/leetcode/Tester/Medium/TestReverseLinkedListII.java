package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Medium.ReverseLinkedListII;
import org.junit.Assert;
import org.junit.Test;

public class TestReverseLinkedListII {
    private ReverseLinkedListII r = new ReverseLinkedListII();

    @Test
    public void testReverseLinkedListIICase1() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.reverseBetween(list, 2, 4);
        Assert.assertArrayEquals(new Integer[] {1, 4, 3, 2, 5},
                ListNode.buildArrayByList(result));
    }

    @Test
    public void testReverseLinkedListIICase2() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.reverseBetween(list, 1, 5);
        Assert.assertArrayEquals(new Integer[] {5, 4, 3, 2, 1},
                ListNode.buildArrayByList(result));
    }

    @Test
    public void testReverseLinkedListIICase3() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.reverseBetween(list, 2, 5);
        Assert.assertArrayEquals(new Integer[] {1, 5, 4, 3, 2},
                ListNode.buildArrayByList(result));
    }

    @Test
    public void testReverseLinkedListIICase4() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.reverseBetween(list, 3, 3);
        Assert.assertArrayEquals(new Integer[] {1, 2, 3, 4, 5},
                ListNode.buildArrayByList(result));
    }
}
