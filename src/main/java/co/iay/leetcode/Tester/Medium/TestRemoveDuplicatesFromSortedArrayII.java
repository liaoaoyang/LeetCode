package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.RemoveDuplicatesFromSortedArrayII;
import org.junit.Assert;
import org.junit.Test;

public class TestRemoveDuplicatesFromSortedArrayII {
    private RemoveDuplicatesFromSortedArrayII r = new RemoveDuplicatesFromSortedArrayII();

    @Test
    public void testRemoveDuplicatesFromSortedArrayIICase1() {
        int[] input = new int[]{1, 1, 1, 2, 2, 3};

        Assert.assertEquals(5, r.removeDuplicates(input));
        Assert.assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, input);
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayIICase2() {
        int[] input = new int[]{1, 1, 1, 2, 2, 3, 3, 3};
        Assert.assertEquals(6, r.removeDuplicates(input));
        Assert.assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 3, 3}, input);
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayIICase3() {
        int[] input = new int[]{1, 1};
        Assert.assertEquals(2, r.removeDuplicates(input));
        Assert.assertArrayEquals(new int[]{1, 1}, input);
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayIICase5() {
        int[] input = new int[]{1, 1, 1, 1, 3, 3};
        Assert.assertEquals(4, r.removeDuplicates(input));
        Assert.assertArrayEquals(new int[]{1, 1, 3, 3, 3, 3}, input);
    }
}
