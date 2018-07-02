package co.iay.leetcode.Easy;

/**
 * 859. Buddy Strings
 * https://leetcode.com/problems/buddy-strings/
 * Given two strings A and B of lowercase letters,
 * return true if and only if we can swap two letters in A so that the result equals B.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: A = "ab", B = "ba"
 * Output: true
 * Example 2:
 * <p>
 * Input: A = "ab", B = "ab"
 * Output: false
 * Example 3:
 * <p>
 * Input: A = "aa", B = "aa"
 * Output: true
 * Example 4:
 * <p>
 * Input: A = "aaaaaaabc", B = "aaaaaaacb"
 * Output: true
 * Example 5:
 * <p>
 * Input: A = "", B = "aa"
 * Output: false
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A and B consist only of lowercase letters.
 */
public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        int caseFound = 0;
        boolean hasMultipleChars = false;
        char uA = '\0';
        char uB = '\0';
        int[] charsCount = new int[26];

        for (int i = 0; i < A.length(); ++i) {
            charsCount[A.charAt(i) - 'a']++;
            if (A.charAt(i) == B.charAt(i)) {
                continue;
            }

            if (caseFound == 2) {
                return false;
            }

            if (caseFound == 0) {
                uA = A.charAt(i);
                uB = B.charAt(i);
                ++caseFound;
            } else if (caseFound == 1) {
                if (uA == B.charAt(i) && uB == A.charAt(i)) {
                    ++caseFound;
                }
            }
        }

        for (int c : charsCount) {
            if (c >= 2) {
                hasMultipleChars = true;
                break;
            }
        }

        return caseFound == 2 || (hasMultipleChars && caseFound == 0);
    }
}
