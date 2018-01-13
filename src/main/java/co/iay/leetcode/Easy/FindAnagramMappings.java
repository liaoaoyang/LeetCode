package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 760. Find Anagram Mappings
 * https://leetcode.com/problems/find-anagram-mappings/
 * Given two lists Aand B, and B is an anagram of A.
 * B is an anagram of A means B is made by randomizing the order of the elements in A.
 * <p>
 * We want to find an index mapping P, from A to B.
 * A mapping P[i] = j means the ith element in A appears in B at index j.
 * <p>
 * These lists A and B may contain duplicates. If there are multiple answers,
 * output any of them.
 * <p>
 * For example, given
 * <p>
 * A = [12, 28, 46, 32, 50]
 * B = [50, 12, 32, 46, 28]
 * We should return
 * [1, 4, 3, 2, 0]
 * as P[0] = 1 because the 0th element of A appears at B[1],
 * and P[1] = 4 because the 1st element of A appears at B[4], and so on.
 * Note:
 * <p>
 * A, B have equal lengths in range [1, 100].
 * A[i], B[i] are integers in range [0, 10^5].
 */
public class FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] result = new int[B.length];
        HashMap<Integer, List<Integer>> m = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < B.length; ++i) {
            if (!m.containsKey(B[i])) {
                m.put(B[i], new ArrayList<Integer>());
            }

            m.get(B[i]).add(i);
        }

        for (int i = 0; i < A.length; ++i) {
            result[i] = m.get(A[i]).get(0);
            m.get(A[i]).remove(0);
        }

        return result;
    }
}
