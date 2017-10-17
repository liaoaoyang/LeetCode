package co.iay.leetcode.Easy;

/**
 * Created by ng on 2017/5/16.
 * 581. Shortest Unsorted Continuous Subarray
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 * <p>
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.
 * <p>
 * You need to find the shortest such subarray and output its length.
 * <p>
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * Note:
 * Then length of the input array is in range [1, 10,000].
 * The input array may contain duplicates, so ascending order here means <=.
 * <p>
 * Solution:
 * 数组是否存在一个单调递增的序列，可以基于如下规则去观察。
 * 如果一个数组是递增的，那么从数组从开始到结束，每当下标向后移动时，都会遇到数组当前序列的最大值。
 * 如果一个数组是递增的，那么从数组从结束到开始，每当下标向前移动时，都会遇到数组当前序列的最小值。
 * 一旦出现未排序的情况，那么数组从开始到结束，下标向后移动时，有可能会遇到比数组最大值更小的数字，
 * 同理，数组从结束到开始，下标向前移动时，也可能遇到比数组最小值大的数字。
 * 只要出现了上述情况，那么说明从当前出现问题下标开始，数组变为无序的了。
 * 只需要知道最后一个异常的下标，对于两端进行下标相减的操作，即可知道无序的长度。
 * 时间复杂度为O(n)，空间复杂度为O(1)。
 */
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int unsortedBeginIndex = nums.length - 1;
        int unsortedEndIndex = 0;
        int arrayMaxVal = nums[0];
        int arrayMinVal = nums[nums.length - 1];

        for (int i = 0; i < nums.length; ++i) {
            arrayMaxVal = Math.max(arrayMaxVal, nums[i]);
            arrayMinVal = Math.min(arrayMinVal, nums[nums.length - 1 - i]);

            if (arrayMaxVal > nums[i]) {
                unsortedEndIndex = i;
            }

            if (arrayMinVal < nums[nums.length - 1 - i]) {
                unsortedBeginIndex = nums.length - 1 - i;
            }
        }

        // EG:相邻元素下标值相差1，但是长度是2，所以求长度需要+1
        int unsortedLen = unsortedEndIndex - unsortedBeginIndex + 1;
        return unsortedLen < 0 ? 0 : unsortedLen;
    }
}
