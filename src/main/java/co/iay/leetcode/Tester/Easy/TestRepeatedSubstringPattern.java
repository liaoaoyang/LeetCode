package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RepeatedSubstringPattern;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/1/29.
 */
public class TestRepeatedSubstringPattern {
    RepeatedSubstringPattern r = new RepeatedSubstringPattern();

    @Test
    public void testRepeatedSubstringPatternCase1() {
        Assert.assertEquals(true, r.repeatedSubstringPattern("abab"));
    }

    @Test
    public void testRepeatedSubstringPatternCase2() {
        Assert.assertEquals(false, r.repeatedSubstringPattern("aba"));
    }

    @Test
    public void testRepeatedSubstringPatternCase3() {
        Assert.assertEquals(true, r.repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    public void testRepeatedSubstringPatternCase4() {
        Assert.assertEquals(false, r.repeatedSubstringPattern("a"));
    }

    @Test
    public void testRepeatedSubstringPatternCase5() {
        Assert.assertEquals(true, r.repeatedSubstringPattern("aa"));
    }

    @Test
    public void testRepeatedSubstringPatternCase6() {
        Assert.assertEquals(true, r.repeatedSubstringPattern("aaa"));
    }
}
