package co.iay.leetcode.Hard;

import co.iay.leetcode.DataStructures.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * Solution:
 * K路归并排序，难点在于选出最小的节点值并且降低这一个步骤的复杂度。
 * 所以可以使用一个小顶堆，m为链表的平均长度，复杂度从O(k*k*m)降低为O(k*log(k)*m)
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> listHeap = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val > o2.val ? 1 : -1;
            }
        });

        for (ListNode n : lists) {
            if (n == null) {
                continue;
            }

            listHeap.add(n);
        }

        ListNode head = new ListNode(0);
        ListNode h = head;

        while (listHeap.size() > 0) {
            ListNode n = listHeap.poll();

            if (n != null) {
                h.next = n;
                h = h.next;
                n = n.next;

                if (n != null) {
                    listHeap.add(n);
                }
            }

        }

        return head.next;
    }
}
