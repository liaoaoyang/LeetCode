package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Medium.InsertionSortList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/4/7.
 */
public class TestInsertionSortList {
    private InsertionSortList i = new InsertionSortList();

    @Test
    public void testInsertionSortListCase1() {
        ListNode l = ListNode.buildListNodeByArray(new Integer[]{3, 1, 2, 4});
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4},
                ListNode.buildArrayByList(i.insertionSortList(l)));
    }

    @Test
    public void testInsertionSortListCase2() {
        ListNode l = ListNode.buildListNodeByArray(new Integer[]{});
        Assert.assertArrayEquals(new Integer[]{},
                ListNode.buildArrayByList(i.insertionSortList(l)));
    }
}
