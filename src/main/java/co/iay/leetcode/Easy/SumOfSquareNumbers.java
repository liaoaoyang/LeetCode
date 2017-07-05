package co.iay.leetcode.Easy;

/**
 * Created by ng on 2017/7/3.
 * 633. Sum of Square Numbers
 * https://leetcode.com/problems/sum-of-square-numbers/
 */
public class SumOfSquareNumbers {
    // X =  P＾2 + PQ
    // Y =  Q＾2 / 2  +  PQ
    // Z =  P＾2 + Q＾2 / 2  +  PQ
    public boolean judgeSquareSum(int c) {
        int num1 = (int)(Math.ceil(Math.sqrt(c)));

        if (num1 * num1 == c) {
            return true;
        }

        for (int i = 1, j = num1; i <= j; ) {
            if (c < i * i + j * j) {
                --j;
            } else if (c > i * i + j * j) {
                ++i;
            } else {
                return true;
            }
        }

        return false;
    }
}
