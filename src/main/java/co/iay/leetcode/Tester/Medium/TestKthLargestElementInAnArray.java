package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.KthLargestElementInAnArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/5/7.
 */
public class TestKthLargestElementInAnArray {
    private KthLargestElementInAnArray k = new KthLargestElementInAnArray();

    @Test
    public void testKthLargestElementInAnArrayCase1() {
        Assert.assertEquals(1, k.findKthLargest(new int[]{2, 1}, 2));
    }
}
