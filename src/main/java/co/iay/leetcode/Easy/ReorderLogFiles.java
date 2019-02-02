package co.iay.leetcode.Easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 937. Reorder Log Files
 * https://leetcode.com/problems/reorder-log-files/
 * <p>
 * You have an array of logs.  Each log is a space delimited string of words.
 * <p>
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 * <p>
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.
 * It is guaranteed that each log has at least one word after its identifier.
 * <p>
 * Reorder the logs so that all of the letter-logs come before any digit-log.
 * The letter-logs are ordered lexicographically ignoring identifier,
 * with the identifier used in case of ties.
 * The digit-logs should be put in their original order.
 * <p>
 * Return the final order of the logs.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= logs.length <= 100
 * 3 <= logs[i].length <= 100
 * logs[i] is guaranteed to have an identifier, and a word after the identifier.
 * Solution:
 * 根据标示符后的首字母判断类型，对字符log按字典序排列，数字log按照原顺序排列。
 * 由于采用Java实现，利用Comparator的特性完成
 */
public class ReorderLogFiles {
    private boolean isLetterLogs(String log) {
        int logStartIndex = log.indexOf(' ') + 1;
        char c = log.charAt(logStartIndex);

        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private Comparator<String> comparator = (o1, o2) -> {
        if (isLetterLogs(o1) && isLetterLogs(o2)) {
            int startIndex1 = o1.indexOf(' ');
            int startIndex2 = o2.indexOf(' ');
            return o1.substring(startIndex1).compareTo(o2.substring(startIndex2));
        }

        if (isLetterLogs(o1) && !isLetterLogs(o2)) {
            return -1;
        }

        if (!isLetterLogs(o1) && isLetterLogs(o2)) {
            return 1;
        }

        return 0;
    };

    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, comparator);
        return logs;
    }
}
