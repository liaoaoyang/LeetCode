package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Medium.OddEvenLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class TestOddEvenLinkedList {
    private OddEvenLinkedList o = new OddEvenLinkedList();

    @Test
    public void testOddEvenLinkedListCase1() {
        Assert.assertArrayEquals(new Integer[]{2, 3, 6, 7, 1, 5, 4},
                ListNode.buildArrayByList(o.oddEvenList(
                        ListNode.buildListNodeByArray(new Integer[]{2, 1, 3, 5, 6, 4, 7})
                )));
    }
}
