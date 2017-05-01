package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.TopKFrequentElements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ng on 17/5/1.
 */
public class TestTopKFrequentElements {
    private TopKFrequentElements t = new TopKFrequentElements();

    @Test
    public void testTopKFrequentElementsCase1() {
        Assert.assertEquals(Arrays.asList(new Integer[] {1, 2}),
                t.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    public void testTopKFrequentElementsCase2() {
        Assert.assertEquals(Arrays.asList(new Integer[] {-1, 2}),
                t.topKFrequent(new int[] {4, 1, -1, 2, -1, 2, 3}, 2));
    }
}
