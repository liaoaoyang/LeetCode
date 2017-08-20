package co.iay.leetcode.Medium;

/**
 * 75. Sort Colors
 * https://leetcode.com/problems/sort-colors/
 */
public class SortColors {
    final static public int COLOR_RED   = 0;
    final static public int COLOR_WHITE = 1;
    final static public int COLOR_BLUE  = 2;

    public void sortColors(int[] nums) {
        int[] colors = new int[] {COLOR_RED, COLOR_WHITE, COLOR_BLUE};
        int[] result = new int[nums.length];
        int index = 0;

        for (int color : colors) {
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == color) {
                    result[index] = color;
                    ++index;
                }
            }
        }

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = result[i];
        }
    }
}
