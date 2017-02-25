package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 17/2/25.
 * 496. Next Greater Element I
 * https://leetcode.com/problems/next-greater-element-i
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        if (findNums.length == 0) {
            return new int[]{};
        }

        int[] maxNumAfterN = new int[nums.length];
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        maxNumAfterN[nums.length - 1] = nums[nums.length - 1];
        m.put(nums[nums.length - 1], nums.length - 1);

        for (int i = nums.length - 2; i >= 0; --i) {
            maxNumAfterN[i] = (nums[i] > maxNumAfterN[i + 1] ? nums[i] : maxNumAfterN[i + 1]);
            m.put(nums[i], i);
        }

        maxNumAfterN[nums.length - 1] = -1;

        int j = 0;
        int[] result = new int[findNums.length];

        for (int n : findNums) {
            int i = m.get(n);

            if (maxNumAfterN[i] <= n) {
                result[j] = -1;
            } else {
                for (int k = i + 1; k <= nums.length - 1; ++k) {
                    if (nums[k] > n) {
                        result[j] = nums[k];
                        break;
                    }
                }
            }

            ++j;
        }

        return result;
    }
}
