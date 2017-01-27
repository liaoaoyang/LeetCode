package co.iay.leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ng on 17/1/4.
 */
public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;

        for (int i = 0; i < points.length; ++i) {
            int x = points[i][0];
            int y = points[i][1];

            HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

            for (int j = 0; j < points.length; ++j) {
                if (i == j) {
                    continue;
                }

                int x1 = points[j][0];
                int y1 = points[j][1];

                int distance = (x - x1) * (x - x1) + (y - y1) * (y - y1);

                if (m.containsKey(distance)) {
                    m.put(distance, m.get(distance) + 1);
                } else {
                    m.put(distance, 1);
                }
            }

            for(Map.Entry<Integer, Integer> entry : m.entrySet()){
                int val = entry.getValue();
                result += (val * (val - 1));
            }
        }

        return result;
    }
}
