package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SqrtX;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/6.
 */
public class TestSqrtX {
    SqrtX s = new SqrtX();

    @Test
    public void testSqrtXCase1() {
        Assert.assertEquals(0, s.mySqrt(0));
    }

    @Test
    public void testSqrtXCase2() {
        Assert.assertEquals(1, s.mySqrt(1));
    }

    @Test
    public void testSqrtXCase3() {
        Assert.assertEquals(1, s.mySqrt(2));
    }

    @Test
    public void testSqrtXCase4() {
        Assert.assertEquals(1, s.mySqrt(3));
    }

    @Test
    public void testSqrtXCase5() {
        Assert.assertEquals(2, s.mySqrt(4));
    }

    @Test
    public void testSqrtXCase6() {
        Assert.assertEquals(3510, s.mySqrt(12323473));
    }
}
