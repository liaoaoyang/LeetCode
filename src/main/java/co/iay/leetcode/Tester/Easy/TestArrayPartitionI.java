package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ArrayPartitionI;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/4/28.
 */
public class TestArrayPartitionI {
    private ArrayPartitionI a = new ArrayPartitionI();

    @Test
    public void testArrayPartitionICase1() {
        Assert.assertEquals(4, a.arrayPairSum(new int[] {1, 4, 3, 2}));
    }
}
