package co.iay.leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ng on 16/7/3.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }

        Set<Integer> m = new HashSet<Integer>();

        while (!m.contains(n)) {
            m.add(n);
            int result = 0;

            while (n >= 1) {
                result += (n % 10) * (n % 10);
                n /= 10;
            }

            n = result;
        }

        return n == 1;
    }
}
