package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * 92. Reverse Linked List II
 * https://leetcode.com/problems/reverse-linked-list-ii/
 *
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *
 * return 1->4->3->2->5->NULL.
 *
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
 */

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;

        ListNode prevStartNode = fakeHead;
        ListNode startNode = head;
        ListNode afterEndNode = startNode.next;
        ListNode oldAfterEndNode = startNode.next;

        for (int i = 1; i < n; ++i) {
            if (i < m) {
                startNode = startNode.next;
                prevStartNode = prevStartNode.next;
            }

            if (i < n) {
                afterEndNode = afterEndNode.next;
                oldAfterEndNode = afterEndNode;
            }
        }

        ListNode nowNode = startNode;

        for (int i = m; i <= n; ++i) {
            ListNode nowNodeNextNode = nowNode.next;

            if (nowNodeNextNode != oldAfterEndNode) {
                prevStartNode.next = nowNodeNextNode;
            }

            nowNode.next = afterEndNode;
            afterEndNode = nowNode;
            nowNode = prevStartNode.next;
        }

        return fakeHead.next;
    }
}
