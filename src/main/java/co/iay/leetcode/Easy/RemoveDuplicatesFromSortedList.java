package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * Created by ng on 16/6/9.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return null;
        }

        ListNode r = head;
        int now = 0;

        while (r.next != null) {
            now = r.val;

            if (now == r.next.val) {
                r.next = r.next.next;
            } else {
                r = r.next;
            }
        }

        return head;
    }
}
