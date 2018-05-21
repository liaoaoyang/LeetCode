package co.iay.leetcode.Easy;

/**
 * 836. Rectangle Overlap
 * https://leetcode.com/problems/rectangle-overlap/
 * A rectangle is represented as a list [x1, y1, x2, y2],
 * where (x1, y1) are the coordinates of its bottom-left corner,
 * and (x2, y2) are the coordinates of its top-right corner.
 * <p>
 * Two rectangles overlap if the area of their intersection is positive.
 * To be clear, two rectangles that only touch at the corner or edges do not overlap.
 * <p>
 * Given two rectangles, return whether they overlap.
 * <p>
 * Example 1:
 * <p>
 * Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
 * Output: true
 * Example 2:
 * <p>
 * Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
 * Output: false
 * Notes:
 * <p>
 * Both rectangles rec1 and rec2 are lists of 4 integers.
 * All coordinates in rectangles will be between -10^9 and 10^9.
 */
public class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        long minX = Math.max(rec1[0], rec2[0]);
        long maxX = Math.min(rec1[2], rec2[2]);
        long minY = Math.max(rec1[1], rec2[1]);
        long maxY = Math.min(rec1[3], rec2[3]);

        return minX <= maxX && minY <= maxY && ((maxX - minX) * (maxY - minY) > 0);
    }
}
