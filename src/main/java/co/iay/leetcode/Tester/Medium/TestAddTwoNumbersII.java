package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Medium.AddTwoNumbersII;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by ng on 17/3/29.
 */
public class TestAddTwoNumbersII {
    private AddTwoNumbersII a = new AddTwoNumbersII();

    @Test
    public void testAddTwoNumbersCase1() {
        ListNode r = a.addTwoNumbers(ListNode.buildListNodeByArray(new Integer[] {1, 2}),
                ListNode.buildListNodeByArray(new Integer[] {9}));
        List<Integer> cmp = ListNode.buildArrayListByList(
                ListNode.buildListNodeByArray(new Integer[] {2, 1})
        );

        Assert.assertEquals(cmp, ListNode.buildArrayListByList(r));
    }

    @Test
    public void testAddTwoNumbersCase2() {
        ListNode r = a.addTwoNumbers(ListNode.buildListNodeByArray(new Integer[] {2, 4, 3}),
                ListNode.buildListNodeByArray(new Integer[] {5, 6, 4}));
        List<Integer> cmp = ListNode.buildArrayListByList(
                ListNode.buildListNodeByArray(new Integer[] {2, 1})
        );

        Assert.assertEquals(cmp, ListNode.buildArrayListByList(r));
    }
}
