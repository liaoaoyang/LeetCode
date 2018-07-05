package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.HandOfStraights;
import org.junit.Assert;
import org.junit.Test;

public class TestHandOfStraights {
    private HandOfStraights h = new HandOfStraights();

    @Test
    public void testHandOfStraightsCase1() {
        Assert.assertTrue(h.isNStraightHand(
                new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8},
                3));
    }

    @Test
    public void testHandOfStraightsCase2() {
        Assert.assertFalse(h.isNStraightHand(
                new int[]{1, 2, 3, 4, 5},
                4));
    }
}
