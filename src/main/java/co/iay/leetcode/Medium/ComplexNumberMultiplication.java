package co.iay.leetcode.Medium;

/**
 * Created by ng on 17/5/6.
 * 537. Complex Number Multiplication
 * https://leetcode.com/problems/complex-number-multiplication/
 */
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        int aSep = a.indexOf('+');
        int bSep = b.indexOf('+');

        int ar = Integer.parseInt(a.substring(0, aSep));
        int br = Integer.parseInt(b.substring(0, bSep));
        int av = Integer.parseInt(a.substring(aSep + 1, a.length() - 1));
        int bv = Integer.parseInt(b.substring(bSep + 1, b.length() - 1));

        return (ar * br + -1 * av * bv) + "+" + (ar * bv + br * av) + "i";
    }
}
