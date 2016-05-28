package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/5/28.
 */
public class RangeSumQuery {
    int[] nums = null;

    public RangeSumQuery(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;

        for (int idx = i; idx <= j; ++idx) {
            sum += this.nums[idx];
        }

        return sum;
    }
}
