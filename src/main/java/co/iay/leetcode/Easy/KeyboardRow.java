package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ng on 17/2/18.
 * 500. Keyboard Row
 * https://leetcode.com/problems/keyboard-row/
 */
public class KeyboardRow {
    private static int MODE_NONE = 0;
    private static int MODE_Q = 1;
    private static int MODE_A = 2;
    private static int MODE_Z = 3;

    private static boolean str2Map(String str, HashMap<Character, Boolean> m) {
        for (char c : str.toCharArray()) {
            m.put(c, true);
        }

        return true;
    }

    public String[] findWords(String[] words) {
        HashMap<Character, Boolean> qRow = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> aRow = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> zRow = new HashMap<Character, Boolean>();

        str2Map("qwertyuiop", qRow);
        str2Map("asdfghjkl", aRow);
        str2Map("zxcvbnm", zRow);

        ArrayList<String> result = new ArrayList<String>();

        for (String word : words) {
            char[] cWord = word.toLowerCase().toCharArray();
            int mode = MODE_NONE;
            boolean found = true;

            for (char c : cWord) {
                if (mode == MODE_NONE) {
                    if (qRow.containsKey(c)) {
                        mode = MODE_Q;
                    } else if (aRow.containsKey(c)) {
                        mode = MODE_A;
                    } else {
                        mode = MODE_Z;
                    }
                } else if (mode == MODE_Q) {
                    if (!qRow.containsKey(c)) {
                        found = false;
                        break;
                    }
                } else if (mode == MODE_A) {
                    if (!aRow.containsKey(c)) {
                        found = false;
                        break;
                    }
                } else {
                    if (!zRow.containsKey(c)) {
                        found = false;
                        break;
                    }
                }
            }

            if (found) {
                result.add(word);
            }
        }

        return result.toArray(new String[result.size()]);
    }
}
