package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.Base7;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/18.
 */
public class TestBase7 {
    private Base7 b = new Base7();

    @Test
    public void testBase7Case1() {
        Assert.assertEquals("202", b.convertToBase7(100));
    }

    @Test
    public void testBase7Case2() {
        Assert.assertEquals("-203", b.convertToBase7(-101));
    }

    @Test
    public void testBase7Case3() {
        Assert.assertEquals("-10", b.convertToBase7(-7));
    }

    @Test
    public void testBase7Case4() {
        Assert.assertEquals("-20", b.convertToBase7(-14));
    }

    @Test
    public void testBase7Case5() {
        Assert.assertEquals("-16", b.convertToBase7(-13));
    }

    @Test
    public void testBase7Case6() {
        Assert.assertEquals("0", b.convertToBase7(0));
    }
}
