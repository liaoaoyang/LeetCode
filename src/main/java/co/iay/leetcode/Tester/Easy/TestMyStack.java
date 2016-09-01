package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MyStack;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/9/1.
 */
public class TestMyStack {
    @Test
    public void testMyStackCase1() {
        MyStack myStack = new MyStack();
        Assert.assertEquals(true, myStack.empty());
    }

    @Test
    public void testMyStackCase2() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        Assert.assertEquals(1, myStack.top());
    }

    @Test
    public void testMyStackCase3() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        Assert.assertEquals(2, myStack.top());
        myStack.pop();
        Assert.assertEquals(1, myStack.top());
    }
}
