package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.Subsets;
import co.iay.leetcode.Tester.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSubsets {
    private Subsets s = new Subsets();

    @Test
    public void testSubsetsCase1() {
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(new ArrayList<>());
        expect.add(Arrays.asList(1));
        expect.add(Arrays.asList(2));
        expect.add(Arrays.asList(3));
        expect.add(Arrays.asList(1, 2));
        expect.add(Arrays.asList(1, 3));
        expect.add(Arrays.asList(2, 3));
        expect.add(Arrays.asList(1, 2, 3));
        Collections.sort(expect, Solution.comparator);
        List<List<Integer>> result = s.subsets(new int[]{1, 2, 3});
        Collections.sort(result, Solution.comparator);

        Assert.assertEquals(expect, result);
    }
}
