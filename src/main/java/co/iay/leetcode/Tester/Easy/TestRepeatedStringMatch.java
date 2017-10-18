package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RepeatedStringMatch;
import org.junit.Assert;
import org.junit.Test;

public class TestRepeatedStringMatch {
    private RepeatedStringMatch r = new RepeatedStringMatch();

    @Test
    public void testRepeatedStringMatchCase1() {
        Assert.assertEquals(3, r.repeatedStringMatch("abcd", "cdabcdab"));
    }

    @Test
    public void testRepeatedStringMatchCase2() {
        Assert.assertEquals(-1, r.repeatedStringMatch("abcd", "cdd"));
    }

    @Test
    public void testRepeatedStringMatchCase3() {
        Assert.assertEquals(2, r.repeatedStringMatch("abcd", "cdabc"));
    }
}
