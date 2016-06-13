package co.iay.leetcode.Easy;

import co.iay.leetcode.ParentsClasses.VersionControl;

/**
 * Created by ng on 16/6/13.
 */
public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int nowVersion = (int)(((long)start + (long)end) / 2);

            if (this.isBadVersion(nowVersion)) {
                end = nowVersion;
            } else {
                if (start == nowVersion) {
                    return start + 1;
                }

                start = nowVersion;
            }
        }

        return start;
    }
}
