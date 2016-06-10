package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/9.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i2 = n - 1; i2 >= 0; --i2) {
            for (int i1 = 0; i1 < m; ++i1) {
                if (nums1[i1] > nums2[i2]) {
                    int tmp = nums1[i1];
                    nums1[i1] = nums2[i2];
                    nums2[i2] = tmp;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            nums1[m + i] = nums2[i];
        }
    }
}
