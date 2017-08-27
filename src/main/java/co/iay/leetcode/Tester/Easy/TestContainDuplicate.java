package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ContainsDuplicate;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/25.
 */
public class TestContainDuplicate {
    private ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void testContainDuplicateCase1() {
        int[] a = new int[]{1};
        Assert.assertEquals(false, containsDuplicate.containsDuplicate(a));
    }

    @Test
    public void testContainDuplicateCase2() {
        int[] a = new int[]{1, 1};
        Assert.assertEquals(true, containsDuplicate.containsDuplicate(a));
    }

    @Test
    public void testContainDuplicateCase3() {
        int[] a = new int[]{1, 2, 1};
        Assert.assertEquals(true, containsDuplicate.containsDuplicate(a));
    }

    @Test
    public void testContainDuplicateCase4() {
        int[] a = new int[]{1, 2, 3};
        Assert.assertEquals(false, containsDuplicate.containsDuplicate(a));
    }
}
