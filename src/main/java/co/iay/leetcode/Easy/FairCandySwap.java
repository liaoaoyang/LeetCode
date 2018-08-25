package co.iay.leetcode.Easy;

import java.util.HashSet;

/**
 * 888. Fair Candy Swap
 * https://leetcode.com/problems/fair-candy-swap/
 * Alice and Bob have candy bars of different sizes:
 * A[i] is the size of the i-th bar of candy that Alice has,
 * and B[j] is the size of the j-th bar of candy that Bob has.
 * <p>
 * Since they are friends, they would like to exchange one candy bar each
 * so that after the exchange, they both have the same total amount of candy.
 * (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
 * <p>
 * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange,
 * and ans[1] is the size of the candy bar that Bob must exchange.
 * <p>
 * If there are multiple answers, you may return any one of them.
 * It is guaranteed an answer exists.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: A = [1,1], B = [2,2]
 * Output: [1,2]
 * Example 2:
 * <p>
 * Input: A = [1,2], B = [2,3]
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: A = [2], B = [1,3]
 * Output: [2,3]
 * Example 4:
 * <p>
 * Input: A = [1,2,5], B = [2,4]
 * Output: [5,4]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 10000
 * 1 <= B.length <= 10000
 * 1 <= A[i] <= 100000
 * 1 <= B[i] <= 100000
 * It is guaranteed that Alice and Bob have different total amounts of candy.
 * It is guaranteed there exists an answer.
 * Solution:
 * 交换数字的条件是以1换1，也即是说，两个数组之间总和的差值会通过两个数字的交换抹平。
 * 数组的差值是两者和之差的一半。
 * 遍历其中一个数组，查找是否存在一个数字，是当前数字和差值之和（如当前数字是3，差值是1，那么应该查找是否存在数字4）。
 * 如果存在，则返回结果。
 * 差值为正负数不影响结果。
 * 结果如果使用B遍历，则B中的数字在结果中放在下标值为1的位置。
 */
public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        HashSet<Integer> sa = new HashSet<>();
        HashSet<Integer> sb = new HashSet<>();
        int sumA = 0;
        int sumB = 0;

        for (int a : A) {
            sa.add(a);
            sumA += a;
        }

        for (int b : B) {
            sb.add(b);
            sumB += b;
        }

        int diff = (sumA - sumB) / 2;

        for (int b : sb) {
            if (sa.contains(b + diff)) {
                return new int[]{b + diff, b};
            }
        }

        return new int[]{0, 0};
    }
}
