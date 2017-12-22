package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * 160. Intersection of Two Linked Lists
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * <p>
 * <p>
 * For example, the following two linked lists:
 * <p>
 * A:       a1 → a2
 * ↘
 * c1 → c2 → c3
 * ↗
 * B: b1 → b2 → b3
 * begin to intersect at node c1.
 * <p>
 * <p>
 * Notes:
 * <p>
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * Solution:
 * 将两条链表视作类似环的结构，一条链表走到头则切换到另一个链表，直到二者值相同。
 * 如果没有相同，并且已经两条路径都走过，说明没有相同的节点，返回null。
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;
        int aa = 0;
        int bb = 0;

        while (a.val != b.val && aa < 2 && bb < 2) {
            if (a.next == null) {
                a = headB;
                ++aa;
            } else {
                a = a.next;
            }

            if (b.next == null) {
                b = headA;
                ++bb;
            } else {
                b = b.next;
            }
        }

        return aa == 2 && bb == 2 ? null : a;
    }
}
