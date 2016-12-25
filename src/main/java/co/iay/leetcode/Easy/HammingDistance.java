package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/12/23.
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
