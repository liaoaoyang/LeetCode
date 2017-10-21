package co.iay.leetcode.Medium;

/**
 * 319. Bulb Switcher
 * https://leetcode.com/problems/bulb-switcher/
 * <p>
 * There are n bulbs that are initially off. You first turn on all the bulbs.
 * Then, you turn off every second bulb. On the third round, you toggle every
 * third bulb (turning on if it's off or turning off if it's on).
 * For the ith round, you toggle every i bulb. For the nth round,
 * you only toggle the last bulb. Find how many bulbs are on after n rounds.
 * <p>
 * Example:
 * <p>
 * Given n = 3.
 * <p>
 * At first, the three bulbs are [off, off, off].
 * After first round, the three bulbs are [on, on, on].
 * After second round, the three bulbs are [on, off, on].
 * After third round, the three bulbs are [on, off, off].
 * <p>
 * So you should return 1, because there is only one bulb is on.
 * Solution:
 * 前提1，一个灯泡每次改变到相反的状态。
 * 前提2，一个灯泡能被多次改变，要求这个灯泡的位置是多个数字的公倍数。
 * 如灯泡36，当操作次数为(1,36)(2,18)(3,12)(4,9)时灯泡会被改变为与之前相反的状态，即会处于灭掉的状态。
 * 然而在第6次改变之后，因为不会第二次改变同一倍数的编号的灯泡，所以灯泡的状态会被设置为亮的状态。
 * 由此观之，其实就是查找题目中平方数的个数。
 */
public class BulbSwitcher {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
