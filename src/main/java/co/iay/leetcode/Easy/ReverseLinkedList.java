package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 16/6/16.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();
        ListNode h = head;
        int idx = 0;

        while (h != null) {
            vals.add(idx, h.val);
            h = h.next;
            ++idx;
        }

        h = head;
        --idx;

        while (h != null) {
            h.val = vals.get(idx);
            h = h.next;
            --idx;
        }

        return head;
    }
}
