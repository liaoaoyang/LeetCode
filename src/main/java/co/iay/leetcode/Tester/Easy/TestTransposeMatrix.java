package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.TransposeMatrix;
import org.junit.Assert;
import org.junit.Test;

public class TestTransposeMatrix {
    private TransposeMatrix t = new TransposeMatrix();

    @Test
    public void testTransposeMatrixCase1() {
        Assert.assertArrayEquals(
                new int[][]{
                        {1, 4}, {2, 5}, {3, 6}
                },
                t.transpose(new int[][]{
                        {1, 2, 3}, {4, 5, 6}
                })
        );
    }
}
