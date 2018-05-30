package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MagicSquaresInGrid;
import org.junit.Assert;
import org.junit.Test;

public class TestMagicSquaresInGrid {
    private MagicSquaresInGrid m = new MagicSquaresInGrid();

    @Test
    public void testMagicSquaresInGridCase1() {
        Assert.assertEquals(1, m.numMagicSquaresInside(new int[][]{
                {4, 3, 8, 4},
                {9, 5, 1, 9},
                {2, 7, 6, 2}
        }));
    }

    @Test
    public void testMagicSquaresInGridCase2() {
        Assert.assertEquals(0, m.numMagicSquaresInside(new int[][]{
                {1, 8, 6},
                {10, 5, 0},
                {4, 2, 9}
        }));
    }

    @Test
    public void testMagicSquaresInGridCase3() {
        Assert.assertEquals(0, m.numMagicSquaresInside(new int[][]{
                {4, 1, 1, 8, 8, 0, 7},
                {3, 9, 0, 1, 8, 6, 6},
                {4, 2, 5, 8, 4, 3, 2},
                {6, 4, 10, 0, 5, 10, 4},
                {5, 3, 1, 7, 6, 2, 2},
                {7, 6, 7, 6, 1, 8, 10},
                {6, 8, 8, 4, 8, 4, 3}
        }));
    }
}
