package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * 61. Rotate List
 * https://leetcode.com/problems/rotate-list/
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode h = head;
        ListNode e = head;
        int length = 0;

        while (h != null) {
            ++length;
            h = h.next;

            if (e.next != null) {
                e = e.next;
            }
        }

        k = k % length;

        if (k == 0) {
            return head;
        }

        int realStartPos = length - k;

        ListNode prevH = null;
        h = head;

        for (int i = 1; i <= realStartPos; ++i) {
            prevH = h;
            h = h.next;
        }

        e.next = head;

        if (null != prevH) {
            prevH.next = null;
        }

        return h;
    }
}
