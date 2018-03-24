package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/12/23.
 * 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/
 * <p>
 * The Hamming distance between two integers is the number of positions
 * at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * Note:
 * 0 ≤ x, y < 231.
 * <p>
 * Example:
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * The above arrows point to positions where the corresponding bits are different.
 * Solution:
 * 转化为二进制字符串，统计1的个数即可。
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int dis = 0;

        for (char i : Integer.toBinaryString(x ^ y).toCharArray()) {
            if (i == '1') {
                ++dis;
            }
        }

        return dis;
    }
}
