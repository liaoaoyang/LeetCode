package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ng on 16/11/5.
 */
public class BinaryWatch {
    private static int[] HOURS = new int[]{1, 2, 4, 8};
    private static int[] MINUTES = new int[]{1, 2, 4, 8, 16, 32};

    private static void pickTime(int num, int[] groups, int start, Map<String, Boolean> result, int timeSum, int maxTimeSum, String timeFmt) {
        if (num == 0) {
            if (timeSum <= maxTimeSum) {
                result.put(String.format(timeFmt, timeSum), true);
            }

            return;
        }

        for (int i = start; i < groups.length; ++i) {
            timeSum += groups[i];
            pickTime(num - 1, groups, i + 1, result, timeSum, maxTimeSum, timeFmt);
            timeSum -= groups[i];
        }
    }

    public List<String> readBinaryWatch(int num) {
        List<String> r = new ArrayList<String>();

        for (int hourNum = 0; hourNum <= 4 && hourNum <= num; ++hourNum) {
            int minuteNum = num - hourNum;
            Map<String, Boolean> hours = new HashMap<String, Boolean>();
            pickTime(hourNum, HOURS, 0, hours, 0, 11, "%d");
            Map<String, Boolean> minutes = new HashMap<String, Boolean>();
            pickTime(minuteNum, MINUTES, 0, minutes, 0, 59, "%02d");

            for (Map.Entry<String, Boolean> h : hours.entrySet()) {
                for (Map.Entry<String, Boolean> m : minutes.entrySet()) {
                    r.add(h.getKey() + ":" + m.getKey());
                }
            }
        }

        return r;
    }
}
