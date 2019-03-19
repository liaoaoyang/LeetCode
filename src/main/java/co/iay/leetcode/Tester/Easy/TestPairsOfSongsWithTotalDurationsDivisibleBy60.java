package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.PairsOfSongsWithTotalDurationsDivisibleBy60;
import org.junit.Assert;
import org.junit.Test;

public class TestPairsOfSongsWithTotalDurationsDivisibleBy60 {
    private PairsOfSongsWithTotalDurationsDivisibleBy60 p = new PairsOfSongsWithTotalDurationsDivisibleBy60();

    @Test
    public void testPairsOfSongsWithTotalDurationsDivisibleBy60Case1() {
        Assert.assertEquals(3, p.numPairsDivisibleBy60(new int[]{
                30, 20, 150, 100, 40
        }));
    }
}
