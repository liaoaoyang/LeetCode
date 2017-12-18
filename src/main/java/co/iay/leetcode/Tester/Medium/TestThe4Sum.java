package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.The4Sum;
import co.iay.leetcode.Tester.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestThe4Sum {
    private The4Sum t = new The4Sum();

    @Test
    public void testThe4SumCase1() {
        List<List<Integer>> result = t.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(-1, 0, 0, 1));
        expect.add(Arrays.asList(-2, -1, 1, 2));
        expect.add(Arrays.asList(-2, 0, 0, 2));
        Collections.sort(result, Solution.comparator);
        Collections.sort(expect, Solution.comparator);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testThe4SumCase2() {
        List<List<Integer>> result = t.fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0);
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(-3, -2, 2, 3));
        expect.add(Arrays.asList(-3, -1, 1, 3));
        expect.add(Arrays.asList(-3, 0, 0, 3));
        expect.add(Arrays.asList(-3, 0, 1, 2));
        expect.add(Arrays.asList(-2, -1, 0, 3));
        expect.add(Arrays.asList(-2, -1, 1, 2));
        expect.add(Arrays.asList(-2, 0, 0, 2));
        expect.add(Arrays.asList(-1, 0, 0, 1));
        Collections.sort(result, Solution.comparator);
        Collections.sort(expect, Solution.comparator);
        Assert.assertEquals(expect, result);
    }
}
