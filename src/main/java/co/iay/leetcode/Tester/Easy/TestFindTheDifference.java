package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FindTheDifference;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/8/29.
 */
public class TestFindTheDifference {
    private FindTheDifference f = new FindTheDifference();

    @Test
    public void testFindTheDifferenceCase1() {
        Assert.assertEquals('e', f.findTheDifference("abcd", "abcde"));
    }

    @Test
    public void testFindTheDifferenceCase2() {
        Assert.assertEquals('d', f.findTheDifference("abcddd", "abcdddd"));
    }
}
