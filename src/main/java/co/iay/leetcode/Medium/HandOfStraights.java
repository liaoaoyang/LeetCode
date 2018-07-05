package co.iay.leetcode.Medium;

import java.util.Map;
import java.util.TreeMap;

/**
 * 846. Hand of Straights
 * https://leetcode.com/problems/hand-of-straights/
 * Alice has a hand of cards, given as an array of integers.
 * <p>
 * Now she wants to rearrange the cards into groups so that each group is size W,
 * and consists of W consecutive cards.
 * <p>
 * Return true if and only if she can.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
 * Output: true
 * Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].
 * Example 2:
 * <p>
 * Input: hand = [1,2,3,4,5], W = 4
 * Output: false
 * Explanation: Alice's hand can't be rearranged into groups of 4.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= hand.length <= 10000
 * 0 <= hand[i] <= 10^9
 * 1 <= W <= hand.length
 */
public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int W) {
        Map<Integer, Integer> handMap = new TreeMap<>();

        for (int h : hand) {
            if (!handMap.containsKey(h)) {
                handMap.put(h, 0);
            }

            handMap.put(h, handMap.get(h) + 1);
        }

        for (Map.Entry<Integer, Integer> e : handMap.entrySet()) {
            if (e.getValue() == 0) {
                continue;
            }

            int minus = e.getValue();

            for (int i = 1; i < W; ++i) {
                if (!handMap.containsKey(e.getKey() + i)) {
                    return false;
                }

                minus = Math.min(minus, handMap.get(e.getKey() + i));
            }

            for (int i = 0; minus > 0 && i < W; ++i) {
                handMap.put(e.getKey() + i, handMap.get(e.getKey() + i) - minus);
            }
        }

        return true;
    }
}
