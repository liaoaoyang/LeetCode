package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.SortColors;
import org.junit.Assert;
import org.junit.Test;

public class TestSortColors {
    private SortColors t = new SortColors();

    @Test
    public void testSortColorsCase1() {
        int[] result = new int[]{};
        int[] array = new int[]{};
        t.sortColors(array);
        Assert.assertArrayEquals(result, array);
    }

    @Test
    public void testSortColorsCase2() {
        int[] result = new int[]{SortColors.COLOR_RED};
        int[] array = new int[]{SortColors.COLOR_RED};
        t.sortColors(array);
        Assert.assertArrayEquals(result, array);
    }

    @Test
    public void testSortColorsCase3() {
        int[] result = new int[]{
                SortColors.COLOR_RED,
                SortColors.COLOR_RED,
                SortColors.COLOR_WHITE,
                SortColors.COLOR_WHITE,
                SortColors.COLOR_BLUE,
                SortColors.COLOR_BLUE
        };
        int[] array = new int[]{
                SortColors.COLOR_WHITE,
                SortColors.COLOR_RED,
                SortColors.COLOR_BLUE,
                SortColors.COLOR_RED,
                SortColors.COLOR_WHITE,
                SortColors.COLOR_BLUE
        };
        t.sortColors(array);
        Assert.assertArrayEquals(result, array);
    }
}
