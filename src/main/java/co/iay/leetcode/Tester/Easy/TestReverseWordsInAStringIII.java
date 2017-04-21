package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ReverseWordsInAStringIII;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/4/22.
 */
public class TestReverseWordsInAStringIII {
    private ReverseWordsInAStringIII r = new ReverseWordsInAStringIII();

    @Test
    public void testReverseWordsInAStringIIICase1() {
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", r.reverseWords("Let's take LeetCode contest"));
    }

    @Test
    public void testReverseWordsInAStringIIICase2() {
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc  ", r.reverseWords("Let's take LeetCode contest  "));
    }

    @Test
    public void testReverseWordsInAStringIIICase3() {
        Assert.assertEquals("I love u", r.reverseWords("I evol u"));
    }
}
