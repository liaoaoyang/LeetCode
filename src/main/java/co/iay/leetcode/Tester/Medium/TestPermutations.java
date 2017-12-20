package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.Permutations;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPermutations {
    private Permutations p = new Permutations();

    @Test
    public void testPermutationsCase1() {
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(1, 2, 3));
        expect.add(Arrays.asList(1, 3, 2));
        expect.add(Arrays.asList(2, 1, 3));
        expect.add(Arrays.asList(2, 3, 1));
        expect.add(Arrays.asList(3, 1, 2));
        expect.add(Arrays.asList(3, 2, 1));
        Assert.assertEquals(expect, p.permute(new int[]{1, 2, 3}));
    }
}
