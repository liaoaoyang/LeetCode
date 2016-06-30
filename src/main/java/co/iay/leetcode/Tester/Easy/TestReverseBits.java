package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ReverseBits;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/6/30.
 */
public class TestReverseBits {
    ReverseBits reverseBits = new ReverseBits();

    @Test
    public void testReverseBitsCase1() {
        Assert.assertEquals(964176192, reverseBits.reverseBits(43261596));
    }

    @Test
    public void testReverseBitsCase2() {
        Assert.assertEquals(1, reverseBits.reverseBits(-2147483648));
    }

    @Test
    public void testReverseBitsCase3() {
        Assert.assertEquals(-2, reverseBits.reverseBits(Integer.MAX_VALUE));
    }
}
