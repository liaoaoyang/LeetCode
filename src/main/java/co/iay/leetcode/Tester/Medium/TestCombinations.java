package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.Combinations;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ng on 17/3/20.
 */
public class TestCombinations {
    private Combinations c = new Combinations();

    @Test
    public void testCombinationsCase1() {
        List<List<Integer>> cmp = new ArrayList<List<Integer>>();
        cmp.add(Arrays.asList(1, 2));
        cmp.add(Arrays.asList(1, 3));
        cmp.add(Arrays.asList(1, 4));
        cmp.add(Arrays.asList(2, 3));
        cmp.add(Arrays.asList(2, 4));
        cmp.add(Arrays.asList(3, 4));

        Assert.assertEquals(cmp, c.combine(4, 2));

    }

    @Test
    public void testCombinationsCase2() {
        List<List<Integer>> cmp = new ArrayList<List<Integer>>();
        cmp.add(Arrays.asList(1, 2));
        cmp.add(Arrays.asList(1, 3));
        cmp.add(Arrays.asList(1, 4));
        cmp.add(Arrays.asList(1, 5));
        cmp.add(Arrays.asList(2, 3));
        cmp.add(Arrays.asList(2, 4));
        cmp.add(Arrays.asList(2, 5));
        cmp.add(Arrays.asList(3, 4));
        cmp.add(Arrays.asList(3, 5));
        cmp.add(Arrays.asList(4, 5));

        Assert.assertEquals(cmp, c.combine(5, 2));

    }

    @Test
    public void testCombinationsCase3() {
        List<List<Integer>> cmp = new ArrayList<List<Integer>>();
        cmp.add(Arrays.asList(1, 2, 3, 4));
        cmp.add(Arrays.asList(1, 2, 3, 5));
        cmp.add(Arrays.asList(1, 2, 4, 5));
        cmp.add(Arrays.asList(1, 3, 4, 5));
        cmp.add(Arrays.asList(2, 3, 4, 5));

        Assert.assertEquals(cmp, c.combine(5, 4));
    }

    @Test
    public void testCombinationsCase4() {
        List<List<Integer>> cmp = new ArrayList<List<Integer>>();
        cmp.add(Arrays.asList(1));

        Assert.assertEquals(cmp, c.combine(1, 1));
    }
}
