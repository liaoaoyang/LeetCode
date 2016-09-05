package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Medium.UTF8Validation;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/9/5.
 */
public class TestUTF8Validation {
    UTF8Validation utf8Validation = new UTF8Validation();

    @Test
    public void testUTF8ValidationCase1() {
        Assert.assertEquals(true, utf8Validation.validUtf8(new int[]{197, 130, 1}));
    }

    @Test
    public void testUTF8ValidationCase2() {
        Assert.assertEquals(false, utf8Validation.validUtf8(new int[]{237}));
    }

    @Test
    public void testUTF8ValidationCase3() {
        Assert.assertEquals(true, utf8Validation.validUtf8(new int[]{240, 162, 138, 147, 17}));
    }
}
