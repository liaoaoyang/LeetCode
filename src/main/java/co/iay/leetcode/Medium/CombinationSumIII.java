package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/3/30.
 * 216. Combination Sum III
 * https://leetcode.com/problems/combination-sum-iii
 */
public class CombinationSumIII {
    private static void getCombinations(List<List<Integer>> result, int target, int left, int n, int k, int s, int kk, Integer[] r) {
        for (int i = s; i <= 9 && i <= left && i <= n - kk + 1; ++i) {
            r[k - kk] = i;

            if (kk == 1) {
                List<Integer> tr = new ArrayList<Integer>(r.length);
                int sum = 0;

                for (int j = 0; j < r.length; ++j) {
                    tr.add(r[j]);
                    sum += r[j];
                }

                if (sum != target) {
                    continue;
                }

                result.add(tr);
                continue;
            }

            getCombinations(result, target, left - i, n, k, i + 1, kk - 1, r);
        }
    }


    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getCombinations(result, n, n, n, k, 1, k, new Integer[k]);

        return result;
    }
}
