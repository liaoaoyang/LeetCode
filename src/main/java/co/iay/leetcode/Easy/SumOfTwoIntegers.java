package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/7/14.
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) {
            int tmp = a ^ b;
            b = (a & b) << 1;
            a = tmp;
        }

        return a;
    }
}
