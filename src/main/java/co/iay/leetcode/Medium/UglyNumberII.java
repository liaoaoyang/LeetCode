package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * 264. Ugly Number II
 * Write a program to find the n-th ugly number.
 *
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 *
 * Note that 1 is typically treated as an ugly number, and n does not exceed 1690.
 *
 * Notes:
 * solution 1:
 * 逐步推算出符合规定的数字并加入 list 中，每次倍乘之后都删除当前的数字，重复计算至第n次
 * 这个解法效率很低
 *
 * DP:
 * ii ij ik 分别是需要尝试乘以 2 3 5 的dp数组下标值
 * 每当算出当前的最小值之后，下标值向前推进
 * dp[i] = min(dp[ii] * 2, min(dp[ij] * 3, dp[ik] * 5))
 */

public class UglyNumberII {
    private int dpSolution(int n) {
        long[] dp = new long[n + 1];
        int[] idx = new int[] {0, 0, 1, 1, 0, 1};
        dp[0] = 0;
        HashSet<Long> ugss = new HashSet<Long>();

        for (int i = 1; i < dp.length; ++i) {
            if(i == 1) {
                dp[i] = 1;
                ugss.add(1L);
                continue;
            }

            long dpX2 = dp[idx[2]] * 2;
            long dpX3 = dp[idx[3]] * 3;
            long dpX5 = dp[idx[5]] * 5;

            while (true) {
                if (!(ugss.contains(dpX2) || ugss.contains(dpX3) || ugss.contains(dpX5))) {
                    break;
                }

                if (ugss.contains(dpX2)) {
                    ++idx[2];
                    dpX2 = dp[idx[2]] * 2;
                }

                if (ugss.contains(dpX3)) {
                    ++idx[3];
                    dpX3 = dp[idx[3]] * 3;
                }

                if (ugss.contains(dpX5)) {
                    ++idx[5];
                    dpX5 = dp[idx[5]] * 5;
                }
            }

            dp[i] = Math.min(dpX2, Math.min(dpX3, dpX5));
            ugss.add(dp[i]);

            if (dp[i] == dpX2) {
                ++idx[2];
            } else if (dp[i] == dpX3) {
                ++idx[3];
            } else {
                ++idx[5];
            }
        }

        return (int)dp[n];
    }

    private int solution1(int n) {
        int handled = 1;
        ArrayList<Integer> ugs = new ArrayList<Integer>();
        HashSet<Integer> ugss = new HashSet<Integer>();
        ugs.add(1);
        int[] muls = new int[]{2, 3, 5};

        while (handled < n) {
            Collections.sort(ugs);
            int now = ugs.get(0);

            for (int mul : muls) {
                long mulXNow = (long)mul * now;

                if (mulXNow > Integer.MAX_VALUE || ugss.contains(mul * now)) {
                    continue;
                }

                ugs.add(mul * now);
                ugss.add(mul * now);
            }

            ++handled;
            ugs.remove(0);
        }

        return ugs.get(0);
    }

    public int nthUglyNumber(int n) {
        return dpSolution(n);
    }
}
