package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.AllPathsFromSourceToTarget;
import co.iay.leetcode.Tester.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestAllPathsFromSourceToTarget {
    private AllPathsFromSourceToTarget a = new AllPathsFromSourceToTarget();

    @Test
    public void testAllPathsFromSourceToTargetCase1() {
        int[][] graph = new int[][]{
                {1, 2},
                {3},
                {3},
                {}
        };

        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(0, 1, 3));
        expect.add(Arrays.asList(0, 2, 3));
        List<List<Integer>> result = a.allPathsSourceTarget(graph);
        Collections.sort(expect, Solution.comparator);
        Collections.sort(result, Solution.comparator);
        Assert.assertEquals(expect, result);
    }
}
