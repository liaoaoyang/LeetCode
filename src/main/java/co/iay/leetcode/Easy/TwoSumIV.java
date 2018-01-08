package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.HashSet;

/**
 * 653. Two Sum IV - Input is a BST
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 * Given a Binary Search Tree and a target number,
 * return true if there exist two elements in the BST
 * such that their sum is equal to the given target.
 * <p>
 * Example 1:
 * Input:
 * 5
 * / \
 * 3   6
 * / \   \
 * 2   4   7
 * <p>
 * Target = 9
 * <p>
 * Output: True
 * Example 2:
 * Input:
 * 5
 * / \
 * 3   6
 * / \   \
 * 2   4   7
 * <p>
 * Target = 28
 * <p>
 * Output: False
 * Solution:
 * 遍历所有数字，使用一个集合，保证数字不能重复。之后判断当前数字是否有对应的数字在树中存在。
 * 假设A+B=c，如果遍历到A发现B不在集合中，那么将A加入到集合中，然后当遍历到B时就会发现A也在集合之中。
 * 返回为真，其他情况返回假。
 */
public class TwoSumIV {
    private boolean travel(TreeNode root, int k, HashSet<Integer> s) {
        if (root == null) {
            return false;
        }

        if (s.contains(k - root.val)) {
            return true;
        }

        s.add(root.val);

        return travel(root.left, k, s) || travel(root.right, k, s);
    }

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> s = new HashSet<Integer>();

        return travel(root, k, s);
    }
}
