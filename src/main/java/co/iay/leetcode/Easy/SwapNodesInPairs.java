package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * Created by ng on 16/5/1.
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode firstOfPair = null;
        ListNode nowNode = head;
        ListNode privNode = null;
        int i = 1;

        while (nowNode != null) {
            if (i % 2 == 1) {
                firstOfPair = nowNode;
                nowNode = nowNode.next;
            } else {
                if (firstOfPair == null) {
                    return head;
                }

                if (privNode != null) {
                    privNode.next = nowNode;
                }

                privNode = firstOfPair;
                firstOfPair.next = nowNode.next;
                nowNode.next = firstOfPair;

                if (i == 2) {
                    head = nowNode;
                }

                nowNode = firstOfPair.next;
            }

            ++i;
        }

        return head;
    }
}
