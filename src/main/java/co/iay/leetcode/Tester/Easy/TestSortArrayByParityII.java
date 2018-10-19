package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SortArrayByParityII;
import org.junit.Assert;
import org.junit.Test;

public class TestSortArrayByParityII {
    private SortArrayByParityII s = new SortArrayByParityII();

    private void checkResult(int[] A) {
        for (int i = 0; i < A.length; ++i) {
            Assert.assertEquals(A[i] % 2, i % 2);
        }
    }

    @Test
    public void testSortArrayByParityIICase1() {
        int[] A = new int[]{4, 2, 5, 7};
        A = s.sortArrayByParityII(A);
        checkResult(A);
    }
}
