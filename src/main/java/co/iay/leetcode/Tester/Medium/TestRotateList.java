package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Medium.RotateList;
import org.junit.Assert;
import org.junit.Test;

public class TestRotateList {
    private RotateList r = new RotateList();

    @Test
    public void testRotateListCase1() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.rotateRight(list, 2);
        Assert.assertArrayEquals(new Integer[] {4, 5, 1, 2, 3},
                ListNode.buildArrayByList(result));
    }

    @Test
    public void testRotateListCase2() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.rotateRight(list, 3);
        Assert.assertArrayEquals(new Integer[] {3, 4, 5, 1, 2},
                ListNode.buildArrayByList(result));
    }

    @Test
    public void testRotateListCase3() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.rotateRight(list, 4);
        Assert.assertArrayEquals(new Integer[] {2, 3, 4, 5, 1},
                ListNode.buildArrayByList(result));
    }

    @Test
    public void testRotateListCase4() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.rotateRight(list, 1);
        Assert.assertArrayEquals(new Integer[] {5, 1, 2, 3, 4},
                ListNode.buildArrayByList(result));
    }

    @Test
    public void testRotateListCase5() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.rotateRight(list, 6);
        Assert.assertArrayEquals(new Integer[] {5, 1, 2, 3, 4},
                ListNode.buildArrayByList(result));
    }

    @Test
    public void testRotateListCase6() {
        ListNode list = ListNode.buildListNodeByArray(new Integer[] {1, 2, 3, 4, 5});
        ListNode result = r.rotateRight(list, 5);
        Assert.assertArrayEquals(new Integer[] {1, 2, 3, 4, 5},
                ListNode.buildArrayByList(result));
    }
}
