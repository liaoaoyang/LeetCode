package co.iay.leetcode.Easy;

/**
 * 949. Largest Time for Given Digits
 * https://leetcode.com/problems/largest-time-for-given-digits/
 * Given an array of 4 digits, return the largest 24 hour time that can be made.
 * <p>
 * The smallest 24 hour time is 00:00, and the largest is 23:59.
 * Starting from 00:00, a time is larger if more time has elapsed since midnight.
 * <p>
 * Return the answer as a string of length 5.
 * If no valid time can be made, return an empty string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4]
 * Output: "23:41"
 * Example 2:
 * <p>
 * Input: [5,5,5,5]
 * Output: ""
 * <p>
 * <p>
 * Note:
 * <p>
 * A.length == 4
 * 0 <= A[i] <= 9
 */
public class LargestTimeForGivenDigits {
    private String max;

    private void travel(int[] A, int[] usedA, StringBuilder sb) {
        for (int i = 0; i < A.length; ++i) {
            if (usedA[i] == 1 || sb.length() == 4) {
                continue;
            }

            sb.append(A[i]);

            if (sb.length() == 4) {
                if (Integer.parseInt(sb.substring(0, 2)) < 24 &&
                        Integer.parseInt(sb.substring(2, 4)) < 60) {
                    sb.insert(2, ":");

                    if (sb.toString().compareTo(max) > 0) {
                        max = sb.toString();
                    }

                    sb.deleteCharAt(2);
                }

            }

            usedA[i] = 1;
            travel(A, usedA, sb);
            usedA[i] = 0;
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public String largestTimeFromDigits(int[] A) {
        max = "";
        int[] usedA = new int[A.length];

        travel(A, usedA, new StringBuilder());

        return max;
    }
}
