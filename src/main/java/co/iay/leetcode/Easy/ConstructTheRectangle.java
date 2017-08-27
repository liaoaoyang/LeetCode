package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/1/22.
 */
public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int l = (int) Math.ceil(Math.sqrt(area));

        for (; l <= area; ++l) {
            if (area % l == 0) {
                break;
            }
        }

        int w = l;

        for (; w > 1; --w) {
            if (l * w == area) {
                return new int[]{l, w};
            }
        }

        return new int[]{l, w};
    }
}
