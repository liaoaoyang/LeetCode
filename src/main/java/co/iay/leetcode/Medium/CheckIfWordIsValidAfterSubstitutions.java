package co.iay.leetcode.Medium;

/**
 * 1003. Check If Word Is Valid After Substitutions
 * https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/
 * We are given that the string "abc" is valid.
 * <p>
 * From any valid string V, we may split V into two pieces X and Y such that X + Y (X concatenated with Y) is equal to V.  (X or Y may be empty.)  Then, X + "abc" + Y is also valid.
 * <p>
 * If for example S = "abc", then examples of valid strings are: "abc", "aabcbc", "abcabc", "abcabcababcc".  Examples of invalid strings are: "abccba", "ab", "cababc", "bac".
 * <p>
 * Return true if and only if the given string S is valid.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "aabcbc"
 * Output: true
 * Explanation:
 * We start with the valid string "abc".
 * Then we can insert another "abc" between "a" and "bc", resulting in "a" + "abc" + "bc" which is "aabcbc".
 * Example 2:
 * <p>
 * Input: "abcabcababcc"
 * Output: true
 * Explanation:
 * "abcabcabc" is valid after consecutive insertings of "abc".
 * Then we can insert "abc" before the last letter, resulting in "abcabcab" + "abc" + "c" which is "abcabcababcc".
 * Example 3:
 * <p>
 * Input: "abccba"
 * Output: false
 * Example 4:
 * <p>
 * Input: "cababc"
 * Output: false
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= S.length <= 20000
 * S[i] is 'a', 'b', or 'c'
 */
public class CheckIfWordIsValidAfterSubstitutions {
    public boolean isValid(String S) {
        while (S.length() > 0) {
            int prev = S.length();
            S = S.replace("abc", "");

            if (S.length() == prev) {
                break;
            }
        }

        return S.length() == 0;
    }
}
