package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MinStack;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aoyang on 16/7/7.
 */
public class TestMinStack {
    @Test
    public void testMinStackCase1() {
        MinStack minStack = new MinStack();
        Assert.assertEquals(0, minStack.getMin());
    }

    public void testMinStackCase2() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        Assert.assertEquals(1, minStack.getMin());
    }

    public void testMinStackCase3() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(-1);
        Assert.assertEquals(-1, minStack.getMin());
    }

    public void testMinStackCase4() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(-2);
        minStack.push(-1);
        Assert.assertEquals(-2, minStack.getMin());
    }

    public void testMinStackCase5() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(-2);
        minStack.push(-1);
        minStack.pop();
        Assert.assertEquals(-2, minStack.getMin());
    }

    public void testMinStackCase6() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(-1);
        minStack.push(-2);
        minStack.pop();
        Assert.assertEquals(-1, minStack.getMin());
    }
}
