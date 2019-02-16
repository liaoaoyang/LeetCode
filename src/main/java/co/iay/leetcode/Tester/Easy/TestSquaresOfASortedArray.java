package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SquaresOfASortedArray;
import org.junit.Assert;
import org.junit.Test;

public class TestSquaresOfASortedArray {
    private SquaresOfASortedArray s = new SquaresOfASortedArray();

    @Test
    public void testSquaresOfASortedArrayCase1() {
        Assert.assertArrayEquals(
                new int[]{0, 1, 9, 16, 100},
                s.sortedSquares(new int[]{-4, -1, 0, 3, 10})
        );
    }

    @Test
    public void testSquaresOfASortedArrayCase2() {
        Assert.assertArrayEquals(
                new int[]{4, 9, 9, 49, 121},
                s.sortedSquares(new int[]{-7, -3, 2, 3, 11})
        );
    }
}
