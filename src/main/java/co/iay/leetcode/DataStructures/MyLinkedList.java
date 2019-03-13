package co.iay.leetcode.DataStructures;

/**
 * 707. Design Linked List
 * https://leetcode.com/problems/design-linked-list/
 * Design your implementation of the linked list. You can choose to use the singly linked list or the doubly linked list. A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node. If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.
 * <p>
 * Implement these functions in your linked list class:
 * <p>
 * get(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.
 * addAtHead(val) : Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
 * addAtTail(val) : Append a node of value val to the last element of the linked list.
 * addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
 * deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.
 * Example:
 * <p>
 * MyLinkedList linkedList = new MyLinkedList();
 * linkedList.addAtHead(1);
 * linkedList.addAtTail(3);
 * linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
 * linkedList.get(1);            // returns 2
 * linkedList.deleteAtIndex(1);  // now the linked list is 1->3
 * linkedList.get(1);            // returns 3
 * Note:
 * <p>
 * All values will be in the range of [1, 1000].
 * The number of operations will be in the range of [1, 1000].
 * Please do not use the built-in LinkedList library.
 */
public class MyLinkedList {
    private static class MyLinkedListNode {
        public int val;
        MyLinkedListNode next;
    }

    private MyLinkedListNode head;
    private MyLinkedListNode tail;
    private int              length;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        MyLinkedListNode node = head;
        int i = 0;

        while (node != null) {
            if (i == index) {
                return node.val;
            }

            node = node.next;
            ++i;
        }

        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        MyLinkedListNode node = new MyLinkedListNode();
        node.val = val;
        ++length;

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        head = node;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        MyLinkedListNode node = new MyLinkedListNode();
        node.val = val;
        ++length;

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > length || index < 0) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == length) {
            addAtTail(val);
            return;
        }

        MyLinkedListNode node = head;
        MyLinkedListNode prevNode = new MyLinkedListNode();
        prevNode.next = head;
        int i = 0;

        while (node != null) {
            if (i == index) {
                MyLinkedListNode n = new MyLinkedListNode();
                n.val = val;
                n.next = prevNode.next;
                prevNode.next = n;
                ++length;
                return;
            }

            node = node.next;
            prevNode = prevNode.next;
            ++i;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= length || index < 0) {
            return;
        }

        MyLinkedListNode node = head;
        MyLinkedListNode prevNode = new MyLinkedListNode();
        prevNode.next = head;
        int i = 0;

        while (node != null) {
            if (i == index) {
                --length;

                if (node == head) {
                    head = head.next;
                } else if (node == tail) {
                    prevNode.next = null;
                    tail = prevNode;
                } else {
                    prevNode.next = node.next;
                }

                return;
            }

            node = node.next;
            prevNode = prevNode.next;
            ++i;
        }
    }
}
