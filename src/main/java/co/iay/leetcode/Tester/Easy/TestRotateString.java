package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RotateString;
import org.junit.Assert;
import org.junit.Test;

public class TestRotateString {
    private RotateString r = new RotateString();

    @Test
    public void testRotateStringCase1() {
        Assert.assertEquals(true, r.rotateString("abcde", "cdeab"));
    }

    @Test
    public void testRotateStringCase2() {
        Assert.assertEquals(true, r.rotateString("abcde", "bcdea"));
    }

    @Test
    public void testRotateStringCase3() {
        Assert.assertEquals(true, r.rotateString("ababc", "cabab"));
    }

    @Test
    public void testRotateStringCase4() {
        Assert.assertEquals(false, r.rotateString("", ""));
    }
}
