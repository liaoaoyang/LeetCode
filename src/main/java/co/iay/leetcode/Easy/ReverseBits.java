package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/30.
 */
public class ReverseBits {
    public int reverseBits(int n) {
        long unsignedN = n;
        long result = 0;

        if (unsignedN < 0) {
            unsignedN += 4294967296L;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(Long.toBinaryString(unsignedN));

        while (sb.length() < 32) {
            sb.insert(0, '0');
        }

        String reversed = sb.reverse().toString();

        for (int i = reversed.length() - 1; i >= 0; --i) {
            if (reversed.charAt(i) == '1') {
                result += Math.pow(2, 31 - i);
            }
        }

        return (int)result;
    }
}
