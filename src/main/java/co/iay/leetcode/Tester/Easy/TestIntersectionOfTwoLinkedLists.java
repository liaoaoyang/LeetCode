package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Easy.IntersectionOfTwoLinkedLists;
import org.junit.Assert;
import org.junit.Test;

public class TestIntersectionOfTwoLinkedLists {
    private IntersectionOfTwoLinkedLists i = new IntersectionOfTwoLinkedLists();

    @Test
    public void testIntersectionOfTwoLinkedListsCase1() {
        Assert.assertEquals(null, i.getIntersectionNode(
                ListNode.buildListNodeByArray(
                        new Integer[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21}
                ),
                ListNode.buildListNodeByArray(new Integer[]{2})));
    }

    @Test
    public void testIntersectionOfTwoLinkedListsCase2() {
        Assert.assertEquals(4, i.getIntersectionNode(
                ListNode.buildListNodeByArray(
                        new Integer[]{-2, -3, 4, 5, 6}
                ),
                ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 4, 5, 6})).val);
    }
}
