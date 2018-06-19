package co.iay.leetcode.Easy;

/**
 * 852. Peak Index in a Mountain Array
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * Let's call an array A a mountain if the following properties hold:
 * <p>
 * A.length >= 3
 * There exists some 0 < i < A.length - 1
 * such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain,
 * return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 * <p>
 * Example 1:
 * <p>
 * Input: [0,1,0]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [0,2,1,0]
 * Output: 1
 * Note:
 * <p>
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A is a mountain, as defined above.
 */
public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int prev = -1;

        for (int i = 0; i < A.length; ++i) {
            if (A[i] - prev < 0) {
                return i - 1;
            }

            prev = A[i];
        }

        return 0;
    }
}
