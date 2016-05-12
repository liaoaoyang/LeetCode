package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/5/12.
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(1, 1);
        m.put(1<<2, 1);
        m.put(1<<4, 1);
        m.put(1<<6, 1);
        m.put(1<<8, 1);
        m.put(1<<10, 1);
        m.put(1<<12, 1);
        m.put(1<<14, 1);
        m.put(1<<16, 1);
        m.put(1<<18, 1);
        m.put(1<<20, 1);
        m.put(1<<22, 1);
        m.put(1<<24, 1);
        m.put(1<<26, 1);
        m.put(1<<28, 1);
        m.put(1<<30, 1);

        return m.containsKey(num);
    }
}
