package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.CheckIfWordIsValidAfterSubstitutions;
import org.junit.Assert;
import org.junit.Test;

public class TestCheckIfWordIsValidAfterSubstitutions {
    private CheckIfWordIsValidAfterSubstitutions c = new CheckIfWordIsValidAfterSubstitutions();

    @Test
    public void testCheckIfWordIsValidAfterSubstitutionsCase1() {
        Assert.assertTrue(c.isValid("aabcbc"));
    }

    @Test
    public void testCheckIfWordIsValidAfterSubstitutionsCase2() {
        Assert.assertTrue(c.isValid("abcabcababcc"));
    }

    @Test
    public void testCheckIfWordIsValidAfterSubstitutionsCase3() {
        Assert.assertFalse(c.isValid("abccba"));
    }

    @Test
    public void testCheckIfWordIsValidAfterSubstitutionsCase4() {
        Assert.assertFalse(c.isValid("cababc"));
    }
}
