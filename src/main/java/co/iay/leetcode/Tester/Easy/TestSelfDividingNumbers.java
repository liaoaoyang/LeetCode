package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SelfDividingNumbers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestSelfDividingNumbers {
    private SelfDividingNumbers s = new SelfDividingNumbers();

    @Test
    public void testSelfDividingNumbersCase1() {
        Assert.assertEquals(Arrays.asList(128), s.selfDividingNumbers(128, 128));
    }

    @Test
    public void testSelfDividingNumbersCase2() {
        Assert.assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22), s.selfDividingNumbers(1, 22));
    }
}
