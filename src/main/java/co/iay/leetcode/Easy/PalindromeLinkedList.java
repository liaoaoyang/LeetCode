package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {
    private boolean isPalindromeList(List<Integer> str) {
        int i = 0;
        int j = str.size() - 1;

        while (i < j) {
            if (!str.get(i).equals(str.get(j))) {
                return false;
            }

            ++i;
            --j;
        }

        return true;
    }

    private boolean oNTimeNSpaceSolution(ListNode head) {
        List<Integer> nums = new ArrayList<Integer>();

        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }

        return isPalindromeList(nums);
    }

    public boolean isPalindrome(ListNode head) {
        return oNTimeNSpaceSolution(head);
    }
}
