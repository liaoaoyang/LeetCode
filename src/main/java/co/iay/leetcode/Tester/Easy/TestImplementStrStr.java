package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ImplementStrStr;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/4/8.
 */
public class TestImplementStrStr {
    private ImplementStrStr i = new ImplementStrStr();

    @Test
    public void testImplementStrStrCase1() {
        Assert.assertEquals(0, i.strStr("abcde", "abc"));
    }

    @Test
    public void testImplementStrStrCase2() {
        Assert.assertEquals(1, i.strStr("aabcde", "abc"));
    }

    @Test
    public void testImplementStrStrCase3() {
        Assert.assertEquals(-1, i.strStr("aabcde", "abce"));
    }

    @Test
    public void testImplementStrStrCase4() {
        Assert.assertEquals(0, i.strStr("a", "a"));
    }

    @Test
    public void testImplementStrStrCase5() {
        Assert.assertEquals(0, i.strStr("", ""));
    }
}
