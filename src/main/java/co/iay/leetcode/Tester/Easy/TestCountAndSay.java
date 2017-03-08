package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.CountAndSay;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/3/9.
 */
public class TestCountAndSay {
    private CountAndSay c = new CountAndSay();

    @Test
    public void testCountAndSayCase1() {
        Assert.assertEquals("", c.countAndSay(0));
    }

    @Test
    public void testCountAndSayCase2() {
        Assert.assertEquals("111221", c.countAndSay(5));
    }
}
