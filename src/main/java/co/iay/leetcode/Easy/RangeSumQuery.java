package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/5/28.
 * https://leetcode.com/problems/range-sum-query-immutable/
 */
public class RangeSumQuery {
    int[] nums = null;
    int[] result = null;

    public RangeSumQuery(int[] nums) {
        this.nums = nums;
        this.result = new int[nums.length + 1];
        this.result[0] = 0;

        for (int end = 1; end <= nums.length; ++end) {
            this.result[end] = this.result[end - 1] + this.nums[end - 1];
        }
    }

    public int sumRange(int i, int j) {
        return this.result[j + 1] - this.result[i];
    }
}
