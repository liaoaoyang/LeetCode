package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.KthSmallestElementInASortedMatrix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/1/31.
 */
public class TestKthSmallestElementInASortedMatrix {
    KthSmallestElementInASortedMatrix k = new KthSmallestElementInASortedMatrix();

    @Test
    public void testKthSmallestElementInASortedMatrixCase1() {
        int[][] arr = new int[][]{
                {1, 2},
                {3, 3},
        };

        Assert.assertEquals(2, k.kthSmallest(arr, 2));
    }

    @Test
    public void testKthSmallestElementInASortedMatrixCase2() {
        int[][] arr = new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15},
        };

        Assert.assertEquals(13, k.kthSmallest(arr, 8));
    }

    @Test
    public void testKthSmallestElementInASortedMatrixCase3() {
        int[][] arr = new int[][]{
                {1, 2},
                {1, 3},
        };

        Assert.assertEquals(1, k.kthSmallest(arr, 2));
    }
}
