package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.HammingDistance;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/12/23.
 */
public class TestHammingDistance {
    private HammingDistance hammingDistance = new HammingDistance();

    @Test
    public void testHammingDistanceCase1() {
        Assert.assertEquals(2, hammingDistance.hammingDistance(1, 4));
    }
}
