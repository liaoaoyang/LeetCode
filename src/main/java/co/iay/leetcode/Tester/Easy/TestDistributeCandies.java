package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.DistributeCandies;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/5/15.
 */
public class TestDistributeCandies {
    private DistributeCandies d = new DistributeCandies();

    @Test
    public void testDistributeCandiesCase1() {
        Assert.assertEquals(3, d.distributeCandies(new int[] {1, 1, 2, 2, 3, 3}));
    }

    @Test
    public void testDistributeCandiesCase2() {
        Assert.assertEquals(2, d.distributeCandies(new int[] {1, 1, 2, 3}));
    }

    @Test
    public void testDistributeCandiesCase3() {
        Assert.assertEquals(1, d.distributeCandies(new int[] {1, 1, 1, 1}));
    }
}
