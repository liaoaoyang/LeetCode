package co.iay.leetcode.Medium;

/**
 * 740. Delete and Earn
 * https://leetcode.com/problems/delete-and-earn/
 * Given an array nums of integers, you can perform operations on the array.
 * <p>
 * In each operation, you pick any nums[i] and delete it to earn nums[i] points. After, you must delete every element equal to nums[i] - 1 or nums[i] + 1.
 * <p>
 * You start with 0 points. Return the maximum number of points you can earn by applying such operations.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3, 4, 2]
 * Output: 6
 * Explanation:
 * Delete 4 to earn 4 points, consequently 3 is also deleted.
 * Then, delete 2 to earn 2 points. 6 total points are earned.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [2, 2, 3, 3, 3, 4]
 * Output: 9
 * Explanation:
 * Delete 3 to earn 3 points, deleting both 2's and the 4.
 * Then, delete 3 again to earn 3 points, and 3 again to earn 3 points.
 * 9 total points are earned.
 * <p>
 * <p>
 * Note:
 * <p>
 * The length of nums is at most 20000.
 * Each element nums[i] is an integer in the range [1, 10000].
 * Solution:
 * 本质上是相邻元素不能增加到结果中。
 * 从小到大遍历数组，当要增加元素nums[i]时，nums[i-1]就不能被增加。
 * 用notTake记录不选择nums[i]时的结果总和，用take记录选择时的总和。
 * 分为如下几种情况：
 * 1）
 * 当决定不选择nums[i]时，在之前可以选择nums[i-1]或者不选择。
 * 遍历到i时，take和notTake都是nums[i-1]时的状态，比较最大值即可。
 * 2）
 * 当决定选择nums[i]时，只能是拿到不选择nums[i-1]的总和加上nums[i]*其个数。
 * 遍历到i时，notTake还未更新，表示的自然是不选择nums[i-1]的最大和。
 * 逐步遍历更新take和notTake的值，最终返回结果即可。
 */
public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int max = 0;

        for (int n : nums) {
            max = n > max ? n : max;
        }

        int[] sums = new int[max + 1];

        // 获得每个元素能够取得的总值
        for (int n : nums) {
            sums[n] += n;
        }

        int notTake = 0;
        int take = 0;

        for (int sum : sums) {
            int takeI = notTake + sum;
            int ignoreI = Math.max(take, notTake);
            take = takeI;
            notTake = ignoreI;
        }

        return Math.max(notTake, take);
    }
}
