package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Medium.PathSumII;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestPathSumII {
    private PathSumII p = new PathSumII();

    private Comparator<List<Integer>> cmp = new Comparator<List<Integer>>() {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            if (o1.size() == o2.size()) {
                if (o1.size() == 0) {
                    return 0;
                }

                return o1.get(0) > o2.get(0) ? 1 : -1;
            }

            return o1.size() > o2.size() ? 1 : -1;
        }
    };

    @Test
    public void testPathSumIICase1() {
        TreeNode t = TreeNode.buildTree(new Integer[]{
                5,
                4, 8,
                11, null, 13, 4,
                7, 2, null, null, null, null, 5, 1});
        List<List<Integer>> result = p.pathSum(t, 22);
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(5, 4, 11, 2));
        expect.add(Arrays.asList(5, 8, 4, 5));
        Collections.sort(result, cmp);
        Collections.sort(expect, cmp);

        Assert.assertEquals(expect, result);
    }

    @Test
    public void testPathSumIICase2() {
        TreeNode t = TreeNode.buildTree(new Integer[]{
                -2,
                null, -3});
        List<List<Integer>> result = p.pathSum(t, -5);
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(-2, -3));
        Collections.sort(result, cmp);
        Collections.sort(expect, cmp);

        Assert.assertEquals(expect, result);
    }

    @Test
    public void testPathSumIICase3() {
        TreeNode t = TreeNode.buildTree(new Integer[]{
                -2,
                2, -3});
        List<List<Integer>> result = p.pathSum(t, 0);
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(-2, 2));
        Collections.sort(result, cmp);
        Collections.sort(expect, cmp);

        Assert.assertEquals(expect, result);
    }
}
