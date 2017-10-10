package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.CombinationSumII;
import co.iay.leetcode.Tester.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCombinationSumII {
    private CombinationSumII c = new CombinationSumII();

    @Test
    public void testCombinationSumIICase1() {
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(1, 7));
        expect.add(Arrays.asList(1, 2, 5));
        expect.add(Arrays.asList(2, 6));
        expect.add(Arrays.asList(1, 1, 6));
        List<List<Integer>> result = c.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        Collections.sort(expect, Solution.comparator);
        Collections.sort(result, Solution.comparator);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testCombinationSumIICase2() {
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        List<List<Integer>> result = c.combinationSum2(new int[]{1, 1, 1}, 8);
        Collections.sort(expect, Solution.comparator);
        Collections.sort(result, Solution.comparator);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testCombinationSumIICase3() {
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(1, 1, 1, 1));
        expect.add(Arrays.asList(2, 2));
        expect.add(Arrays.asList(1, 1, 2));
        List<List<Integer>> result = c.combinationSum2(new int[]{1, 1, 1, 1, 2, 2, 2, 2}, 4);
        Collections.sort(expect, Solution.comparator);
        Collections.sort(result, Solution.comparator);
        Assert.assertEquals(expect, result);
    }
}
