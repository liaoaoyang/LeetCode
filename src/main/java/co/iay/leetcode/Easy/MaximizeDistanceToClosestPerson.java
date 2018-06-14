package co.iay.leetcode.Easy;

/**
 * 849. Maximize Distance to Closest Person
 * In a row of seats, 1 represents a person sitting in that seat,
 * and 0 represents that the seat is empty.
 * <p>
 * There is at least one empty seat, and at least one person sitting.
 * <p>
 * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
 * <p>
 * Return that maximum distance to closest person.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,0,0,0,1,0,1]
 * Output: 2
 * Explanation:
 * If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
 * If Alex sits in any other open seat, the closest person has distance 1.
 * Thus, the maximum distance to the closest person is 2.
 * Example 2:
 * <p>
 * Input: [1,0,0,0]
 * Output: 3
 * Explanation:
 * If Alex sits in the last seat, the closest person is 3 seats away.
 * This is the maximum distance possible, so the answer is 3.
 * Note:
 * <p>
 * 1 <= seats.length <= 20000
 * seats contains only 0s or 1s, at least one 0, and at least one 1.
 * Solution:
 * 分三种情况，[0,0,0,1][1,0,0,0][1,0,0,0,1]
 * 只需要判断前置0的个数，后置0个数，两个1之间的0的个数的一半即可，两个1之间取一半是因为左右都是人，只能取中间
 */
public class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int maxDist = 0;
        int maxDistStart = 0;
        int maxDistEnd = 0;
        int nowDist = 0;
        int first1Index = 0;

        while (first1Index < seats.length && seats[first1Index] != 1) {
            ++first1Index;
            maxDistStart++;
        }

        for (int i = seats.length - 1; i > first1Index && seats[i] != 1; --i) {
            maxDistEnd++;
        }

        if (first1Index == seats.length) {
            return seats.length;
        }

        for (int i = first1Index; i < seats.length; ++i, ++nowDist) {
            if (seats[i] == 1) {
                maxDist = Math.max(maxDist, nowDist);
                nowDist = 0;
            }
        }

        maxDist = Math.max(maxDist, nowDist);

        return Math.max(Math.max(maxDistStart, maxDist / 2), maxDistEnd);
    }
}
