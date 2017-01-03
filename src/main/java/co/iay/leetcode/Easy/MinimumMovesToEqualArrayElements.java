package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/11/11.
 */
public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int n : nums) {
            sum += n;

            if (n < min) {
                min = n;
            }
        }

        return sum - min * nums.length;
    }
}
