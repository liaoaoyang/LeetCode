package co.iay.leetcode.Easy;

import java.util.Stack;

/**
 * Created by ng on 16/7/2.
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class ImplementQueueUsingStacks {
    public static class MyQueue {
        private Stack<Integer> q = new Stack<Integer>();
        private Stack<Integer> tmpQ = new Stack<Integer>();

        // Push element x to the back of queue.
        public void push(int x) {
            q.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            while (!q.isEmpty()) {
                tmpQ.push(q.pop());
            }

            tmpQ.pop();

            while (!tmpQ.isEmpty()) {
                q.push(tmpQ.pop());
            }
        }

        // Get the front element.
        public int peek() {
            while (!q.isEmpty()) {
                tmpQ.push(q.pop());
            }

            int peek = tmpQ.peek();

            while (!tmpQ.isEmpty()) {
                q.push(tmpQ.pop());
            }

            return peek;
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return q.isEmpty();
        }
    }
}
