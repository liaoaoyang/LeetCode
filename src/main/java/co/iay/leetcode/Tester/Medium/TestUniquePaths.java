package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.UniquePaths;
import org.junit.Assert;
import org.junit.Test;

public class TestUniquePaths {
    private UniquePaths u = new UniquePaths();

    @Test
    public void testUniquePathsCase1() {
        Assert.assertEquals(28, u.uniquePaths(7, 3));
    }
}
