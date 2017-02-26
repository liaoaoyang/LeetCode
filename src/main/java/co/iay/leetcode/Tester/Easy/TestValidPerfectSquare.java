package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ValidPerfectSquare;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/26.
 */
public class TestValidPerfectSquare {
    ValidPerfectSquare v = new ValidPerfectSquare();

    @Test
    public void testValidPerfectSquareCase1() {
        Assert.assertEquals(true, v.isPerfectSquare(16));
    }

    @Test
    public void testValidPerfectSquareCase2() {
        Assert.assertEquals(false, v.isPerfectSquare(14));
    }
}
