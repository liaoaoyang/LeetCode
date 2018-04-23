package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MostCommonWord;
import org.junit.Assert;
import org.junit.Test;

public class TestMostCommonWord {
    private MostCommonWord m = new MostCommonWord();

    @Test
    public void testMostCommonWordCase1() {
        Assert.assertEquals("ball", m.mostCommonWord(
                "Bob hit a ball, the hit BALL flew far after it was hit.",
                new String[]{"hit"}
        ));
    }

    @Test
    public void testMostCommonWordCase2() {
        Assert.assertEquals("ball", m.mostCommonWord(
                "Bob. hIt, baLl",
                new String[]{"bob", "hit"}
        ));
    }
}
