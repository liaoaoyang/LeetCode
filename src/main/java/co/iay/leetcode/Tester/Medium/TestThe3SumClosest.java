package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.The3SumClosest;
import org.junit.Assert;
import org.junit.Test;

public class TestThe3SumClosest {
    private The3SumClosest t = new The3SumClosest();

    @Test
    public void testThe3SumClosestCase1() {
        Assert.assertEquals(2,
                t.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
