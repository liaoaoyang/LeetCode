package co.iay.leetcode.Tester.DataStructures;

import co.iay.leetcode.DataStructures.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class TestMyLinkedList {
    @Test
    public void testCase1() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
        Assert.assertEquals(2, linkedList.get(1));            // returns 2
        linkedList.deleteAtIndex(1);  // now the linked list is 1->3
        Assert.assertEquals(3, linkedList.get(1));            // returns 3
    }
}
