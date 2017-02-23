package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/2/23.
 * 520. Detect Capital
 * https://leetcode.com/problems/detect-capital
 */
public class DetectCapital {
    final private static int BEGIN = 0;
    final private static int UPPER_IN_FIRST = 1;
    final private static int UPPER_IN_ALL = 2;
    final private static int UPPER_ONLY_IN_FIRST = 3;
    final private static int LOWER_CASE = 4;

    public boolean detectCapitalUse(String word) {
        int state = BEGIN;

        for (int i = 0; i < word.length(); ++i) {
            char chatAtI = word.charAt(i);
            boolean isUpperCase = (chatAtI == Character.toUpperCase(chatAtI));

            switch (state) {
                case BEGIN:
                    if (isUpperCase) {
                        state = UPPER_IN_FIRST;
                    } else {
                        state = LOWER_CASE;
                    }
                    break;

                case UPPER_IN_FIRST:
                    if (isUpperCase) {
                        state = UPPER_IN_ALL;
                    } else {
                        state = UPPER_ONLY_IN_FIRST;
                    }
                    break;

                case UPPER_IN_ALL:
                    if (!isUpperCase) {
                        return false;
                    }
                    break;

                case UPPER_ONLY_IN_FIRST:
                    if (isUpperCase) {
                        return false;
                    }
                    break;

                case LOWER_CASE:
                    if (isUpperCase) {
                        return false;
                    }
                    break;

                default:
                    break;
            }
        }

        return true;
    }
}
