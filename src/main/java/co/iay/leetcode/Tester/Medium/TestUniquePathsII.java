package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.UniquePathsII;
import org.junit.Assert;
import org.junit.Test;

public class TestUniquePathsII {
    private UniquePathsII u = new UniquePathsII();

    @Test
    public void testUniquePathsIICase1() {
        Assert.assertEquals(2, u.uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
        }));
    }

    @Test
    public void testUniquePathsIICase2() {
        Assert.assertEquals(0, u.uniquePathsWithObstacles(new int[][]{
                {1, 0},
        }));
    }

    @Test
    public void testUniquePathsIICase3() {
        Assert.assertEquals(0, u.uniquePathsWithObstacles(new int[][]{
                {1},
                {0},
        }));
    }

    @Test
    public void testUniquePathsIICase4() {
        Assert.assertEquals(1, u.uniquePathsWithObstacles(new int[][]{
                {0},
        }));
    }

    @Test
    public void testUniquePathsIICase5() {
        Assert.assertEquals(0, u.uniquePathsWithObstacles(new int[][]{
                {0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        }));
    }


}
