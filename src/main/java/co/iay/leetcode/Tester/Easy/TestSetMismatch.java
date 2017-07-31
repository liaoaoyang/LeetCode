package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SetMismatch;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/7/28.
 */
public class TestSetMismatch {
    private SetMismatch s = new SetMismatch();

    @Test
    public void testSetMismatchCase1() {
        Assert.assertArrayEquals(new int[]{2, 3}, s.findErrorNums(new int[]{1, 2, 2, 4}));
    }

    @Test
    public void testSetMismatchCase2() {
        Assert.assertArrayEquals(new int[]{2, 1}, s.findErrorNums(new int[]{2, 2, 3, 4}));
    }

    @Test
    public void testSetMismatchCase3() {
        Assert.assertArrayEquals(new int[]{3, 4}, s.findErrorNums(new int[]{1, 2, 3, 3}));
    }

    @Test
    public void testSetMismatchCase4() {
        Assert.assertArrayEquals(new int[]{1, 4}, s.findErrorNums(new int[]{1, 1, 2, 3}));
    }
}
