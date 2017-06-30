package co.iay.leetcode.Easy;

import java.util.Arrays;

/**
 * Created by ng on 2017/6/30.
 * 628. Maximum Product of Three Numbers
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 */
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        long[] min2Numbers = new long[]{Long.MAX_VALUE, Long.MAX_VALUE};
        long[] max3Numbers = new long[]{Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for (int n : nums) {
            for (int j = min2Numbers.length - 1; j >= 0; --j) {
                if (min2Numbers[j] == Long.MAX_VALUE) {
                    min2Numbers[j] = n;
                    Arrays.sort(min2Numbers);
                    break;
                }

                if (min2Numbers[j] >= n) {
                    min2Numbers[j] = n;
                    Arrays.sort(min2Numbers);
                    break;
                }
            }
            for (int j = 0; j < max3Numbers.length; ++j) {
                if (max3Numbers[j] == Long.MIN_VALUE) {
                    max3Numbers[j] = n;
                    Arrays.sort(max3Numbers);
                    break;
                }

                if (max3Numbers[j] <= n) {
                    max3Numbers[j] = n;
                    Arrays.sort(max3Numbers);
                    break;
                }
            }
        }

        int a = (int) (max3Numbers[0] * max3Numbers[1] * max3Numbers[2]);
        int b = (int) (min2Numbers[0] * min2Numbers[1] * max3Numbers[0]);
        int c = (int) (min2Numbers[0] * min2Numbers[1] * max3Numbers[2]);

        return Math.max(Math.max(a, b), c);
    }
}
