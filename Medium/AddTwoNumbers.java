/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Map<Integer, Integer> lm1 = new HashMap<>();
        Map<Integer, Integer> lm2 = new HashMap<>();

        ListNode l = l1;
        int idx = 0;

        while (l != null) {
            lm1.put(idx, l.val);
            ++idx;
            l = l.next;
        }

        l = l2;
        idx = 0;

        while (l != null) {
            lm2.put(idx, l.val);
            ++idx;
            l = l.next;
        }

        Map<Integer, Integer> longer = (lm1.size() > lm2.size() ? lm1 : lm2);
        Map<Integer, Integer> shorter = (lm1.size() <= lm2.size() ? lm1 : lm2);
        int lengthGap = longer.size() - shorter.size();

        ListNode result = new ListNode(0);
        ListNode resultRef = result;
        int carryVal = 0;

        for (int i = 0; i < longer.size(); ++i) {
            int nowVal = 0;

            if (i >= shorter.size()) {
                nowVal = longer.get(i) + carryVal;
            } else {
                nowVal = longer.get(i) + shorter.get(i) + carryVal;
            }

            carryVal = (nowVal / 10);
            resultRef.val = (nowVal >= 10 ? nowVal % 10 : nowVal);

            if (i != longer.size() - 1) {
                resultRef.next = new ListNode(carryVal);
                resultRef = resultRef.next;
            } else {
                if (carryVal > 0) {
                    resultRef.next = new ListNode(carryVal);
                    resultRef = resultRef.next;
                }

                resultRef.next = null;
            }
        }

        return result;
    }
}
