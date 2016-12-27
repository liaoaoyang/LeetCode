package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 16/12/27.
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] rNums = new int[nums.length];

        for (int i = 1; i <= rNums.length; ++i) {
            rNums[i - 1] = i;
        }

        for (int n: nums) {
            rNums[n - 1] = 0;
        }

        List<Integer> r = new ArrayList<Integer>();

        for (int i: rNums) {
            if (i != 0) {
                r.add(i);
            }
        }

        return r;
    }
}
