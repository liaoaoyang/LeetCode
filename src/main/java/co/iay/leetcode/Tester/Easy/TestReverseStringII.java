package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ReverseStringII;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/3/15.
 */
public class TestReverseStringII {
    private ReverseStringII r = new ReverseStringII();

    @Test
    public void testReverseStringIICase1() {
        Assert.assertEquals("bacdfeg", r.reverseStr("abcdefg", 2));
    }

    @Test
    public void testReverseStringIICase2() {
        Assert.assertEquals("bacdfg", r.reverseStr("abcdgf", 2));
    }
}
