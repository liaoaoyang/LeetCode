package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FindPivotIndex;
import org.junit.Assert;
import org.junit.Test;

public class TestFindPivotIndex {
    private FindPivotIndex f = new FindPivotIndex();

    @Test
    public void testFindPivotIndexCase1() {
        Assert.assertEquals(3, f.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void testFindPivotIndexCase2() {
        Assert.assertEquals(-1, f.pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    public void testFindPivotIndexCase3() {
        Assert.assertEquals(0, f.pivotIndex(new int[]{1}));
    }

    @Test
    public void testFindPivotIndexCase4() {
        Assert.assertEquals(-1, f.pivotIndex(new int[]{}));
    }

    @Test
    public void testFindPivotIndexCase5() {
        Assert.assertEquals(0, f.pivotIndex(new int[]{-1, -1, -1, 0, 1, 1}));
    }

    @Test
    public void testFindPivotIndexCase6() {
        Assert.assertEquals(5, f.pivotIndex(new int[]{-2, -1, 0, 1, 2, 100}));
    }
}
