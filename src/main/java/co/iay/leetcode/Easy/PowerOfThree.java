package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/5/8.
 * https://leetcode.com/problems/power-of-three/
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(1, 1);
        m.put(3, 1);
        m.put(9, 1);
        m.put(27, 1);
        m.put(81, 1);
        m.put(243, 1);
        m.put(729, 1);
        m.put(2187, 1);
        m.put(6561, 1);
        m.put(19683, 1);
        m.put(59049, 1);
        m.put(177147, 1);
        m.put(531441, 1);
        m.put(1594323, 1);
        m.put(4782969, 1);
        m.put(14348907, 1);
        m.put(43046721, 1);
        m.put(129140163, 1);
        m.put(387420489, 1);
        m.put(1162261467, 1);

        return m.containsKey(n);
    }
}
