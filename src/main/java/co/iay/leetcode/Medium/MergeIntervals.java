package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ng on 2017/7/7.
 * 56. Merge Intervals
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Interval i1 = (Interval) o1;
                Interval i2 = (Interval) o2;

                if (i1.start == i2.start) {
                    return i1.end - i2.end;
                }

                return i1.start - i2.start;
            }
        };

        if (intervals.size() <= 1) {
            return intervals;
        }

        Collections.sort(intervals, comparator);

        List<Interval> result = new ArrayList<Interval>();
        result.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); ++i) {
            Interval lastOfResult = result.get(result.size() - 1);
            Interval nowInIntervals = intervals.get(i);

            if (lastOfResult.end >= nowInIntervals.start) {
                lastOfResult.end = Math.max(lastOfResult.end, nowInIntervals.end);
            } else {
                result.add(nowInIntervals);
            }
        }

        return result;
    }
}
