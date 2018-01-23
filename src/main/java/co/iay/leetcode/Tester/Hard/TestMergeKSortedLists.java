package co.iay.leetcode.Tester.Hard;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Hard.MergeKSortedLists;
import org.junit.Assert;
import org.junit.Test;

public class TestMergeKSortedLists {
    private MergeKSortedLists m = new MergeKSortedLists();

    @Test
    public void testMergeKSortedListsCase1() {
        ListNode[] lists = new ListNode[]{
                ListNode.buildListNodeByArray(new Integer[]{1, 3, 5}),
                ListNode.buildListNodeByArray(new Integer[]{2, 4, 6})
        };

        Integer[] expect = new Integer[]{1, 2, 3, 4, 5, 6};

        Assert.assertArrayEquals(expect, ListNode.buildArrayByList(m.mergeKLists(lists)));
    }

    @Test
    public void testMergeKSortedListsCase2() {
        ListNode[] lists = new ListNode[]{
                ListNode.buildListNodeByArray(new Integer[]{1, 3, 5}),
                ListNode.buildListNodeByArray(new Integer[]{4, 6})
        };

        Integer[] expect = new Integer[]{1, 3, 4, 5, 6};

        Assert.assertArrayEquals(expect, ListNode.buildArrayByList(m.mergeKLists(lists)));
    }

    @Test
    public void testMergeKSortedListsCase3() {
        ListNode[] lists = new ListNode[]{
                ListNode.buildListNodeByArray(new Integer[]{1, 5}),
                ListNode.buildListNodeByArray(new Integer[]{4, 6, 9}),
                ListNode.buildListNodeByArray(new Integer[]{2, 3, 4, 6, 7})
        };

        Integer[] expect = new Integer[]{1, 2, 3, 4, 4, 5, 6, 6, 7, 9};

        Assert.assertArrayEquals(expect, ListNode.buildArrayByList(m.mergeKLists(lists)));
    }
}
