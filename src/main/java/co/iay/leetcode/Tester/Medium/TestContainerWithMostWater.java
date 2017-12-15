package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.ContainerWithMostWater;
import org.junit.Assert;
import org.junit.Test;

public class TestContainerWithMostWater {
    private ContainerWithMostWater c = new ContainerWithMostWater();

    @Test
    public void testContainerWithMostWaterCase1() {
        Assert.assertEquals(4, c.maxArea(
                new int[]{1, 4, 4, 1}
        ));
    }
}
