package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 970. Powerful Integers
 * https://leetcode.com/problems/powerful-integers/
 * Given two non-negative integers x and y, an integer is powerful if it is equal to x^i + y^j for some integers i >= 0 and j >= 0.
 * <p>
 * Return a list of all powerful integers that have value less than or equal to bound.
 * <p>
 * You may return the answer in any order.  In your answer, each value should occur at most once.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 2, y = 3, bound = 10
 * Output: [2,3,4,5,7,9,10]
 * Explanation:
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 * Example 2:
 * <p>
 * Input: x = 3, y = 5, bound = 15
 * Output: [2,4,6,8,10,14]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= x <= 100
 * 1 <= y <= 100
 * 0 <= bound <= 10^6
 */
public class PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> resultSet = new HashSet<>();

        if (x == 1 && y == 1) {
            if (bound < 2) {
                return result;
            }

            result.add(2);

            return result;
        }

        if (x == 1 || y == 1) {
            int v = (x != 1 ? x : y);
            for (int p = 1; p + 1 <= bound; p *= v) {
                result.add(p + 1);
            }

            return result;
        }

        for (int px = 1, py = 1; px + py <= bound; px *= x) {
            for (; px + py <= bound; py *= y) {
                if (resultSet.contains(px + py)) {
                    continue;
                }

                resultSet.add(px + py);
                result.add(px + py);
            }

            py = 1;
        }

        return result;
    }
}
