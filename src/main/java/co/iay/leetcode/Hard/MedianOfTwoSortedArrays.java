package co.iay.leetcode.Hard;

/**
 * Created by ng on 16/4/12.
 */
public class MedianOfTwoSortedArrays {
	private static final int ASC = 0;
    private static final int DESC = 1;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;

        if (nums1.length + nums2.length == 0) {
            return 0;
        }

        int[] mergedNums = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int nums1order = (nums1.length >= 2 && nums1[0] > nums1[1]) ? DESC : ASC;
        int nums2order = (nums2.length >= 2 && nums2[0] > nums2[1]) ? DESC : ASC;
        int mergedIdx = 0;

        for (;i < nums1.length || j < nums2.length;) {
            int realI = (nums1order == ASC ? i : nums1.length - i - 1);
            int realJ = (nums2order == ASC ? j : nums2.length - j - 1);

            if (i >= nums1.length) {
                mergedNums[mergedIdx] = nums2[realJ];
                ++j;
                ++mergedIdx;
                continue;
            }

            if (j >= nums2.length) {
                mergedNums[mergedIdx] = nums1[realI];
                ++mergedIdx;
                ++i;
                continue;
            }

            int iVal = nums1[realI];
            int jVal = nums2[realJ];

            if (iVal == jVal) {
                mergedNums[mergedIdx] = iVal;
                ++mergedIdx;
                mergedNums[mergedIdx] = jVal;
                ++mergedIdx;
                ++i;
                ++j;
                continue;
            }

            if (iVal > jVal) {
                mergedNums[mergedIdx] = jVal;
                ++mergedIdx;
                ++j;
                continue;
            }

            if (iVal < jVal) {
                mergedNums[mergedIdx] = iVal;
                ++mergedIdx;
                ++i;
            }
        }

        int mergedSize = mergedNums.length;
        int medianIdx = (mergedSize + 1) / 2 - 1;

        if (mergedSize % 2 == 1) {
            median = mergedNums[medianIdx];
        } else {
            medianIdx = mergedIdx / 2;
            median = (mergedNums[medianIdx] + mergedNums[medianIdx - 1]) / 2.0;
        }

        return median;
    }
}

