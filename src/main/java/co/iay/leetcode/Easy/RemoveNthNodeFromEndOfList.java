package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

import java.util.HashMap;

/**
 * Created by ng on 16/4/23.
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        HashMap<Integer, ListNode> idxListMap = new HashMap<Integer, ListNode>();

        ListNode it = head;
        int i = 1;

        for(; it != null; it = it.next, ++i) {
            idxListMap.put(i, it);
        }

        if (idxListMap.size() == 1) {
            return null;
        }

        if (n == 1) {
            idxListMap.get(idxListMap.size() - 1).next = null;
            return head;
        }

        if (n == idxListMap.size()) {
            head = head.next;
            return head;
        }

        if (idxListMap.containsKey(idxListMap.size() - n) && idxListMap.containsKey(idxListMap.size() - n + 2)) {
            idxListMap.get(idxListMap.size() - n).next = idxListMap.get(idxListMap.size() - n + 2);
        }

        return head;
    }
}
