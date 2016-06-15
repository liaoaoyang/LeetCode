package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * Created by ng on 16/6/15.
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
