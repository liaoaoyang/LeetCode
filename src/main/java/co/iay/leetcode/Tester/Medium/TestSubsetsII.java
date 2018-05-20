package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.SubsetsII;
import co.iay.leetcode.Tester.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSubsetsII {
    private SubsetsII s = new SubsetsII();

    @Test
    public void testSubsetsIICase1() {
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(new ArrayList<>());
        expect.add(Arrays.asList(1));
        expect.add(Arrays.asList(2));
        expect.add(Arrays.asList(1, 2));
        expect.add(Arrays.asList(2, 2));
        expect.add(Arrays.asList(1, 2, 2));
        Collections.sort(expect, Solution.comparator);
        List<List<Integer>> result = s.subsetsWithDup(new int[]{1, 2, 2});
        Collections.sort(result, Solution.comparator);

        Assert.assertEquals(expect, result);
    }
}
