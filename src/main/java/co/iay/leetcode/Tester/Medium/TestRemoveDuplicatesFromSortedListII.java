package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Medium.RemoveDuplicatesFromSortedListII;
import org.junit.Assert;
import org.junit.Test;

public class TestRemoveDuplicatesFromSortedListII {
    private RemoveDuplicatesFromSortedListII r = new RemoveDuplicatesFromSortedListII();

    @Test
    public void testRemoveDuplicatesFromSortedListIICase1() {
        ListNode l = ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 3, 4, 4, 5});
        Assert.assertArrayEquals(new Integer[]{1, 2, 5},
                ListNode.buildArrayListByList(r.deleteDuplicates(l)).toArray());
    }

    @Test
    public void testRemoveDuplicatesFromSortedListIICase2() {
        ListNode l = ListNode.buildListNodeByArray(new Integer[]{1, 1, 1, 2, 3});
        Assert.assertArrayEquals(new Integer[]{2, 3},
                ListNode.buildArrayListByList(r.deleteDuplicates(l)).toArray());
    }

    @Test
    public void testRemoveDuplicatesFromSortedListIICase3() {
        ListNode l = ListNode.buildListNodeByArray(new Integer[]{1, 1, 2, 2, 3, 3});
        Assert.assertArrayEquals(new Integer[]{},
                ListNode.buildArrayListByList(r.deleteDuplicates(l)).toArray());
    }
}
