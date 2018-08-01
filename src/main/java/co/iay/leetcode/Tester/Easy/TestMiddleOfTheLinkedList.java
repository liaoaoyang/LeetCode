package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Easy.MiddleOfTheLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class TestMiddleOfTheLinkedList {
    private MiddleOfTheLinkedList m = new MiddleOfTheLinkedList();

    @Test
    public void testMiddleOfTheLinkedListCase1() {
        Assert.assertEquals(3, m.middleNode(
                ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 4, 5})
        ).val);
    }

    @Test
    public void testMiddleOfTheLinkedListCase2() {
        Assert.assertNull(m.middleNode(
                ListNode.buildListNodeByArray(new Integer[]{})
        ));
    }

    @Test
    public void testMiddleOfTheLinkedListCase3() {
        Assert.assertEquals(3, m.middleNode(
                ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 4})
        ).val);
    }
}
