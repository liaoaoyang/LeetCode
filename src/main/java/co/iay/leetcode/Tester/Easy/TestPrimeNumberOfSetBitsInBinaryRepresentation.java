package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.PrimeNumberOfSetBitsInBinaryRepresentation;
import org.junit.Assert;
import org.junit.Test;

public class TestPrimeNumberOfSetBitsInBinaryRepresentation {
    private PrimeNumberOfSetBitsInBinaryRepresentation p = new PrimeNumberOfSetBitsInBinaryRepresentation();

    @Test
    public void testPrimeNumberOfSetBitsInBinaryRepresentationCase1() {
        Assert.assertEquals(4, p.countPrimeSetBits(6, 10));
    }

    @Test
    public void testPrimeNumberOfSetBitsInBinaryRepresentationCase2() {
        Assert.assertEquals(5, p.countPrimeSetBits(10, 15));
    }
}
