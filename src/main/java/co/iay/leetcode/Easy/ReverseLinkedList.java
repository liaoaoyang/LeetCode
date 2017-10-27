package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 16/6/16.
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    @SuppressWarnings("unused")
    private ListNode oNSolution(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();
        ListNode h = head;
        int idx = 0;

        while (h != null) {
            vals.add(idx, h.val);
            h = h.next;
            ++idx;
        }

        h = head;
        --idx;

        while (h != null) {
            h.val = vals.get(idx);
            h = h.next;
            --idx;
        }

        return head;
    }

    private ListNode o1Solution(ListNode head) {
        ListNode fakeHead = new ListNode(0);
        ListNode h = head;

        while (h != null) {
            ListNode tmp = h.next;
            h.next = fakeHead.next;
            fakeHead.next = h;
            h = tmp;
        }

        return fakeHead.next;
    }

    public ListNode reverseList(ListNode head) {
        return o1Solution(head);
    }
}
