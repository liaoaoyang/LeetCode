package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 16/11/4.
 */
public class TestFizzBuzz {
    private FizzBuzz m = new FizzBuzz();

    @Test
    public void testFizzBuzzCase1() {
        List<String> cmp = new ArrayList<String>();
        cmp.add("1");
        cmp.add("2");
        cmp.add("Fizz");
        cmp.add("4");
        cmp.add("Buzz");
        cmp.add("Fizz");
        cmp.add("7");
        cmp.add("8");
        cmp.add("Fizz");
        cmp.add("Buzz");
        cmp.add("11");
        cmp.add("Fizz");
        cmp.add("13");
        cmp.add("14");
        cmp.add("FizzBuzz");
        Assert.assertEquals(cmp, m.fizzBuzz(15));
    }
}
