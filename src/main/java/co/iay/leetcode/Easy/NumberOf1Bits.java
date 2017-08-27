package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/18.
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        long unsignedN = n;

        if (unsignedN < 0) {
            unsignedN += 4294967296L;
        }

        int num = 0;
        int maxPos = 31;

        while (unsignedN > 0) {
            for (int pos = maxPos; pos >= 0; --pos) {
                if (((long) 1 << pos) <= unsignedN) {
                    ++num;
                    unsignedN -= ((long) 1 << pos);
                    maxPos = pos - 1;
                    break;
                }
            }
        }

        return num;
    }
}
