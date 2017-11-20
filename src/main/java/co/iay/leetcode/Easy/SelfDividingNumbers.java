package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 * <p>
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = left; i <= right; ++i) {
            char[] s = (i + "").toCharArray();
            boolean match = true;

            for (char sj : s) {
                if (sj - '0' == 0 || i % (sj - '0') != 0) {
                    match = false;
                    break;
                }
            }

            if (match) {
                result.add(i);
            }
        }

        return result;
    }
}
