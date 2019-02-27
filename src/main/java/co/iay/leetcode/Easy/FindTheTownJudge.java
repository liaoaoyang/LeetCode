package co.iay.leetcode.Easy;

/**
 * 997. Find the Town Judge
 * https://leetcode.com/problems/find-the-town-judge/
 * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
 * <p>
 * If the town judge exists, then:
 * <p>
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
 * <p>
 * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: N = 2, trust = [[1,2]]
 * Output: 2
 * Example 2:
 * <p>
 * Input: N = 3, trust = [[1,3],[2,3]]
 * Output: 3
 * Example 3:
 * <p>
 * Input: N = 3, trust = [[1,3],[2,3],[3,1]]
 * Output: -1
 * Example 4:
 * <p>
 * Input: N = 3, trust = [[1,2],[2,3]]
 * Output: -1
 * Example 5:
 * <p>
 * Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
 * Output: 3
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 1000
 * trust.length <= 10000
 * trust[i] are all different
 * trust[i][0] != trust[i][1]
 * 1 <= trust[i][0], trust[i][1] <= N
 */
public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int[] t = new int[N];
        int[] bt = new int[N];

        for (int[] tt : trust) {
            t[tt[0] - 1] = 1;
            bt[tt[1] - 1]++;
        }

        int judge = 0;
        int judgeIndex = -1;

        for (int i = 0; i < t.length; ++i) {
            if (t[i] == 0) {
                ++judge;

                if (judge > 1) {
                    return -1;
                }

                judgeIndex = i;
            }
        }

        return judgeIndex > 0 && bt[judgeIndex] == N - 1 ? judgeIndex + 1 : -1;
    }
}
