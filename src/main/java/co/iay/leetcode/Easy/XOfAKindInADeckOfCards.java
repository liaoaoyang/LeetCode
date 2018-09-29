package co.iay.leetcode.Easy;

import java.util.*;

/**
 * 914. X of a Kind in a Deck of Cards
 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 * In a deck of cards, each card has an integer written on it.
 * <p>
 * Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:
 * <p>
 * Each group has exactly X cards.
 * All the cards in each group have the same integer.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,4,3,2,1]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[3,3],[4,4]
 * Example 2:
 * <p>
 * Input: [1,1,1,2,2,2,3,3]
 * Output: false
 * Explanation: No possible partition.
 * Example 3:
 * <p>
 * Input: [1]
 * Output: false
 * Explanation: No possible partition.
 * Example 4:
 * <p>
 * Input: [1,1]
 * Output: true
 * Explanation: Possible partition [1,1]
 * Example 5:
 * <p>
 * Input: [1,1,2,2,2,2]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[2,2]
 * <p>
 * Note:
 * <p>
 * 1 <= deck.length <= 10000
 * 0 <= deck[i] < 10000
 */
public class XOfAKindInADeckOfCards {
    private static List<Integer> getPrimes(int maxValue) {
        if (maxValue <= 3) {
            return Arrays.asList(2, 3);
        }

        List<Integer> primes = new ArrayList<>();
        int[] nums = new int[maxValue];

        for (int i = 0; i < maxValue; ++i) {
            nums[i] = i + 2;
        }

        for (int i = 0; i < nums.length && i <= Math.ceil(Math.sqrt(maxValue)); ++i) {
            if (nums[i] == 0) {
                continue;
            }

            int idx = i + nums[i];

            while (idx < nums.length) {
                nums[idx] = 0;
                idx += nums[i];
            }
        }

        for (int n : nums) {
            if (n == 0) {
                continue;
            }

            primes.add(n);
        }

        return primes;
    }

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length <= 1) {
            return false;
        }

        HashMap<Integer, Integer> dm = new HashMap<>();

        for (int d : deck) {
            dm.putIfAbsent(d, 0);
            dm.put(d, dm.get(d) + 1);
        }

        List<Integer> primes = getPrimes((deck.length + 1) / 2);

        for (Integer prime : primes) {
            if (deck.length % prime != 0) {
                continue;
            }

            Iterator<HashMap.Entry<Integer, Integer>> it = dm.entrySet().iterator();
            boolean has = true;

            while (it.hasNext() && has) {
                if (it.next().getValue() % prime != 0) {
                    has = false;
                }
            }

            if (has) {
                return true;
            }
        }

        return false;
    }
}
