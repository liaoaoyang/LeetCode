package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ng on 16/12/27.
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> r = new ArrayList<Integer>();

        for (int i = 1; i <= nums.length; ++i) {
            r.add(i);
        }

        for (int i : nums) {
            r.set(i - 1, 0);
        }

        Iterator<Integer> it = r.iterator();

        while (it.hasNext()) {
            Integer v = it.next();

            if (v == 0) {
                it.remove();
            }
        }

        return r;
    }
}
