package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.ComplexNumberMultiplication;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/5/6.
 */
public class TestComplexNumberMultiplication {
    private ComplexNumberMultiplication c = new ComplexNumberMultiplication();

    @Test
    public void testComplexNumberMultiplicationCase1() {
        Assert.assertEquals("0+2i", c.complexNumberMultiply("1+1i", "1+1i"));
    }
}
