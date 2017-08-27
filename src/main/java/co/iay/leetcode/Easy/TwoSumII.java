package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/2/26.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;

        while (s != e) {
            int sum = numbers[s] + numbers[e];
            int mid = (s + e) / 2;

            if (sum > target) {
                e = mid - 1;
            } else if (sum < target) {
                s = mid + 1;
            } else {
                return new int[]{s + 1, e + 1};
            }
        }

        return null;
    }
}
