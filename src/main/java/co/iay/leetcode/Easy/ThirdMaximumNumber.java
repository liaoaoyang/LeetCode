package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/11/7.
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long max1 = (long)Integer.MIN_VALUE - 1;
        long max2 = (long)Integer.MIN_VALUE - 1;
        long max3 = (long)Integer.MIN_VALUE - 1;

        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if (max2 < n && n < max1) {
                max3 = max2;
                max2 = n;
            }
            else if (max3 < n && n < max2) {
                max3 = n;
            }
        }

        return (int)(max3 != ((long)Integer.MIN_VALUE - 1) ? max3 : max1);
    }
}
