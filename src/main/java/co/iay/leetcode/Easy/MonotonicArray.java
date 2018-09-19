package co.iay.leetcode.Easy;

/**
 * 896. Monotonic Array
 * https://leetcode.com/problems/monotonic-array/
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * <p>
 * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
 * <p>
 * Return true if and only if the given array A is monotonic.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,2,3]
 * Output: true
 * Example 2:
 * <p>
 * Input: [6,5,4,4]
 * Output: true
 * Example 3:
 * <p>
 * Input: [1,3,2]
 * Output: false
 * Example 4:
 * <p>
 * Input: [1,2,4,5]
 * Output: true
 * Example 5:
 * <p>
 * Input: [1,1,1]
 * Output: true
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 50000
 * -100000 <= A[i] <= 100000
 */
public class MonotonicArray {
    final private int TYPE_NONE       = 0;
    final private int TYPE_INCREASING = 1;
    final private int TYPE_DECREASING = -1;

    public boolean isMonotonic(int[] A) {
        if (A.length <= 1) {
            return true;
        }

        int type = Integer.compare(A[1], A[0]);

        for (int i = 2; i < A.length; ++i) {
            if (type == TYPE_INCREASING && A[i] < A[i - 1]) {
                return false;
            } else if (type == TYPE_DECREASING && A[i] > A[i - 1]) {
                return false;
            } else if (type == TYPE_NONE) {
                type = Integer.compare(A[i], A[i - 1]);
            }
        }

        return true;
    }
}
