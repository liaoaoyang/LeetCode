package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.Interval;
import co.iay.leetcode.Medium.MergeIntervals;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ng on 2017/7/7.
 */
public class TestMergeIntervals {
    private MergeIntervals m = new MergeIntervals();

    @Test
    public void testMergeIntervalsCase1() {
        Assert.assertEquals(Arrays.asList(new Interval[]{
                        new Interval(1, 6),
                        new Interval(8, 10),
                        new Interval(15, 18)}),
                m.merge(Arrays.asList(new Interval(1, 3),
                        new Interval(2, 6),
                        new Interval(8, 10),
                        new Interval(15, 18))));
    }
}
