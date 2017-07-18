package co.iay.leetcode.Medium;

import java.util.Random;

/**
 * Created by ng on 2017/7/18.
 * 384. Shuffle an Array
 * https://leetcode.com/problems/shuffle-an-array/
 */
public class ShuffleAnArray {
    private int[] oriNums;
    private int[] shuffledNums;
    private Random random;

    public ShuffleAnArray(int[] nums) {
        oriNums = new int[nums.length];
        shuffledNums = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            oriNums[i] = nums[i];
            shuffledNums[i] = nums[i];
        }

        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        if (oriNums == null || shuffledNums == null) {
            return null;
        }

        for (int i = 0; i < oriNums.length; ++i) {
            shuffledNums[i] = oriNums[i];
        }

        return shuffledNums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < shuffledNums.length; ++i) {
            int idx = random.nextInt(i + 1);

            if (idx >= 0 && idx < shuffledNums.length) {
                int tmp = shuffledNums[idx];
                shuffledNums[idx] = shuffledNums[i];
                shuffledNums[i] = tmp;
            }
        }

        return shuffledNums;
    }
}
