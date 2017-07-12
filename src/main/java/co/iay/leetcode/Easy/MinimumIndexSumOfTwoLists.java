package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ng on 2017/5/31.
 * 599. Minimum Index Sum of Two Lists
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 */
public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int mLen = list1.length < list2.length ? list1.length : list2.length;
        String[] shorter = list1.length < list2.length ? list1 : list2;
        String[] longer = list1.length < list2.length ? list2 : list1;
        HashMap<String, Integer> m = new HashMap<String, Integer>(mLen);

        for (int i = 0; i < shorter.length; ++i) {
            int pos = i + 1;
            m.put(shorter[i], -pos);
        }

        for (int i = 0; i < longer.length; ++i) {
            if (!m.containsKey(longer[i])) {
                continue;
            }

            int pos = i + 1;
            m.put(longer[i], pos - m.get(longer[i]));
        }

        ArrayList<String> r = new ArrayList<String>();
        int minDiff = Integer.MAX_VALUE;

        for (String aShorter : shorter) {
            if (m.get(aShorter) >= 0 && m.get(aShorter) < minDiff) {
                minDiff = m.get(aShorter);
            }
        }

        for (String aShorter : shorter) {
            if (m.get(aShorter) == minDiff) {
                r.add(aShorter);
            }
        }

        return r.toArray(new String[r.size()]);
    }
}
