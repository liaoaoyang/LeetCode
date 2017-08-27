package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/1/23.
 */
public class MaxConsecutiveOnes {
    final private static int STATUS_ZERO = 0;
    final private static int STATUS_ONE = 1;

    public int findMaxConsecutiveOnes(int[] nums) {
        int nowConsecutiveOnesCount = 0;
        int maxConsecutiveOnesCount = 0;
        int status = STATUS_ZERO;

        for (int i : nums) {
            if (status == STATUS_ZERO && i == 1) {
                status = STATUS_ONE;
                nowConsecutiveOnesCount = 1;
                continue;
            }

            if (status == STATUS_ONE) {
                if (i == 1) {
                    ++nowConsecutiveOnesCount;
                } else {
                    status = STATUS_ZERO;

                    if (nowConsecutiveOnesCount > maxConsecutiveOnesCount) {
                        maxConsecutiveOnesCount = nowConsecutiveOnesCount;
                    }

                    nowConsecutiveOnesCount = 0;
                }
            }
        }

        return nowConsecutiveOnesCount > maxConsecutiveOnesCount ? nowConsecutiveOnesCount : maxConsecutiveOnesCount;
    }
}
