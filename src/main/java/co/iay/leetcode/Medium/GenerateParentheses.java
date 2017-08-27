package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/3/18.
 */
public class GenerateParentheses {
    private void generateParenthesis(List<String> result, int leftPLeft, int rightPLeft, String s) {
        if (leftPLeft == 0 && rightPLeft == 0) {
            result.add(s);
            return;
        }

        if (leftPLeft > 0) {
            generateParenthesis(
                    result,
                    leftPLeft - 1,
                    rightPLeft,
                    s + "("
            );
        }

        if (s.length() != 0 && (rightPLeft > leftPLeft)) {
            generateParenthesis(
                    result,
                    leftPLeft,
                    rightPLeft - 1,
                    s + ")"
            );
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generateParenthesis(result, n - 1, n, "(");

        return result;
    }
}
