package co.iay.leetcode.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 917. Reverse Only Letters
 * https://leetcode.com/problems/reverse-only-letters/
 * Given a string S, return the "reversed" string
 * where all characters that are not a letter stay in the same place,
 * and all letters reverse their positions.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "ab-cd"
 * Output: "dc-ba"
 * Example 2:
 * <p>
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * Example 3:
 * <p>
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 * <p>
 * <p>
 * Note:
 * <p>
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S doesn't contain \ or "
 */
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        Deque<Character> cq = new ArrayDeque<>();
        Deque<Character> ncq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                cq.addFirst(c);
            } else {
                ncq.addLast(c);
            }
        }

        for (char c : S.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(cq.pollFirst());
            } else {
                sb.append(ncq.pollFirst());
            }
        }

        return sb.toString();
    }
}
