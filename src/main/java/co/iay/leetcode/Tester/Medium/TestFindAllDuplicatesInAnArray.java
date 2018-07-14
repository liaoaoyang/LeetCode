package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.FindAllDuplicatesInAnArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestFindAllDuplicatesInAnArray {
    private FindAllDuplicatesInAnArray f = new FindAllDuplicatesInAnArray();

    @Test
    public void testFindAllDuplicatesInAnArrayCase1() {
        Assert.assertEquals(Arrays.asList(2, 3),
                f.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
