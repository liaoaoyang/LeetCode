package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class TestBinarySearch {
    private BinarySearch b = new BinarySearch();

    @Test
    public void testBinarySearchCase1() {
        Assert.assertEquals(4, b.search(new int[]{
                -1, 0, 3, 5, 9, 12
        }, 9));
    }

    @Test
    public void testBinarySearchCase2() {
        Assert.assertEquals(-1, b.search(new int[]{
                -1, 0, 3, 5, 9, 12
        }, 2));
    }
}
