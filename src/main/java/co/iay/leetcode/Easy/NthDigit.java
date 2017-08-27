package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/11/5.
 */
public class NthDigit {
    public int findNthDigit(int n) {
        long numStart = 1;
        long numCount = 9;
        long numLen = 1;

        while (n > numLen * numCount) {
            n -= numCount * numLen;
            numCount *= 10;
            numStart *= 10;
            ++numLen;
        }

        numStart += ((n - 1) / numLen);
        return (numStart + "").charAt((int) ((n - 1) % numLen)) - '0';
    }
}
