package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.DetectCapital;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/23.
 */
public class TestDetectCapital {
    private DetectCapital d = new DetectCapital();

    @Test
    public void testDetectCapitalCase1() {
        Assert.assertEquals(true, d.detectCapitalUse("A"));
    }

    @Test
    public void testDetectCapitalCase2() {
        Assert.assertEquals(true, d.detectCapitalUse("AB"));
    }

    @Test
    public void testDetectCapitalCase3() {
        Assert.assertEquals(true, d.detectCapitalUse("Ab"));
    }

    @Test
    public void testDetectCapitalCase4() {
        Assert.assertEquals(true, d.detectCapitalUse("ab"));
    }

    @Test
    public void testDetectCapitalCase5() {
        Assert.assertEquals(false, d.detectCapitalUse("aB"));
    }

    @Test
    public void testDetectCapitalCase6() {
        Assert.assertEquals(false, d.detectCapitalUse("BaB"));
    }

    @Test
    public void testDetectCapitalCase7() {
        Assert.assertEquals(true, d.detectCapitalUse("USA"));
    }

    @Test
    public void testDetectCapitalCase8() {
        Assert.assertEquals(false, d.detectCapitalUse("FlaG"));
    }
}
