package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * 870. Advantage Shuffle
 * https://leetcode.com/problems/advantage-shuffle/
 * Given two arrays A and B of equal size,
 * the advantage of A with respect to B is the number of indices i for which A[i] > B[i].
 * <p>
 * Return any permutation of A that maximizes its advantage with respect to B.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: A = [2,7,11,15], B = [1,10,4,11]
 * Output: [2,11,7,15]
 * Example 2:
 * <p>
 * Input: A = [12,24,8,32], B = [13,25,32,11]
 * Output: [24,32,8,12]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length = B.length <= 10000
 * 0 <= A[i] <= 10^9
 * 0 <= B[i] <= 10^9
 */
public class AdvantageShuffle {
    public int[] advantageCount(int[] A, int[] B) {
        TreeMap<Integer, List<Integer>> mapB = new TreeMap<>();
        int length = A.length;
        for (int i = 0; i < length; ++i) {
            List<Integer> idxA = mapB.getOrDefault(B[i], new ArrayList<>());
            idxA.add(i);
            mapB.putIfAbsent(B[i], idxA);
        }

        int[] C = new int[A.length];

        for (int aA : A) {
            Integer lessThanAi = mapB.lowerKey(aA);

            if (lessThanAi == null) {
                lessThanAi = mapB.lastKey();
            }

            List<Integer> idxA = mapB.get(lessThanAi);
            int idx = idxA.get(idxA.size() - 1);
            idxA.remove(idxA.size() - 1);
            C[idx] = aA;

            if (idxA.size() == 0) {
                mapB.remove(lessThanAi);
            }
        }

        return C;
    }
}
