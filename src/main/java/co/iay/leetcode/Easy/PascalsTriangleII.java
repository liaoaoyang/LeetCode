package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 16/6/24.
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        return this.generate(rowIndex + 1).get(rowIndex);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (numRows <= 0) {
            return result;
        }

        List<Integer> prev = null;

        for (int i = 1; i <= numRows; ++i) {
            List<Integer> now = new ArrayList<Integer>();
            now.add(1);

            if (prev == null) {
                result.add(now);
                prev = now;
                continue;
            }

            for (int j = 0; j < prev.size() - 1; ++j) {
                now.add(prev.get(j) + prev.get(j + 1));
            }

            now.add(1);
            result.add(now);
            prev = now;
        }

        return result;
    }
}
