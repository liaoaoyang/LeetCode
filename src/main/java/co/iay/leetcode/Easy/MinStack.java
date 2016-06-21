package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/21.
 */
public class MinStack {
    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }

    private boolean gotMin = false;
    private int minVal = Integer.MAX_VALUE;
    private ListNode stack = null;

    public MinStack() {

    }

    public void push(int x) {
        minVal = getMin();

        if (x <= minVal) {
            minVal = x;
        }

        ListNode n = new ListNode(x);
        n.next = stack;
        stack = n;
    }

    public void pop() {
        if (stack == null) {
            gotMin = false;
            minVal = Integer.MAX_VALUE;
            return;
        }

        if (gotMin && stack.val == minVal) {
            gotMin = false;
            minVal = Integer.MAX_VALUE;
        }

        if (stack.next == null) {
            stack = null;
            gotMin = false;
            minVal = Integer.MAX_VALUE;
            return;
        }

        stack = stack.next;
    }

    public int top() {
        if (stack == null) {
            return 0;
        }

        return stack.val;
    }

    public int getMin() {
        if (gotMin) {
            return minVal;
        }

        ListNode h = stack;

        while (h != null) {
            if (h.val <= minVal) {
                gotMin = true;
                minVal = h.val;
            }

            h = h.next;
        }

        return minVal;
    }
}
