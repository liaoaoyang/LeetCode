package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Easy.ReverseLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class TestReverseLinkedList {
    private ReverseLinkedList r = new ReverseLinkedList();

    @Test
    public void testReverseLinkedListCase1() {
        ListNode src = ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 4, 5});
        ListNode dst = r.reverseList(src);

        Assert.assertArrayEquals(new Integer[]{5, 4, 3, 2, 1},
                ListNode.buildArrayByList(dst));
    }

    @Test
    public void testReverseLinkedListCase2() {
        ListNode src = ListNode.buildListNodeByArray(new Integer[]{});
        ListNode dst = r.reverseList(src);

        Assert.assertArrayEquals(null,
                ListNode.buildArrayByList(dst));
    }

    @Test
    public void testReverseLinkedListCase3() {
        ListNode src = ListNode.buildListNodeByArray(new Integer[]{1});
        ListNode dst = r.reverseList(src);

        Assert.assertArrayEquals(new Integer[]{1},
                ListNode.buildArrayByList(dst));
    }
}
