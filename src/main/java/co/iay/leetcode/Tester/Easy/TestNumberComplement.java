package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.NumberComplement;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/1/23.
 */
public class TestNumberComplement {
    private NumberComplement n = new NumberComplement();

    @Test
    public void testNumberComplementCase1() {
        Assert.assertEquals(2, n.findComplement(5));
    }
}
