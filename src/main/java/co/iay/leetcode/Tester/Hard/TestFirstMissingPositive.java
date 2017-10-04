package co.iay.leetcode.Tester.Hard;

import co.iay.leetcode.Hard.FirstMissingPositive;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/7/13.
 */
public class TestFirstMissingPositive {
    private FirstMissingPositive f = new FirstMissingPositive();

    @Test
    public void testFirstMissingPositiveCase1() {
        Assert.assertEquals(3, f.firstMissingPositive(new int[]{1, 2, 0}));
    }

    @Test
    public void testFirstMissingPositiveCase2() {
        Assert.assertEquals(2, f.firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    @Test
    public void testFirstMissingPositiveCase3() {
        Assert.assertEquals(2, f.firstMissingPositive(new int[]{1, 1}));
    }
}
