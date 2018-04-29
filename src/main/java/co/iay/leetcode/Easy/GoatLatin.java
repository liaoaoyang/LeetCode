package co.iay.leetcode.Easy;

/**
 * 824. Goat Latin
 * https://leetcode.com/problems/goat-latin/
 * A sentence S is given, composed of words separated by spaces.
 * Each word consists of lowercase and uppercase letters only.
 * <p>
 * We would like to convert the sentence to "Goat Latin"
 * (a made-up language similar to Pig Latin.)
 * <p>
 * The rules of Goat Latin are as follows:
 * <p>
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 * For example, the word 'apple' becomes 'applema'.
 * <p>
 * If a word begins with a consonant (i.e. not a vowel),
 * remove the first letter and append it to the end, then add "ma".
 * For example, the word "goat" becomes "oatgma".
 * <p>
 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 * For example, the first word gets "a" added to the end,
 * the second word gets "aa" added to the end and so on.
 * Return the final sentence representing the conversion from S to Goat Latin.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "I speak Goat Latin"
 * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 * Example 2:
 * <p>
 * Input: "The quick brown fox jumped over the lazy dog"
 * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 * <p>
 * <p>
 * Notes:
 * <p>
 * S contains only uppercase, lowercase and spaces. Exactly one space between each word.
 * 1 <= S.length <= 100.
 */
public class GoatLatin {
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();

        String[] ss = S.split(" ");
        String vowel = "AEIOUaeiou";

        for (int i = 0; i < ss.length; ++i) {
            String s = ss[i];

            if (vowel.indexOf(s.charAt(0)) >= 0) {
                sb.append(s);
            } else {
                sb.append(s.substring(1));
                sb.append(s.charAt(0));
            }

            sb.append("ma");

            for (int j = 0; j <= i; ++j) {
                sb.append("a");
            }

            if (i != ss.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
