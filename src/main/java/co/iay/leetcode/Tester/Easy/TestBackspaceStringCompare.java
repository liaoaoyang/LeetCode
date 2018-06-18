package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.BackspaceStringCompare;
import org.junit.Assert;
import org.junit.Test;

public class TestBackspaceStringCompare {
    private BackspaceStringCompare b = new BackspaceStringCompare();

    @Test
    public void testBackspaceStringCompareCase1() {
        Assert.assertTrue(b.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void testBackspaceStringCompareCase2() {
        Assert.assertTrue(b.backspaceCompare("ab##c", "ad###c"));
    }

    @Test
    public void testBackspaceStringCompareCase3() {
        Assert.assertFalse(b.backspaceCompare("ab##c", "abd##c"));
    }
}
