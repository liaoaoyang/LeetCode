package co.iay.leetcode.Medium;

import java.util.Stack;

/**
 * 739. Daily Temperatures
 * https://leetcode.com/problems/daily-temperatures/
 * Given a list of daily temperatures T,
 * return a list such that, for each day in the input,
 * tells you how many days you would have to wait until a warmer temperature.
 * If there is no future day for which this is possible, put 0 instead.
 * <p>
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
 * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 * <p>
 * Note: The length of temperatures will be in the range [1, 30000].
 * Each temperature will be an integer in the range [30, 100].
 * Solution:
 * 对于升序的情况，自然下一个就是比上一个温度高的情况。
 * 对于出现降序的情况，记录当前的下标和温度。
 * 当重新出现升序趋势时，可以从逐个比较现有的
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        Stack<int[]> s = new Stack<>();
        int[] result = new int[T.length];

        for (int i = 0; i < T.length - 1; ++i) {
            if (T[i + 1] > T[i]) {
                result[i] = 1;

                while (!s.isEmpty() && s.peek()[0] < T[i + 1]) {
                    result[s.peek()[1]] = i - s.peek()[1] + 1;
                    s.pop();
                }
            } else {
                s.push(new int[]{T[i], i});
            }
        }

        return result;
    }
}
