package co.iay.leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ng on 2017/5/15.
 * 575. Distribute Candies
 * https://leetcode.com/problems/distribute-candies/
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int c : candies) {
            map.put(c, 0);
        }

        return map.size() > candies.length / 2 ? candies.length / 2 : map.size();
    }
}
