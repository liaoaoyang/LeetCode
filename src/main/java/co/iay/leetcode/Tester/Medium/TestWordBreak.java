package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.WordBreak;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestWordBreak {
    private WordBreak w = new WordBreak();

    @Test
    public void testWordBreakCase1() {
        Assert.assertEquals(true,
                w.wordBreak("leetcode", Arrays.asList("leet", "code")));
    }
}
