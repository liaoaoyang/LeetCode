package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ComplementOfBase10Integer;
import org.junit.Assert;
import org.junit.Test;

public class TestComplementOfBase10Integer {
    private ComplementOfBase10Integer c = new ComplementOfBase10Integer();

    @Test
    public void testComplementOfBase10IntegerCase1() {
        Assert.assertEquals(2, c.bitwiseComplement(5));
    }

    @Test
    public void testComplementOfBase10IntegerCase2() {
        Assert.assertEquals(0, c.bitwiseComplement(7));
    }

    @Test
    public void testComplementOfBase10IntegerCase3() {
        Assert.assertEquals(5, c.bitwiseComplement(10));
    }

    @Test
    public void testComplementOfBase10IntegerCase4() {
        Assert.assertEquals(1, c.bitwiseComplement(0));
    }

    @Test
    public void testComplementOfBase10IntegerCase5() {
        Assert.assertEquals(0, c.bitwiseComplement(1));
    }

    @Test
    public void testComplementOfBase10IntegerCase6() {
        // 1000000000 111011100110101100101000000000
        // 73741823   000100011001010011010111111111
        Assert.assertEquals(73741823, c.bitwiseComplement(1000000000));
    }
}
