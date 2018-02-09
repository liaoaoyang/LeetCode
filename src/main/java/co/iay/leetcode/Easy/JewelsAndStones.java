package co.iay.leetcode.Easy;

import java.util.HashSet;

/**
 * 771. Jewels and Stones
 * https://leetcode.com/problems/jewels-and-stones/
 * You're given strings J representing the types of stones that are jewels,
 * and S representing the stones you have.  Each character in S is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 * <p>
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> j = new HashSet<Character>();

        for (char c : J.toCharArray()) {
            j.add(c);
        }

        int result = 0;

        for (char c : S.toCharArray()) {
            if (j.contains(c)) {
                ++result;
            }
        }

        return result;
    }
}
