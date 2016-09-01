package co.iay.leetcode.Easy;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by ng on 16/9/1.
 */
public class MyStack {
    Queue<Integer> q = new ArrayDeque<Integer>();
    Queue<Integer> qh = new ArrayDeque<Integer>();

    // Push element x onto stack.
    public void push(int x) {
        while (!q.isEmpty()) {
            qh.add(q.poll());
        }

        q.add(x);

        while (!qh.isEmpty()) {
            q.add(qh.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
}
