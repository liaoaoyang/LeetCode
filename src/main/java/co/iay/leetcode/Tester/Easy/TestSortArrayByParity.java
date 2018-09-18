package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SortArrayByParity;
import org.junit.Assert;
import org.junit.Test;

public class TestSortArrayByParity {
    private SortArrayByParity s = new SortArrayByParity();

    @Test
    public void testSortArrayByParityCase1() {
        Assert.assertArrayEquals(new int[]{2, 4, 3, 1}, s.sortArrayByParity(new int[]{3, 1, 2, 4}));
    }
}
