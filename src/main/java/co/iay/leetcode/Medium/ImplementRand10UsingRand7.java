package co.iay.leetcode.Medium;

import java.util.Random;

/**
 * 470. Implement Rand10() Using Rand7()
 * https://leetcode.com/problems/implement-rand10-using-rand7/
 * Given a function rand7 which generates a uniform random integer in the range 1 to 7, write a function rand10 which generates a uniform random integer in the range 1 to 10.
 * <p>
 * Do NOT use system's Math.random().
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: [7]
 * Example 2:
 * <p>
 * Input: 2
 * Output: [8,4]
 * Example 3:
 * <p>
 * Input: 3
 * Output: [8,1,10]
 * <p>
 * <p>
 * Note:
 * <p>
 * rand7 is predefined.
 * Each testcase has one argument: n, the number of times that rand10 is called.
 * <p>
 * <p>
 * Follow up:
 * <p>
 * What is the expected value for the number of calls to rand7() function?
 * Could you minimize the number of calls to rand7()?
 */
public class ImplementRand10UsingRand7 {
    private Random random = new Random();

    private int rand7() {
        return random.nextInt(7);
    }

    public int rand10() {
        while (true) {
            int v = (rand7() - 1) * 7 + rand7();

            if (v > 40) {
                continue;
            }

            return v % 10 + 1;
        }
    }
}
