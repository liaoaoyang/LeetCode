package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/3/20.
 * 77. Combinations
 * https://leetcode.com/problems/combinations
 */
public class Combinations {
    private static void getCombinations(List<List<Integer>> result, int n, int k, int s, int kk, Integer[] r) {
        for (int i = s; i <= n - kk + 1; ++i) {
            r[k - kk] = i;

            if (kk == 1) {
                List<Integer> tr = new ArrayList<Integer>(r.length);

                for (int j = 0; j < r.length; ++j) {
                    tr.add(r[j]);
                }

                result.add(tr);
                continue;
            }

            getCombinations(result, n, k, i + 1, kk - 1, r);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getCombinations(result, n, k, 1, k, new Integer[k]);

        /*
        for (int jj = 0; jj < result.size(); ++jj) {
            System.out.print("cmp.add(Arrays.asList(");

            for(int j = 0; j < result.get(jj).size(); ++j) {
                System.out.printf("%s", result.get(jj).get(j));

                if (j < result.get(jj).size() - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("));");
        }
        */

        return result;
    }
}
