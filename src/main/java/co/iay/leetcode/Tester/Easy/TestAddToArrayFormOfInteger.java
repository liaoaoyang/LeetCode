package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.AddToArrayFormOfInteger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestAddToArrayFormOfInteger {
    private AddToArrayFormOfInteger a = new AddToArrayFormOfInteger();

    @Test
    public void testAddToArrayFormOfIntegerCase1() {
        Assert.assertEquals(
                Arrays.asList(1, 2, 3, 4),
                a.addToArrayForm(new int[]{1, 2, 0, 0}, 34)
        );
    }

    @Test
    public void testAddToArrayFormOfIntegerCase2() {
        Assert.assertEquals(
                Arrays.asList(4, 5, 5),
                a.addToArrayForm(new int[]{2, 7, 4}, 181)
        );
    }

    @Test
    public void testAddToArrayFormOfIntegerCase3() {
        Assert.assertEquals(
                Arrays.asList(1, 0, 2, 1),
                a.addToArrayForm(new int[]{2, 1, 5}, 806)
        );
    }

    @Test
    public void testAddToArrayFormOfIntegerCase4() {
        Assert.assertEquals(
                Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                a.addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1)
        );
    }

    @Test
    public void testAddToArrayFormOfIntegerCase5() {
        Assert.assertEquals(
                Arrays.asList(2, 3),
                a.addToArrayForm(new int[]{0}, 23)
        );
    }

    @Test
    public void testAddToArrayFormOfIntegerCase6() {
        Assert.assertEquals(
                Arrays.asList(2, 4),
                a.addToArrayForm(new int[]{1}, 23)
        );
    }
}
