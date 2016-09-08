package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.IsSubSequence;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/9/9.
 */
public class TestIsSubSequence {
    IsSubSequence m = new IsSubSequence();

    @Test
    public void testIsSubSequenceCase1() {
        Assert.assertEquals(true, m.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void testIsSubSequenceCase2() {
        Assert.assertEquals(false, m.isSubsequence("acb", "abcdc"));
    }

    @Test
    public void testIsSubSequenceCase3() {
        Assert.assertEquals(false, m.isSubsequence("leeeeetcode", "leeetcode"));
    }
}
