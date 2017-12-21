package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.ListNode;
import co.iay.leetcode.Easy.PalindromeLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class TestPalindromeLinkedList {
    private PalindromeLinkedList p = new PalindromeLinkedList();

    @Test
    public void testPalindromeLinkedListCase1() {
        Assert.assertEquals(true,
                p.isPalindrome(ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 3, 2, 1})));
    }

    @Test
    public void testPalindromeLinkedListCase2() {
        Assert.assertEquals(true,
                p.isPalindrome(ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 2, 1})));
    }

    @Test
    public void testPalindromeLinkedListCase3() {
        Assert.assertEquals(false,
                p.isPalindrome(ListNode.buildListNodeByArray(new Integer[]{1, 2, 3, 3, 2})));
    }
}
