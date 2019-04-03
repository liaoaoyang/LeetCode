package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.BinaryPrefixDivisibleBy5;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestBinaryPrefixDivisibleBy5 {
    private BinaryPrefixDivisibleBy5 b = new BinaryPrefixDivisibleBy5();

    @Test
    public void testBinaryPrefixDivisibleBy5Case1() {
        Assert.assertEquals(
                Arrays.asList(true, false, false, false, true, false),
                b.prefixesDivBy5(
                        new int[]{0, 1, 1, 1, 1, 1}
                )
        );
    }
}
