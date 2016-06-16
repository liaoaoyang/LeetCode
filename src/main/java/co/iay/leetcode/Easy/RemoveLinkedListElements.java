package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * Created by ng on 16/6/16.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode now = head;

        while (now != null) {
            if (now.val == val) {
                if (prev == null) {
                    head = now.next;
                    now = head;
                } else {
                    prev.next = now.next;
                    now = now.next;
                }

                continue;
            }

            prev = now;
            now = now.next;
        }

        return head;
    }
}
