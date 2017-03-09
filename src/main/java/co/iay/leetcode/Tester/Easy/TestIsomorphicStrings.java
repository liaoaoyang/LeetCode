package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.IsomorphicStrings;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/3/10.
 */
public class TestIsomorphicStrings {
    private IsomorphicStrings is = new IsomorphicStrings();

    @Test
    public void testIsomorphicStringsCase1() {
        Assert.assertEquals(true, is.isIsomorphic("egg", "add"));
    }

    @Test
    public void testIsomorphicStringsCase2() {
        Assert.assertEquals(false, is.isIsomorphic("egg", "adf"));
    }

    @Test
    public void testIsomorphicStringsCase3() {
        Assert.assertEquals(true, is.isIsomorphic("aaa", "bbb"));
    }

    @Test
    public void testIsomorphicStringsCase4() {
        Assert.assertEquals(true, is.isIsomorphic("aba", "bab"));
    }

    @Test
    public void testIsomorphicStringsCase5() {
        Assert.assertEquals(false, is.isIsomorphic("aba", "baa"));
    }

    @Test
    public void testIsomorphicStringsCase6() {
        Assert.assertEquals(true, is.isIsomorphic("paper", "title"));
    }

    @Test
    public void testIsomorphicStringsCase7() {
        Assert.assertEquals(false, is.isIsomorphic("ab", "aa"));
    }
}
