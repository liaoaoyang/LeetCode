package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LongestUncommonSubsequenceI;
import org.junit.Assert;
import org.junit.Test;

public class TestLongestUncommonSubsequenceI {
    private LongestUncommonSubsequenceI l = new LongestUncommonSubsequenceI();

    @Test
    public void testLongestUncommonSubsequenceICase1() {
        Assert.assertEquals(3, l.findLUSlength("aba", "cdc"));
    }
}
