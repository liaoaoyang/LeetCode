package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FibonacciNumber;
import org.junit.Assert;
import org.junit.Test;

public class TestFibonacciNumber {
    private FibonacciNumber f = new FibonacciNumber();

    @Test
    public void testFibonacciNumberCase1() {
        Assert.assertEquals(0, f.fib(0));
    }

    @Test
    public void testFibonacciNumberCase2() {
        Assert.assertEquals(1, f.fib(1));
    }

    @Test
    public void testFibonacciNumberCase3() {
        Assert.assertEquals(1, f.fib(2));
    }

    @Test
    public void testFibonacciNumberCase4() {
        Assert.assertEquals(2, f.fib(3));
    }

    @Test
    public void testFibonacciNumberCase5() {
        Assert.assertEquals(3, f.fib(4));
    }

    @Test
    public void testFibonacciNumberCase6() {
        Assert.assertEquals(5, f.fib(5));
    }

    @Test
    public void testFibonacciNumberCase7() {
        Assert.assertEquals(8, f.fib(6));
    }
}
