package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.DailyTemperatures;
import org.junit.Assert;
import org.junit.Test;

public class TestDailyTemperatures {
    private DailyTemperatures d = new DailyTemperatures();

    @Test
    public void testDailyTemperaturesCase1() {
        Assert.assertArrayEquals(
                new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                d.dailyTemperatures(new int[]{
                        73, 74, 75, 71, 69, 72, 76, 73
                })
        );
    }
}
