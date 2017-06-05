package co.iay.leetcode.Easy;

/**
 * Created by ng on 2017/6/6.
 * 605. Can Place Flowers
 * https://leetcode.com/problems/can-place-flowers/
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (1 == flowerbed.length && 0 == flowerbed[0] && n <= 1) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; ) {
            if (flowerbed[i] == 1) {
                i += 2;
                continue;
            }

            if (i + 1 < flowerbed.length && flowerbed[i + 1] == 0) {
                n--;

                if (n <= 0) {
                    return true;
                }

                i += 2;
                continue;
            }

            if (i == flowerbed.length - 1 && i - 1 >= 0 && flowerbed[i - 1] == 0) {
                n--;
            }

            i++;
        }

        return n <= 0;
    }
}
