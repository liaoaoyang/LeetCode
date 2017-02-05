package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SearchInsertPosition;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/5.
 */
public class TestSearchInsertPosition {
    private SearchInsertPosition s = new SearchInsertPosition();

    /**
     [1]
     0
     [1,3,5,6]
     5
     [1,3,5,6]
     2
     [1,3,4,5,6]
     2
     [1,3,5,6]
     7
     [1,3]
     2
     [1]
     2
     [2]
     1
     [1,3,5,6]
     6
     [1,3,5,6]
     1
     */
    @Test
    public void testSearchInsertPositionCase1() {
        Assert.assertEquals(0, s.searchInsert(new int[]{1}, 0));
    }

    @Test
    public void testSearchInsertPositionCase2() {
        Assert.assertEquals(2, s.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void testSearchInsertPositionCase3() {
        Assert.assertEquals(1, s.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    public void testSearchInsertPositionCase4() {
        Assert.assertEquals(4, s.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    public void testSearchInsertPositionCase5() {
        Assert.assertEquals(3, s.searchInsert(new int[]{1, 3, 5, 6}, 6));
    }

    @Test
    public void testSearchInsertPositionCase6() {
        Assert.assertEquals(0, s.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
