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
 */
public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int max = 0;

        for (int n : nums) {
            max = n > max ? n : max;
        }

        int[] sums = new int[max + 1];

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
