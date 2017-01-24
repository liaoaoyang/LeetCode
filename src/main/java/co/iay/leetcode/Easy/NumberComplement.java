package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/1/23.
 */
public class NumberComplement {
    private static int findComplementByStringOp(int num) {
        char[] numStr = Integer.toBinaryString(num).toCharArray();
        int numStartIdx = numStr.length == Integer.SIZE ? 1 : 0;

        System.out.println(numStr);

        for (int i = numStartIdx; i < numStr.length; ++i) {
            numStr[i] = (numStr[i] == '0' ? '1' : '0');
        }

        System.out.println(numStr);

        return Integer.parseInt(new String(numStr), 2);
    }

    public int findComplement(int num) {
        return findComplementByStringOp(num);
    }
}
