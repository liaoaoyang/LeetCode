package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.IslandPerimeter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/1/28.
 */
public class TestIslandPerimeter {
    private IslandPerimeter i = new IslandPerimeter();

    @Test
    public void testIslandPerimeterCase1() {
        int m[][] = new int[][] {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        Assert.assertEquals(16, i.islandPerimeter(m));
    }
}
