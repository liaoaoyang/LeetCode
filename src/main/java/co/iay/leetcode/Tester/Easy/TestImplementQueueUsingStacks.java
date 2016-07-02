package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ImplementQueueUsingStacks;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/2.
 */
public class TestImplementQueueUsingStacks {
    @Test
    public void testMyQueueCase1() {
        ImplementQueueUsingStacks.MyQueue myQueue = new ImplementQueueUsingStacks.MyQueue();

        int arrLen = 3;

        int[] case1 = new int[arrLen];

        for (int i = 0; i < arrLen; ++i) {
            case1[i] = (int)(Math.random() * 100);
            myQueue.push(case1[i]);
        }

        int[] poped = new int[arrLen];

        for (int i = 0; i < arrLen; ++i) {
            poped[i] = myQueue.peek();
            myQueue.pop();
        }

        Assert.assertArrayEquals(poped, case1);
    }
}
