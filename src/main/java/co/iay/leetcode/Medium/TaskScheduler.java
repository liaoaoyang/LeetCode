package co.iay.leetcode.Medium;

/**
 * Created by ng on 2017/7/7.
 * 621. Task Scheduler
 * https://leetcode.com/problems/task-scheduler/
 * <p>
 * Given a char array representing tasks CPU need to do.
 * It contains capital letters A to Z where different letters
 * represent different tasks.Tasks could be done without original order.
 * Each task could be done in one interval. For each interval,
 * CPU could finish one task or just be idle.
 * <p>
 * However, there is a non-negative cooling interval n that means between two same tasks,
 * there must be at least n intervals that CPU are doing different tasks or just be idle.
 * <p>
 * You need to return the least number of intervals
 * the CPU will take to finish all the given tasks.
 * <p>
 * Example 1:
 * Input: tasks = ['A','A','A','B','B','B'], n = 2
 * Output: 8
 * Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
 * Note:
 * The number of tasks is in the range [1, 10000].
 * The integer n is in the range [0, 100].
 * <p>
 * Solution:
 * 如果要两个相同任务之间至少间隔n个任务，每个任务都要执行，那么出现频次最高的任务次数假设为 maxTaskCount，
 * 那么两个相同任务之间至少会存在 maxTaskCount - 1 个宽度为n的间隔。
 * 下面要做的，就是向这些间隔填充各个任务和 idle 了。
 * 这些间隙的总数是 needInterval 个，即间隙个数 part 与间隙宽度 partLength 的乘积。
 * 如果有多个任务出现次数相同，并且都是最大值，假设这样的任务个数为 maxTaskOccurred，
 * 由于有多个相同的最大个数任务，每个间隙都可以安排对应的任务，所以间隙的宽度可以减少为 n - maxTaskOccurred + 1。
 * 当 maxTaskOccurred 大于 n 时，说明每一个间隙都有足够的任务进行填充，
 * 可以将个数为达到最大值的任务补充到已达到最大值的序列中，形如 3A 3B 3C 2D, n = 2 这样的组合，可以安排出：
 * ABCD|ABCD|ABC
 * 刨去最大值的任务个数，就能知道还有多少任务可以填充到间隙，即 taskToFill，
 * 那么一切都明了了，整个任务带上空闲任务所需时间片个数就是任务长度加上还需要填充的空闲个数。
 * 时间复杂度O(n)，空间复杂度O(1)，即常数级。
 */
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }

        int[] charsCount = new int[26];
        int maxTaskCount = 0;
        int maxTaskOccurred = 0;

        for (int i = 0; i < tasks.length; ++i) {
            int index = tasks[i] - 'A';
            charsCount[index]++;

            if (charsCount[index] == maxTaskCount) {
                maxTaskOccurred++;
            }

            if (charsCount[index] > maxTaskCount) {
                maxTaskCount = charsCount[index];
                maxTaskOccurred = 1;
            }
        }

        int part = maxTaskCount - 1;
        int partLength = n - maxTaskOccurred + 1;
        int needInterval = part * partLength;
        int taskToFill = tasks.length - maxTaskCount * maxTaskOccurred;
        return tasks.length + Math.max(0, needInterval - taskToFill);
    }
}
