package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 113. Path Sum II
 * https://leetcode.com/problems/path-sum-ii/
 * <p>
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * <p>
 * For example:
 * Given the below binary tree and sum = 22,
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \    / \
 * 7    2  5   1
 * return
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 * <p>
 * Solution:
 * 本题要求记录结果，并且没有约束各个节点当中的数字，所以需要注意的是目标值可能有正数负数和零。
 * 常规遍历树，记录路径，当找到满足条件的结果集时，生成结果，加入结果集。
 */

public class PathSumII {
    private List<List<Integer>> result;
    private List<Integer> nowList;

    private void travel(TreeNode root, int sum, int nowSum) {
        if (root == null) {
            return;
        }

        nowList.add(root.val);

        // 必须已经到达叶子节点
        if (root.val + nowSum == sum && root.left == null && root.right == null) {
            result.add(new ArrayList<Integer>(nowList));
            nowList.remove(nowList.size() - 1);
            return;
        }

        travel(root.left, sum, nowSum + root.val);
        travel(root.right, sum, nowSum + root.val);
        nowList.remove(nowList.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        result = new ArrayList<List<Integer>>();
        nowList = new ArrayList<Integer>();
        travel(root, sum, 0);
        return result;
    }
}
