package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ReshapeTheMatrix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/5/3.
 */
public class TestReshapeTheMatrix {
    private ReshapeTheMatrix rtm = new ReshapeTheMatrix();

    @Test
    public void testReshapeTheMatrixCase1() {
        int[][] input = new int[][]{{1, 2}, {3, 4}};
        int[][] compare = new int[][]{{1, 2, 3, 4}};

        Assert.assertArrayEquals(compare, rtm.matrixReshape(input, 1, 4));
    }

    @Test
    public void testReshapeTheMatrixCase2() {
        int[][] input = new int[][]{{1, 2}, {3, 4}};
        int[][] compare = new int[][]{{1, 2}, {3, 4}};

        Assert.assertArrayEquals(compare, rtm.matrixReshape(input, 2, 3));
    }
}
