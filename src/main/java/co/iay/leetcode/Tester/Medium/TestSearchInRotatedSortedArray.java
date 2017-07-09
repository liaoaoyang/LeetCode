package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.SearchInRotatedSortedArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/7/9.
 */
public class TestSearchInRotatedSortedArray {
    private SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();

    @Test
    public void testSearchInRotatedSortedArrayCase1() {
        Assert.assertEquals(2, s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 6));
    }

    @Test
    public void testSearchInRotatedSortedArrayCase2() {
        Assert.assertEquals(0, s.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 0));
    }

    @Test
    public void testSearchInRotatedSortedArrayCase3() {
        Assert.assertEquals(7, s.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 7));
    }

    @Test
    public void testSearchInRotatedSortedArrayCase4() {
        Assert.assertEquals(4, s.search(new int[]{4, 5, 6, 7, 0}, 0));
    }

    @Test
    public void testSearchInRotatedSortedArrayCase5() {
        Assert.assertEquals(-1, s.search(new int[]{4, 5, 6, 7, 0}, 1));
    }
}
