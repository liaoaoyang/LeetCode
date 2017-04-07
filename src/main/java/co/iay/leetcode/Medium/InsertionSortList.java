package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * Created by ng on 17/4/5.
 * 147. Insertion Sort List
 * https://leetcode.com/problems/insertion-sort-list
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode fakeHead = new ListNode(Integer.MIN_VALUE);

        while (head != null) {
            ListNode temp = fakeHead;

            while (temp.next != null && temp.next.val < head.val) {
                temp = temp.next;
            }

            ListNode tempNext = temp.next;
            ListNode nowHead = head;
            head = head.next;
            temp.next = nowHead;
            nowHead.next = tempNext;
        }

        return fakeHead.next;
    }
}
