package co.iay.leetcode.Easy;

/**
 * 925. Long Pressed Name
 * https://leetcode.com/problems/long-pressed-name/
 * Your friend is typing his name into a keyboard.
 * Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
 * <p>
 * You examine the typed characters of the keyboard.
 * Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 * Explanation: 'a' and 'e' in 'alex' were long pressed.
 * Example 2:
 * <p>
 * Input: name = "saeed", typed = "ssaaedd"
 * Output: false
 * Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
 * Example 3:
 * <p>
 * Input: name = "leelee", typed = "lleeelee"
 * Output: true
 * Example 4:
 * <p>
 * Input: name = "laiden", typed = "laiden"
 * Output: true
 * Explanation: It's not necessary to long press any character.
 * <p>
 * <p>
 * Note:
 * <p>
 * name.length <= 1000
 * typed.length <= 1000
 * The characters of name and typed are lowercase letters.
 */
public class LongPressedName {
    @SuppressWarnings({"unused"})
    private boolean compareAndForwardSolution(String name, String typed) {
        if (name.length() == 1 && typed.length() == 1) {
            return name.equals(typed);
        }

        int iName = 1;
        int curNameCharLen = 1;
        int iTyped = 1;
        int curTypedCharLen = 1;

        do {
            while (iName < name.length() && name.charAt(iName - 1) == name.charAt(iName)) {
                ++iName;
                ++curNameCharLen;
            }

            while (iTyped < typed.length() && typed.charAt(iTyped - 1) == typed.charAt(iTyped)) {
                ++iTyped;
                ++curTypedCharLen;
            }

            // "aab" "ab"
            if (curNameCharLen > curTypedCharLen) {
                return false;
            }

            // "ab" "bb"
            if (name.charAt(iName - 1) != typed.charAt(iTyped - 1)) {
                return false;
            }

            curNameCharLen = (iName >= name.length() ? 0 : 1);
            curTypedCharLen = (iTyped >= typed.length() ? 0 : 1);
            iName += (iName >= name.length() ? 0 : 1);
            iTyped += (iTyped >= typed.length() ? 0 : 1);
        } while (iName < name.length() || iTyped < typed.length());

        if (curNameCharLen > curTypedCharLen) {
            return false;
        }

        if (name.charAt(iName - 1) != typed.charAt(iTyped - 1)) {
            return false;
        }

        return true;
    }

    private boolean fasterSolution(String name, String typed) {
        int nameLength = name.length();
        int typedLength = typed.length();

        if (nameLength > typedLength) {
            return false;
        }

        int iName = 0;
        int iTyped = 0;

        while (iName < nameLength || iTyped < typedLength) {
            if (iName < nameLength && iTyped < typedLength && name.charAt(iName) == typed.charAt(iTyped)) {
                // 当两个字符都相同时，尝试比较下一个字符 "aab" "aab"
                ++iName;
                ++iTyped;
            } else if (iName > 0 && iTyped < typedLength && name.charAt(iName - 1) == typed.charAt(iTyped)) {
                // 当两个字符不同时，尝试比较当前字符是否与上一个字符相同 "ab" "aab"
                ++iTyped;
            } else {
                break;
            }
        }

        // 如果是重复输入，那么去掉重复字符之后，两个字符串的下标应该都是到达字符串末尾的
        return iName == nameLength && iTyped == typedLength;
    }

    public boolean isLongPressedName(String name, String typed) {
        return fasterSolution(name, typed);
    }
}
