package co.iay.leetcode.DataStructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aoyang on 16/4/14.
 */
public class ListNode implements Comparable {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode buildListNodeByArray(Integer[] arr) {
        ListNode l = null;

        if (null == arr || arr.length == 0) {
            return l;
        }

        l = new ListNode(arr[0]);
        ListNode tl = l;

        for (int i = 1; i < arr.length; ++i) {
            tl.next = new ListNode(arr[i]);
            tl = tl.next;
        }

        tl.next = null;

        return l;
    }

    public static List<Integer> buildArrayListByList(ListNode l) {
        ListNode tl = l;
        List<Integer> r = new ArrayList<Integer>();

        while (tl != null) {
            r.add(tl.val);
            tl = tl.next;
        }

        return r;
    }

    public static Integer[] buildArrayByList(ListNode l) {
        if (null == l) {
            return null;
        }

        List<Integer> li = buildArrayListByList(l);
        return li.toArray(new Integer[li.size()]);
    }

    @SuppressWarnings("unused")
    public static void printListByList(ListNode l) {
        ListNode tl = l;
        int count = 0;

        while (tl != null) {
            System.out.printf("%d->", tl.val);
            tl = tl.next;
            ++count;
        }

        if (count > 0) {
            System.out.println("NULL");
        } else {
            System.out.println();
        }
    }

    public int getLength() {
        int len = 0;

        ListNode tmp = this;

        while (tmp != null) {
            ++len;
            tmp = tmp.next;
        }

        return len;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null || !(o instanceof ListNode)) {
            return 1;
        }

        ListNode lo = (ListNode) o;

        if (lo.val == this.val) {
            return 0;
        }

        return lo.val > this.val ? -1 : 1;
    }
}

