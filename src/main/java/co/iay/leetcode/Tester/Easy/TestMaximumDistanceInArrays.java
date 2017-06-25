package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MaximumDistanceInArrays;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ng on 2017/6/24.
 */
public class TestMaximumDistanceInArrays {
    private MaximumDistanceInArrays m = new MaximumDistanceInArrays();

    @Test
    public void testMaximumDistanceInArraysCase1() {
        List<List<Integer>> input = new ArrayList<List<Integer>>();
        input.add(Arrays.asList(1, 2, 3));
        input.add(Arrays.asList(4, 5));
        input.add(Arrays.asList(1, 2, 3));


        Assert.assertEquals(4, m.maxDistance(input));
    }

    @Test
    public void testMaximumDistanceInArraysCase2() {
        List<List<Integer>> input = new ArrayList<List<Integer>>();
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(4, 5));


        Assert.assertEquals(4, m.maxDistance(input));
    }

    @Test
    public void testMaximumDistanceInArraysCase3() {
        List<List<Integer>> input = new ArrayList<List<Integer>>();
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(0, 8));


        Assert.assertEquals(6, m.maxDistance(input));
    }
}
