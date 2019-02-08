package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.NRepeatedElementInSize2NArray;
import org.junit.Assert;
import org.junit.Test;

public class TestNRepeatedElementInSize2NArray {
    private NRepeatedElementInSize2NArray n = new NRepeatedElementInSize2NArray();

    @Test
    public void testNRepeatedElementInSize2NArrayCase1() {
        Assert.assertEquals(3, n.repeatedNTimes(
                new int[]{1, 2, 3, 3}
        ));
    }
}
