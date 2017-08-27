package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MaxConsecutiveOnes;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/1/23.
 */
public class TestMaxConsecutiveOnes {
    private MaxConsecutiveOnes m = new MaxConsecutiveOnes();

    @Test
    public void testMaxConsecutiveOnesCase1() {
        Assert.assertEquals(3, m.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

    @Test
    public void testMaxConsecutiveOnesCase2() {
        Assert.assertEquals(4, m.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1}));
    }
}
