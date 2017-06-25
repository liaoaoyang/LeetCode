package co.iay.leetcode.Easy;

import java.util.List;

/**
 * Created by ng on 2017/6/24.
 * 624. Maximum Distance in Arrays
 * https://leetcode.com/problems/maximum-distance-in-arrays
 */
public class MaximumDistanceInArrays {
    public int maxDistance(List<List<Integer>> arrays) {
        int result = 0;
        List<Integer> array0 = arrays.get(0);
        int minVal = array0.get(0);
        int maxVal = array0.get(array0.size() - 1);

        for (int i = 1; i < arrays.size(); ++i) {
            List<Integer> array = arrays.get(i);
            result = Math.max(result, Math.abs(maxVal - array.get(0)));
            result = Math.max(result, Math.abs(array.get(array.size() - 1) - minVal));
            minVal = Math.min(minVal, array.get(0));
            maxVal = Math.max(maxVal, array.get(array.size() - 1));
        }

        return result;
    }
}
