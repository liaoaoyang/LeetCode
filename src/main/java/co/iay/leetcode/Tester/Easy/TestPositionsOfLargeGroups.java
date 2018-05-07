package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.PositionsOfLargeGroups;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPositionsOfLargeGroups {
    private PositionsOfLargeGroups p = new PositionsOfLargeGroups();

    @Test
    public void testPositionsOfLargeGroupsCase1() {
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(3, 6));
        Assert.assertEquals(expect, p.largeGroupPositions("abbxxxxzzy"));
    }

    @Test
    public void testPositionsOfLargeGroupsCase2() {
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(3, 6));
        expect.add(Arrays.asList(9, 11));
        Assert.assertEquals(expect, p.largeGroupPositions("abbxxxxzzyyy"));
    }

    @Test
    public void testPositionsOfLargeGroupsCase3() {
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(3, 5));
        expect.add(Arrays.asList(6, 9));
        expect.add(Arrays.asList(12, 14));
        Assert.assertEquals(expect, p.largeGroupPositions("abcdddeeeeaabbbcd"));
    }
}
