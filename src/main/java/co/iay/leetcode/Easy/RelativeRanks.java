package co.iay.leetcode.Easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by ng on 17/2/18.
 * 506. Relative Ranks
 * https://leetcode.com/problems/relative-ranks/
 */
public class RelativeRanks {
    public static String GOLD = "Gold Medal";
    public static String SILVER = "Silver Medal";
    public static String BRONZE = "Bronze Medal";

    public String[] findRelativeRanks(int[] nums) {
        int[] n = new int[nums.length];

        for (int i = 0; i < nums.length ; ++i) {
            n[i] = nums[i];
        }

        Arrays.sort(n);

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < n.length ; ++i) {
            m.put(n[i], i);
        }

        String[] result = new String[nums.length];

        for (int i = 0; i < nums.length ; ++i) {
            int p = m.get(nums[i]);

            if (p == nums.length - 1) {
                result[i] = GOLD;
                continue;
            }

            if (p == nums.length - 2) {
                result[i] = SILVER;
                continue;
            }

            if (p == nums.length - 3) {
                result[i] = BRONZE;
                continue;
            }

            result[i] = "" + (nums.length - p);
        }

        return result;
    }
}
