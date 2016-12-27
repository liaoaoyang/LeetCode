package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FindAllNumbersDisappearedInAnArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ng on 16/12/27.
 */
public class TestFindAllNumbersDisappearedInAnArray {
    private FindAllNumbersDisappearedInAnArray m = new FindAllNumbersDisappearedInAnArray();

    @Test
    public void testFindAllNumbersDisappearedInAnArrayCase1() {
        int[] values = {4, 3, 2, 7, 8, 2, 3, 1};
        Integer[] cmpValues = {5, 6};
        List<Integer> cmp = new ArrayList<Integer>(Arrays.asList(cmpValues));
        Assert.assertEquals(cmp, m.findDisappearedNumbers(values));
    }

    @Test
    public void testFindAllNumbersDisappearedInAnArrayCase2() {
        int[] values = {1, 2, 3};
        Integer[] cmpValues = {};
        List<Integer> cmp = new ArrayList<Integer>(Arrays.asList(cmpValues));
        Assert.assertEquals(cmp, m.findDisappearedNumbers(values));
    }
}
