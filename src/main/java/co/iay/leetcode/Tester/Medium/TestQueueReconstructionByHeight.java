package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.QueueReconstructionByHeight;
import org.junit.Assert;
import org.junit.Test;

public class TestQueueReconstructionByHeight {
    private QueueReconstructionByHeight q = new QueueReconstructionByHeight();

    @Test
    public void testQueueReconstructionByHeightCase1() {
        Assert.assertArrayEquals(
                new int[][]{
                        {5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}
                },
                q.reconstructQueue(new int[][]{
                        {7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}
                })
        );
    }
}
