package co.iay.leetcode.Easy;

/**
 * 1013. Pairs of Songs With Total Durations Divisible by 60
 * https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 * <p>
 * In a list of songs, the i-th song has a duration of time[i] seconds.
 * <p>
 * Return the number of pairs of songs for which their total duration in seconds is divisible by 60.
 * Formally, we want the number of indices i < j with (time[i] + time[j]) % 60 == 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [30,20,150,100,40]
 * Output: 3
 * Explanation: Three pairs have a total duration divisible by 60:
 * (time[0] = 30, time[2] = 150): total duration 180
 * (time[1] = 20, time[3] = 100): total duration 120
 * (time[1] = 20, time[4] = 40): total duration 60
 * Example 2:
 * <p>
 * Input: [60,60,60]
 * Output: 3
 * Explanation: All three pairs have a total duration of 120, which is divisible by 60.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= time.length <= 60000
 * 1 <= time[i] <= 500
 * Solution:
 * 需要能整除60，那么可以先记录各个数值的余数出现的次数。
 * 常规情况，只需要累加 mod[i] * mod[60 - i] > 0 的情况下的结果即可，因为二者可以两两组合。
 * 由于 1 <= time[i] <= 500，特殊情况分两种，一种是刚好是60的倍数（60/120/180/...），另外一种是30（30/90/150/...）
 * 对于这两种特殊情况，两两组合排除自身组合可以用 mod[i] * (mod[i] - 1) / 2 得到
 */
public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] mod = new int[61];

        for (int t : time) {
            mod[t % 60]++;
        }

        int result = 0;

        for (int i = 0; i <= 30; ++i) {
            if (mod[i] > 0 && (i == 0 || i == 30)) {
                result += (mod[i] * (mod[i] - 1) / 2);
                continue;
            }

            int r = mod[i] * mod[60 - i];

            if (r <= 0) {
                continue;
            }

            result += r;
        }

        return result;
    }
}
