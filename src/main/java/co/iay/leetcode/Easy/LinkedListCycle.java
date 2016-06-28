package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

import java.util.HashMap;

/**
 * Created by ng on 16/6/28.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (null == head) {
            return false;
        }

        HashMap<Object, Integer> m = new HashMap<Object, Integer>();

        ListNode h = head;

        while (h != null) {
            if (m.containsKey(h)) {
                return true;
            }

            m.put(h, 1);
            h = h.next;
        }

        return false;
    }
}
