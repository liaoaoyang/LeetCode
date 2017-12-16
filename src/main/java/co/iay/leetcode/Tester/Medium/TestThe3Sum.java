package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.The3Sum;
import co.iay.leetcode.Tester.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestThe3Sum {
    private The3Sum t = new The3Sum();

    @Test
    public void testThe3SumCase1() {
        List<List<Integer>> result = t.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(-1, 0, 1));
        expect.add(Arrays.asList(-1, -1, 2));
        Collections.sort(result, Solution.comparator);
        Collections.sort(expect, Solution.comparator);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testThe3SumCase2() {
        List<List<Integer>> result = t.threeSum(new int[]{0, 0, 0});
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(0, 0, 0));
        Collections.sort(result, Solution.comparator);
        Collections.sort(expect, Solution.comparator);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testThe3SumCase3() {
        List<List<Integer>> result = t.threeSum(new int[]{0, 0, 0, 0});
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(0, 0, 0));
        Collections.sort(result, Solution.comparator);
        Collections.sort(expect, Solution.comparator);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testThe3SumCase4() {
        List<List<Integer>> result = t.threeSum(new int[]{-2, 0, 1, 1, 2});
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(-2, 0, 2));
        expect.add(Arrays.asList(-2, 1, 1));
        Collections.sort(result, Solution.comparator);
        Collections.sort(expect, Solution.comparator);
        Assert.assertEquals(expect, result);
    }
}
