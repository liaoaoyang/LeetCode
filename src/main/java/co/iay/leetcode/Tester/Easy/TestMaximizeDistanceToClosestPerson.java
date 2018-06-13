package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MaximizeDistanceToClosestPerson;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximizeDistanceToClosestPerson {
    private MaximizeDistanceToClosestPerson m = new MaximizeDistanceToClosestPerson();

    @Test
    public void testMaximizeDistanceToClosestPersonCase1() {
        Assert.assertEquals(3,
                m.maxDistToClosest(new int[]{0, 0, 0, 1, 0, 0, 0, 0, 1}));
    }

    @Test
    public void testMaximizeDistanceToClosestPersonCase2() {
        Assert.assertEquals(3,
                m.maxDistToClosest(new int[]{1, 0, 0, 0}));
    }

    @Test
    public void testMaximizeDistanceToClosestPersonCase3() {
        Assert.assertEquals(2,
                m.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
    }
}
