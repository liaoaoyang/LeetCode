package co.iay.leetcode.DataStructures;

/**
 * Created by ng on 2017/7/7.
 */
public class Interval {
    public int start;
    public int end;

    public Interval() {
        start = 0;
        end = 0;
    }

    public Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public boolean equals(Object obj) {
        Interval i = (Interval) obj;

        return 0 == i.start - this.start + i.end - this.end;
    }
}
