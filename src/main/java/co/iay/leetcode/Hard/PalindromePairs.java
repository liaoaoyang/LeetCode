package co.iay.leetcode.Hard;

import java.util.*;

/**
 * 336. Palindrome Pairs
 * https://leetcode.com/problems/palindrome-pairs/
 * <p>
 * Given a list of unique words, find all pairs of distinct indices (i, j) in the given list, so that the concatenation of the two words, i.e. words[i] + words[j] is a palindrome.
 * <p>
 * Example 1:
 * Given words = ["bat", "tab", "cat"]
 * Return [[0, 1], [1, 0]]
 * The palindromes are ["battab", "tabbat"]
 * Example 2:
 * Given words = ["abcd", "dcba", "lls", "s", "sssll"]
 * Return [[0, 1], [1, 0], [3, 2], [2, 4]]
 * The palindromes are ["dcbaabcd", "abcddcba", "slls", "llssssll"]
 * <p>
 * Solution1:
 * 暴力解法o2Solution，即将字符串排列组合之后判断是否是回文串，会TLE
 * <p>
 * Solution2:
 * 分析一下字符串，可以一个字符串abc如果要和其他字符串构成回文串，分为如下几种情况：
 * 1. 与cba构成回文串，即abc+cba=abccba
 * 2. 与ba构成回文串，即abc+ab=abcba
 * 3. 与cb构成回文串，即cb+abc=cbabc
 * <p>
 * 综上，可知，只需要判断是否存在这三种情况，即同样长度情况下，查找是否存在等长回文串，
 * 之后查询前缀和后缀是否构成回文串即可。
 * 可以通过HashMap等来提高操作速度。
 */
public class PalindromePairs {
    private boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (r >= 0 && l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            ++l;
            --r;
        }

        return true;
    }

    @SuppressWarnings("unused")
    private List<List<Integer>> o2Solution(String[] words) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashSet<String> tried = new HashSet<String>();

        for (int i = 0; i < words.length; ++i) {
            for (int j = 0; j < words.length; ++j) {
                if (i == j) {
                    continue;
                }

                String triedKey = i + "_" + j;

                if (tried.contains(triedKey)) {
                    continue;
                }

                tried.add(triedKey);

                if (isPalindrome(words[i] + words[j])) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    private List<List<Integer>> hashSolution(String[] words) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashMap<Integer, HashMap<String, Integer>> m = new HashMap<Integer, HashMap<String, Integer>>();
        HashMap<String, Integer> reverseWords = new HashMap<String, Integer>();
        Set<Integer> len = new HashSet<Integer>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; ++i) {
            String w = words[i];

            if (!m.containsKey(w.length())) {
                m.put(w.length(), new HashMap<String, Integer>());
            }

            m.get(w.length()).put(w, i);
            len.add(w.length());
            sb.setLength(0);
            sb.append(w);
            reverseWords.put(sb.reverse().toString(), i);
        }

        List<Integer> sortedLen = new ArrayList<Integer>(len);
        Collections.sort(sortedLen);

        for (int i = 0; i < words.length; ++i) {
            String w = words[i];

            if (reverseWords.containsKey(w) && reverseWords.get(w) != i) {
                result.add(Arrays.asList(i, reverseWords.get(w)));
            }

            for (int j = 0; j < sortedLen.size() && sortedLen.get(j) < w.length(); ++j) {
                int endIndex = w.length() - sortedLen.get(j);
                if (isPalindrome(w.substring(0, endIndex))) {
                    String ww = w.substring(endIndex);
                    if (reverseWords.containsKey(ww) && reverseWords.get(ww) != i) {
                        result.add(Arrays.asList(reverseWords.get(ww), i));
                    }
                }

                int beginIndex = sortedLen.get(j);
                if (isPalindrome(w.substring(beginIndex, w.length()))) {
                    String ww = w.substring(0, beginIndex);
                    if (reverseWords.containsKey(ww) && reverseWords.get(ww) != i) {
                        result.add(Arrays.asList(i, reverseWords.get(ww)));
                    }
                }
            }
        }

        return result;
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        return hashSolution(words);
    }
}
