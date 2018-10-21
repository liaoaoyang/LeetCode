package co.iay.leetcode.Easy;

/**
 * 922. Sort Array By Parity II
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 * <p>
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * <p>
 * You may return any answer array that satisfies this condition.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * <p>
 * <p>
 * Note:
 * <p>
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 */
public class SortArrayByParityII {
    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    @SuppressWarnings("unused")
    private int[] swapSolution(int[] A) {
        for (int i = 0; i < A.length; ++i) {
            if (i % 2 == A[i] % 2) {
                continue;
            }

            boolean expectEven = (i % 2 == 0);

            for (int j = i + 1; j < A.length; ++j) {
                if ((expectEven && A[j] % 2 == 0) || (!expectEven && A[j] % 2 == 1)) {
                    swap(A, i, j);
                    break;
                }
            }
        }

        return A;
    }

    private int[] extraSpaceSolution(int[] A) {
        int[] newA = new int[A.length];
        int evenIdx = 0;
        int oddIdx = 1;

        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 0) {
                newA[evenIdx] = A[i];
                evenIdx += 2;
            } else {
                newA[oddIdx] = A[i];
                oddIdx += 2;
            }
        }

        return newA;
    }

    public int[] sortArrayByParityII(int[] A) {
        return extraSpaceSolution(A);
    }
}
