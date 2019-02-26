package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LargestTimeForGivenDigits;
import org.junit.Assert;
import org.junit.Test;

public class TestLargestTimeForGivenDigits {
    private LargestTimeForGivenDigits l = new LargestTimeForGivenDigits();

    @Test
    public void testLargestTimeForGivenDigitsCase1() {
        Assert.assertEquals(
                "23:41",
                l.largestTimeFromDigits(new int[]{1, 2, 3, 4})
        );
    }

    @Test
    public void testLargestTimeForGivenDigitsCase2() {
        Assert.assertEquals(
                "",
                l.largestTimeFromDigits(new int[]{5, 5, 5, 5})
        );
    }
}
