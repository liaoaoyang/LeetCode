package co.iay.leetcode.Easy;

/**
 * 961. N-Repeated Element in Size 2N Array
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * <p>
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 * <p>
 * Return the element repeated N times.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: [2,1,2,5,3,2]
 * Output: 2
 * Example 3:
 * <p>
 * Input: [5,1,5,2,5,3,5,4]
 * Output: 5
 * <p>
 * <p>
 * Note:
 * <p>
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length is even
 */
public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {
        int[] map = new int[10000];

        for (int a : A) {
            map[a]++;

            if (map[a] == A.length / 2) {
                return a;
            }
        }

        return -1;
    }
}
