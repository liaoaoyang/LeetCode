package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.JewelsAndStones;
import org.junit.Assert;
import org.junit.Test;

public class TestJewelsAndStones {
    private JewelsAndStones j = new JewelsAndStones();

    @Test
    public void testJewelsAndStonesCase1() {
        Assert.assertEquals(3, j.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void testJewelsAndStonesCase2() {
        Assert.assertEquals(0, j.numJewelsInStones("z", "ZZ"));
    }
}
