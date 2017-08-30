package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.NonDecreasingArray;
import org.junit.Assert;
import org.junit.Test;

public class TestNonDecreasingArray {
    private NonDecreasingArray n = new NonDecreasingArray();

    @Test
    public void testNonDecreasingArrayCase1() {
        Assert.assertEquals(true, n.checkPossibility(new int[] {1}));
    }

    @Test
    public void testNonDecreasingArrayCase2() {
        Assert.assertEquals(true, n.checkPossibility(new int[] {2, 1}));
    }

    @Test
    public void testNonDecreasingArrayCase3() {
        Assert.assertEquals(true, n.checkPossibility(new int[] {1, 2}));
    }

    @Test
    public void testNonDecreasingArrayCase4() {
        Assert.assertEquals(true, n.checkPossibility(new int[] {1, 3, 2}));
    }

    @Test
    public void testNonDecreasingArrayCase5() {
        Assert.assertEquals(false, n.checkPossibility(new int[] {3, 4, 2, 3}));
    }

    @Test
    public void testNonDecreasingArrayCase6() {
        Assert.assertEquals(true, n.checkPossibility(new int[] {4, 2, 3}));
    }

    @Test
    public void testNonDecreasingArrayCase7() {
        Assert.assertEquals(true, n.checkPossibility(new int[] {-1, 4, 2, 3}));
    }

    @Test
    public void testNonDecreasingArrayCase8() {
        Assert.assertEquals(false, n.checkPossibility(new int[] {3, 3, 2, 2}));
    }

    @Test
    public void testNonDecreasingArrayCase9() {
        Assert.assertEquals(false, n.checkPossibility(new int[] {4, 2, 1}));
    }

    @Test
    public void testNonDecreasingArrayCase10() {
        Assert.assertEquals(false, n.checkPossibility(new int[] {1, 5, 4, 6, 7, 10, 10, 8, 9}));
    }

    @Test
    public void testNonDecreasingArrayCase11() {
        Assert.assertEquals(false, n.checkPossibility(new int[] {1, 2, 5, 4, 3}));
    }
}
