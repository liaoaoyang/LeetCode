package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.CombinationSumIII;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ng on 17/3/20.
 */
public class TestCombinationsIII {
    private CombinationSumIII c = new CombinationSumIII();

    @Test
    public void testCombinationsCase1() {
        List<List<Integer>> cmp = new ArrayList<List<Integer>>();
        cmp.add(Arrays.asList(1, 2, 4));

        Assert.assertEquals(cmp, c.combinationSum3(3, 7));

    }

    @Test
    public void testCombinationsCase2() {
        List<List<Integer>> cmp = new ArrayList<List<Integer>>();
        cmp.add(Arrays.asList(1, 2, 6));
        cmp.add(Arrays.asList(1, 3, 5));
        cmp.add(Arrays.asList(2, 3, 4));

        Assert.assertEquals(cmp, c.combinationSum3(3, 9));

    }

    @Test
    public void testCombinationsCase3() {
        List<List<Integer>> cmp = new ArrayList<List<Integer>>();
        Assert.assertEquals(cmp, c.combinationSum3(2, 18));
    }
}
