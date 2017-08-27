package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MissingNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/3/31.
 */
public class TestMissingNumber {
    private MissingNumber m = new MissingNumber();

    @Test
    public void testMissingNumberCase1() {
        Assert.assertEquals(3, m.missingNumber(new int[]{4, 1, 0, 2}));
    }

    @Test
    public void testMissingNumberCase2() {
        Assert.assertEquals(1, m.missingNumber(new int[]{0}));
    }

    @Test
    public void testMissingNumberCase3() {
        Assert.assertEquals(0, m.missingNumber(new int[]{1}));
    }
}
