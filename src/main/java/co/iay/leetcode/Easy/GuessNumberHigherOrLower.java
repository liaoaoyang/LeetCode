package co.iay.leetcode.Easy;

import co.iay.leetcode.ParentClasses.GuessGame;

/**
 * Created by ng on 16/7/15.
 */
public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int now = (start + end) / 2;
            int r = this.guess(now);

            if (r == 1) {
                end = now - 1;
            } else if (r == -1) {
                start = now + 1;
            } else {
                return now;
            }
        }

        return start;
    }
}
