package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.ListNode;

/**
 * Created by ng on 17/3/29.
 * 445. Add Two Numbers II
 * https://leetcode.com/problems/add-two-numbers-ii
 */
public class AddTwoNumbersII {
    private static int getListLength(ListNode l) {
        int idx = 0;

        while (l != null) {
            ++idx;
            l = l.next;
        }

        return idx;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = l1;
        int[] la1 = new int[getListLength(l1)];
        int idx = 0;

        while (l != null) {
            la1[idx] = l.val;
            ++idx;
            l = l.next;
        }

        l = l2;
        int[] la2 = new int[getListLength(l2)];
        idx = 0;

        while (l != null) {
            la2[idx] = l.val;
            ++idx;
            l = l.next;
        }

        int[] longer = (la1.length > la2.length ? la1 : la2);
        int[] shorter = (la1.length <= la2.length ? la1 : la2);

        ListNode result = new ListNode(0);
        ListNode tr = result;
        int carryVal = 0;
        int[] resultArr = new int[longer.length + 1];
        int k = resultArr.length - 1;

        for (int i = longer.length - 1, j = shorter.length - 1; i >= 0; --i, --j, --k) {
            int nowVal = 0;

            if (j >= 0) {
                nowVal = longer[i] + shorter[j] + carryVal;
            } else {
                nowVal = longer[i] + carryVal;
            }

            carryVal = (nowVal / 10);
            resultArr[k] = (nowVal >= 10 ? nowVal % 10 : nowVal);
        }

        resultArr[k] = carryVal;
        int startIdx = (resultArr[0] == 0 ? 1 : 0);

        for (int i = startIdx; i < resultArr.length; ++i) {
            if (i == startIdx) {
                tr.val = resultArr[i];
                continue;
            }

            tr.next = new ListNode(resultArr[i]);
            tr = tr.next;
        }

        return result;
    }
}
