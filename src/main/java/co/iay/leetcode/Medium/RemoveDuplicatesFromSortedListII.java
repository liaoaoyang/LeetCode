package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.ListNode;

import java.util.HashSet;

/**
 * 82. Remove Duplicates from Sorted List II
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * <p>
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * <p>
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * <p>
 * Solution:
 * <p>
 * 首先按照常规做法，使用一个假头结点，方便处理第一个节点就要删除的情况。
 * 之后记录当前节点的前一节点，如果当前节点和前一节点的值相同，则说明出现重复，执行删除操作，同时记录重复值。
 * 一遍删除完成之后，再次遍历链表，删除重复值
 * <p>
 * 时间复杂度O(n)，空间复杂度O(n)。
 * 效率不高。
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        HashSet<Integer> hs = new HashSet<Integer>();
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;

        ListNode pr = fakeHead;
        ListNode h = head;
        Integer prevVal = null;

        while (h != null) {
            if (prevVal == null || prevVal != h.val) {
                pr = pr.next;
                prevVal = h.val;
                h = h.next;
                continue;
            }

            hs.add(h.val);
            h = h.next;
        }

        h = head;
        pr = fakeHead;

        while (h != null) {
            if (hs.contains(h.val)) {
                h = h.next;
                pr.next = h;
                continue;
            }

            pr = pr.next;
            h = h.next;
        }

        return fakeHead.next;
    }
}
