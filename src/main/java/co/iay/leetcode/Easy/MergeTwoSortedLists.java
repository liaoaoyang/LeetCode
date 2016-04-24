package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * Created by ng on 16/4/24.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode it = head;

        while (l1 != null || l2 != null) {
            int val = 0;

            if (l1 == null) {
                val = l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                val = l1.val;
                l1 = l1.next;
            } else if (l1.val < l2.val) {
                val = l1.val;
                l1 = l1.next;
            } else {
                val = l2.val;
                l2 = l2.next;
            }

            if (it.val == Integer.MIN_VALUE) {
                it.val = val;
                continue;
            }

            it.next = new ListNode(val);
            it = it.next;
        }

        return head;
    }
}
