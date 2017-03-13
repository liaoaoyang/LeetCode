package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.NumberOfSegmentsInAString;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/3/13.
 */
public class TestNumberOfSegmentsInAString {
    private NumberOfSegmentsInAString n = new NumberOfSegmentsInAString();

    @Test
    public void testNumberOfSegmentsInAStringCase1() {
        Assert.assertEquals(5, n.countSegments("Hello, my name is John"));
    }

    @Test
    public void testNumberOfSegmentsInAStringCase2() {
        Assert.assertEquals(6, n.countSegments("   He llo, my name is John  "));
    }
}
