package co.iay.leetcode.Easy;

/**
 * Created by ng on 2017/7/3.
 * 633. Sum of Square Numbers
 */
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int num1 = (int)Math.floor(Math.sqrt(c));

        if (num1 * num1 == c) {
            return true;
        }

        for (int i = num1; i >= 0; --i) {
            int num2 = (int)Math.floor(Math.sqrt(c - i * i));

            if (num2 * num2 + i * i == c) {
                return true;
            }
        }

        return false;
    }
}
